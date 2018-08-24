package br.com.yamauthi.letsmovie.data.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class Movie (@SerializedName("id") var id: String,
                  @SerializedName("backdrop_path") var backdropPath: String,
                  @SerializedName("video") var hasVideo: Boolean,
                  @SerializedName("overview") var overview: String,
                  @SerializedName("poster_path") var posterPath: String,
                  @SerializedName("release_date") var releaseDate: Date,
                  @SerializedName("title") var title: String)
