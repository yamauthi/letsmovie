package br.com.yamauthi.letsmovie.data.model

import com.google.gson.annotations.SerializedName

data class ConfigurationResponse (@SerializedName("images")
                                  var imageConfig: ImageConfiguration)

data class ImageConfiguration (@SerializedName("base_url") var imageBaseUrl: String)