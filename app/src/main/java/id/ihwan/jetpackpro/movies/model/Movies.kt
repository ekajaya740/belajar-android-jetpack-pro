package id.ihwan.jetpackpro.movies.model

import id.ihwan.jetpackpro.R
//TODO : Menerapkan ViewModel, LiveData dan Repository
data class Movies(
        val id : Int = 0,
        val title : String = "",
        val director: String = "",
        val description : String = "",
        val image : Int = R.color.colorPrimaryDark,
        val date : String = "",
        val rating : String = ""
)