package com.hongbeomi.harrypotter.ui

/**
 * Copyright 2020 Hongbeom Ahn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **/

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import com.hongbeomi.harrypotter.R

enum class HouseType(@DrawableRes val logo: Int, @ColorRes val color: Int) {
    Gryffindor(R.drawable.logo_gryffindor, R.color.red900dark),
    Slytherin(R.drawable.logo_slytherin, R.color.green900dark),
    Ravenclaw(R.drawable.logo_ravenclaw, R.color.blue900dark),
    Hufflepuff(R.drawable.logo_hufflepuff, R.color.yellowA700dark)
}