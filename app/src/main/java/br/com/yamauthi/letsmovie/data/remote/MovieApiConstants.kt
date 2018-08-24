package br.com.yamauthi.letsmovie.data.remote

class MovieApiConstants {
    companion object {
        const val API_KEY = "?api_key=7acd601096abc4e3a7032d5ade25c151"
        const val BASE_URL = "http://api.themoviedb.org/3/"
        const val CONFIGURATION_ENDPOINT = BASE_URL + "configuration" + API_KEY
        const val MOVIE_DISCOVER_ENDPOINT =
                BASE_URL + "discover/movie" + API_KEY + "&sort_by=popularity.desc"
        const  val MOVIE_ENDPOINT = BASE_URL + "movie/" + API_KEY + "&sort_by=popularity.desc"
        const  val MOVIE_VIDEOS_SOURCE = "/videos"

    }
}