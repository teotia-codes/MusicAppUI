package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon : Int , val name: String)
 val libraries = listOf<Lib>(
     Lib(R.drawable.baseline_playlist_add_circle_24,"Playlist"),
     Lib(R.drawable.baseline_local_fire_department_24,"Artists"),
     Lib(R.drawable.baseline_album_24,"Album"),
     Lib(R.drawable.baseline_music_note_24,"Songs"),
     Lib(R.drawable.baseline_movie_filter_24,"Genre")
 )

