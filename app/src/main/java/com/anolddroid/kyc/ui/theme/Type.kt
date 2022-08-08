package com.anolddroid.kyc.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.anolddroid.kyc.R


private val Uchen = FontFamily(
        Font(R.font.uchen_regular, FontWeight.Normal),
)
val Typography = Typography(
        h3 = TextStyle(
                fontFamily = Uchen,
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 59.sp
        ),
        body1 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        ) ,
        h5 = TextStyle(
                fontFamily = Uchen,
                fontSize = 26.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 24.sp
        ),
        h6 = TextStyle(
                fontFamily = Uchen,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 24.sp
        ),
        subtitle1 = TextStyle(
                fontFamily = Uchen,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 24.sp,
                letterSpacing = 0.15.sp
        ),
        subtitle2 = TextStyle(
                fontFamily = Uchen,
                fontSize = 14.sp,
                fontWeight = FontWeight.Light,
                lineHeight = 24.sp,
                letterSpacing = 0.1.sp
        ),
        button = TextStyle(
                fontFamily = Uchen,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 16.sp,
                letterSpacing = 1.25.sp
        ),
)