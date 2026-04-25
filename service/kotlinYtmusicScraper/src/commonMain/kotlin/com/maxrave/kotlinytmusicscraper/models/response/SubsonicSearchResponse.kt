package com.maxrave.kotlinytmusicscraper.models.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SubsonicSearchResponse(
    @SerialName("subsonic-response")
    val subsonicResponse: SubsonicResponse? = null
) {
    @Serializable
    data class SubsonicResponse(
        @SerialName("status")
        val status: String? = null,
        @SerialName("searchResult3")
        val searchResult3: SearchResult3? = null
    ) {
        @Serializable
        data class SearchResult3(
            @SerialName("song")
            val song: List<Song>? = null
        ) {
            @Serializable
            data class Song(
                @SerialName("id")
                val id: String? = null,
                @SerialName("title")
                val title: String? = null,
                @SerialName("artist")
                val artist: String? = null,
                @SerialName("duration")
                val duration: Int? = null
            )
        }
    }
}
