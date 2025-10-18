import requests
from bs4 import BeautifulSoup
import csv

# Step 1: Fetch the webpage
url = "https://www.bbc.com/news"
# url = "https://www.abc.net.au/news/"
# url = "https://www.bbc.com/news/world"
response = requests.get(url)
soup = BeautifulSoup(response.text, "html.parser")

# Step 2: Try to capture all text headlines
headlines = []

# BBC sometimes uses <h2>, <h3>, or <span> for headlines
for tag in soup.find_all(["h2", "h3", "span"]):
    text = tag.get_text(strip=True)
    if text and len(text.split()) > 3:  # avoid short or useless text
        headlines.append(text)

# Step 3: Save to CSV
with open("headlines.csv", "w", newline="", encoding="utf-8") as file:
    writer = csv.writer(file)
    writer.writerow(["S.No", "Headline"])
    for i, h in enumerate(headlines[:15], start=1):  # Top 15
        writer.writerow([i, h])

print("✅ Headlines scraped and saved into 'headlines.csv'")