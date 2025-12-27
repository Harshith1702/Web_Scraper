# Web Scraping Projects (Java & Python)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)

Simple beginner-friendly web scraping examples implemented in **Java** and **Python**.

These projects demonstrate how to fetch web pages, parse HTML, extract useful text, and store results in CSV files.  
For educational and learning purposes only.

---

## Projects Overview

| # | **File**            | **Language** | **Target Website**             | **Output File** | **Libraries Used**          |
|---|---------------------|--------------|--------------------------------|------------------|-----------------------------|
| 1 | WebScraper.java     | Java         | http://quotes.toscrape.com     | quotes.csv       | Jsoup                       |
| 2 | news.py             | Python       | https://www.bbc.com/news       | headlines.csv    | requests, BeautifulSoup     |

---

## Project 1: WebScraper.java – Quotes Scraper

This Java program scrapes quotes from a public website and stores them in a CSV file.

### Features
- Fetches quotes from quotes.toscrape.com
- Cleans special quotation characters
- Adds serial number for each entry
- Adds timestamp of scraping
- Saves data into a CSV file

### Output Format
S.No,Quote,ScrapedAt  
1,"Life is what happens...",2025-04-10 14:35:22  
...

---

## Project 2: news.py – BBC News Headlines Scraper

This Python script extracts news headlines from the BBC News website.

### Features
- Fetches webpage using requests
- Parses HTML using BeautifulSoup
- Extracts headlines from multiple heading tags
- Filters out short or irrelevant text
- Saves top 15 headlines to a CSV file

### Output Format
S.No,Headline  
1,New climate agreement reached in summit  
2,...

---

## Technologies Used

- Java with Jsoup
- Python with requests
- Python with beautifulsoup4
- CSV file handling

---

## How to Run

### Java Program
1. Download Jsoup from https://jsoup.org/download  
2. Compile the program  
   javac WebScraper.java  
3. Run the program  
   java WebScraper  

Output file:  
quotes.csv

---

### Python Script
Install dependencies:
pip install requests beautifulsoup4  

Run the script:
python news.py  

Output file:
headlines.csv

---

## Project Structure
```
web-scraping-projects/
├── README.md
├── WebScraper.java
├── news.py
├── quotes.csv        (generated)
└── headlines.csv     (generated)
```

---

## Legal & Ethical Notice

These examples are created strictly for **educational purposes**.

Always ensure you:
- Respect website `robots.txt`
- Follow website Terms of Service
- Do not scrape protected or personal data
- Use rate limiting and delays in real-world projects

---

## Status

Project completed and stable for learning and demonstration purposes.
