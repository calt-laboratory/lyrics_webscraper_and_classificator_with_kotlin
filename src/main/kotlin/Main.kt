package org.example


suspend fun main() {
    val lyricsWebScraper = LyricsWebScraper()
    val result = lyricsWebScraper.scrapeURL(url = "https://www.lyrics.com/")
    println(result)
}