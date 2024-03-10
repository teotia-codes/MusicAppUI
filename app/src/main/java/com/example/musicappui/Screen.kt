package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title:String, val route:String) {


    sealed class BottomScreen(val bTitle: String, val bRoute: String, @DrawableRes val icon:Int): Screen(bTitle,bRoute){

        object Home: BottomScreen("Home","home",R.drawable.baseline_music_video_24 )
        object Library:BottomScreen("Library","library",R.drawable.baseline_video_library_24)
        object Browse:BottomScreen("Browse","browse", R.drawable.baseline_apps_24)
    }
  sealed class DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val icon:Int)
      : Screen(dTitle,dRoute){
          object Acccount: DrawerScreen(
              "Account",
              "account",
              R.drawable.ic_account
          )
      object Subscription: DrawerScreen(
          "Subscription",
          "subscribe",
          R.drawable.ic_subscribe
      )
      object AddAccount: DrawerScreen(
          "Add Account",
          "add_account",
          R.drawable.baseline_person_add_alt_1_24
      )
      }

}
val screeninBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)
val screensinDrawer = listOf(
    Screen.DrawerScreen.Acccount,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)