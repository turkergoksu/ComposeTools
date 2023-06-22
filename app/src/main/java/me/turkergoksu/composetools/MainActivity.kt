package me.turkergoksu.composetools

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import me.turkergoksu.annotatedstringext.backgroundColor
import me.turkergoksu.annotatedstringext.bold
import me.turkergoksu.annotatedstringext.color
import me.turkergoksu.annotatedstringext.italic
import me.turkergoksu.annotatedstringext.scale
import me.turkergoksu.annotatedstringext.strikeThrough
import me.turkergoksu.annotatedstringext.subscript
import me.turkergoksu.annotatedstringext.superscript
import me.turkergoksu.annotatedstringext.underline
import me.turkergoksu.composetools.ui.theme.ComposeToolsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeToolsTheme {
                AnnotatedStringExample()
            }
        }
    }
}

@Composable
fun AnnotatedStringExample() {
    val text = buildAnnotatedString {
        append("Normal Text")
        appendLine()

        bold {
            append("Bold Green Text")
        }
        appendLine()

        italic {
            color(Color.Gray) {
                append("'Italic Gray Text'")
            }
        }
        appendLine()

        underline {
            bold {
                append("Underlined Bold Text")
            }
        }
        appendLine()

        strikeThrough {
            italic {
                append("StrikeThrough Italic Text")
            }
        }
        appendLine()

        color(Color.Red) {
            append("Colored Text")
        }
        appendLine()

        backgroundColor(Color.Yellow) {
            bold {
                append("Yellow Background Bold Text")
            }
        }
        appendLine()

        append("Really ")
        scale(24.sp) {
            append("Important")
        }
        append(" Text")
        appendLine()

        append("SuperScripted Text")
        superscript {
            append("123")
        }
        appendLine()

        append("SubScripted Text")
        subscript {
            append("123")
        }
        appendLine()
    }
    Text(text = text)
}

@Preview(showBackground = true)
@Composable
fun AnnotatedStringExamplePreview() = ComposeToolsTheme {
    AnnotatedStringExample()
}