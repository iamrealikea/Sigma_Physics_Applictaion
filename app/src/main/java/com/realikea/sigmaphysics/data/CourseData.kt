package com.realikea.sigmaphysics.data.course

import androidx.annotation.StringRes
import com.realikea.sigmaphysics.R

val courseData = listOf<Pair<Int, Int>>(
    R.string.chapter_1 to R.string.description_1,
    R.string.chapter_2 to R.string.description_2,
    R.string.chapter_3 to R.string.description_3,
    R.string.chapter_4 to R.string.description_4,
    R.string.chapter_5 to R.string.description_5
).map { CourseData(it.first, it.second) }

data class CourseData(
    @StringRes val chapter : Int,
    @StringRes val description : Int,
    //val learn : Boolean?
)


