package com.pramanth.bookingui.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pramanth.bookingui.R

val Poppins = FontFamily(
    Font(R.font.poppins_black, weight = FontWeight.Black),
    Font(R.font.poppins_black_italic, weight = FontWeight.Black, style = FontStyle.Italic),
    Font(R.font.poppins_bold, weight = FontWeight.Bold),
    Font(R.font.poppins_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),
    Font(R.font.poppins_extra_bold, weight = FontWeight.ExtraBold),
    Font(R.font.poppins_extra_bold_italic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
    Font(R.font.poppins_extra_light, weight = FontWeight.ExtraLight),
    Font(
        R.font.poppins_extra_light_italic,
        weight = FontWeight.ExtraLight,
        style = FontStyle.Italic
    ),
    Font(R.font.poppins_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(R.font.poppins_light, weight = FontWeight.Light),
    Font(R.font.poppins_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(R.font.poppins_medium, weight = FontWeight.Medium),
    Font(R.font.poppins_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(R.font.poppins_regular, weight = FontWeight.Normal),
    Font(R.font.poppins_semi_bold, weight = FontWeight.SemiBold),
    Font(R.font.poppins_semi_bold_italic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
    Font(R.font.poppins_thin, weight = FontWeight.Thin),
    Font(R.font.poppins_thin_italic, weight = FontWeight.Thin, style = FontStyle.Italic),
)

// Set of Material typography styles to start with
val Typography = Typography(defaultFontFamily = Poppins)