package user

import common.Food

data class User(
    var username: String = "",
    var password: String = "",
    val food: Food? = null
)
