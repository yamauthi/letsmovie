package br.com.yamauthi.letsmovie.data.remote

import br.com.yamauthi.letsmovie.data.model.ConfigurationResponse
import br.com.yamauthi.letsmovie.data.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MoviesApiService {

    @GET(MovieApiConstants.CONFIGURATION_ENDPOINT)
    fun getConfiguration() : Call<ConfigurationResponse>

    @GET(MovieApiConstants.MOVIE_DISCOVER_ENDPOINT)
    fun getMoviesByDiscover() : Call<List<Movie>>

}