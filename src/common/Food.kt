package common

import utlis.Dinner
import utlis.Launch

data class Food(var launch: Launch? = null,
                var dinner: Dinner? = null,
                var date: Date? = null)
