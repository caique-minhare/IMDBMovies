package com.example.cake.imdbmovies.model

import com.google.gson.annotations.SerializedName
import java.util.Date

class ApiMovie(
        @SerializedName("poster_path")
        val posterPath : String?,
        @SerializedName("adult")
        val adult : Boolean?,
        @SerializedName("overview")
        val overview : String?,
        @SerializedName("release_date")
        val releaseDate : Date?,
        @SerializedName("genre_ids")
        val genreId : List<Int>?,
        @SerializedName("id")
        val id : Int?,
        @SerializedName("original_title")
        val originalTitle : String?,
        @SerializedName("original_language")
        val originalLanguage : String?,
        @SerializedName("title")
        val title : String?,
        @SerializedName("backdrop_path")
        val backdropPath : String?,
        @SerializedName("popularity")
        val popularity : Double?,
        @SerializedName("vote_count")
        val voteCount : Int?,
        @SerializedName("video")
        val video : Boolean?,
        @SerializedName("vote_average")
        val voteAverage : Double?
)