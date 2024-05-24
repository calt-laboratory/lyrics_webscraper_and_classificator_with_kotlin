package org.example

import com.fleeksoft.ksoup.*
import com.fleeksoft.ksoup.network.parseGetRequest


class LyricsWebScraper {

    suspend fun scrapeURL(url: String) : String {

        val htmlContent = Ksoup.parseGetRequest(url = url)
        return htmlContent.toString()
    }
}