package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title:String, val route:String) {
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
