package com

import androidx.annotation.DrawableRes

data class Basketball (
    @DrawableRes val imageResources:Int,
    val name : String,
    val info : String,
    val researchArea:List<String> ) {
}



