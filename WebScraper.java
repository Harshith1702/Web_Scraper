import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WebScraper{
    public static void main(String[] args) {
        String url = "http://quotes.toscrape.com";  // target website
        String csvFilePath = "quotes.csv";           // output CSV file
        try (FileWriter writer = new FileWriter(csvFilePath)) {
            // Write header row
            writer.append("S.No,Quote,ScrapedAt\n");
            // Fetch the HTML page
            Document doc = Jsoup.connect(url).get();
            // Select quote elements
            Elements quotes = doc.select(".quote span.text");
            int rowCount = 1;
            for (Element quote : quotes) {
                String cleanQuote = quote.text()
                        .replace("“", "\"")
                        .replace("”", "\"")
                        .replace("’", "'")
                        .replace("‘", "'");
                // Escape quotes in CSV
                cleanQuote = "\"" + cleanQuote.replace("\"", "\"\"") + "\"";
                writer.append(rowCount + "," + cleanQuote + "," + new Date().toString() + "\n");
                rowCount++;
            }
            System.out.println("Scraping completed! Data saved to " + csvFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}