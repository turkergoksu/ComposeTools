package me.turkergoksu.annotatedstringext

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit

inline fun <R : Any> AnnotatedString.Builder.bold(
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold), block)
}

inline fun <R : Any> AnnotatedString.Builder.italic(
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(fontStyle = FontStyle.Italic), block)
}

inline fun <R : Any> AnnotatedString.Builder.underline(
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline), block)
}

inline fun <R : Any> AnnotatedString.Builder.strikeThrough(
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(textDecoration = TextDecoration.LineThrough), block)
}

inline fun <R : Any> AnnotatedString.Builder.color(
    color: Color,
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(color = color), block)
}

inline fun <R : Any> AnnotatedString.Builder.backgroundColor(
    color: Color,
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(background = color), block)
}

inline fun <R : Any> AnnotatedString.Builder.scale(
    size: TextUnit,
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(fontSize = size), block)
}

inline fun <R : Any> AnnotatedString.Builder.superscript(
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(baselineShift = BaselineShift.Superscript), block)
}

inline fun <R : Any> AnnotatedString.Builder.subscript(
    block: AnnotatedString.Builder.() -> R
) {
    withStyle(style = SpanStyle(baselineShift = BaselineShift.Subscript), block)
}