package com.github.turansky.mui

internal fun fixOverrides(
    name: String,
    content: String,
): String =
    when (name) {
        "ButtonBase",
        -> content
            .override("disabled")
            .override("tabIndex")

        "Button",
        "Fab",
        "IconButton",
        -> content
            .override("disabled")

        "ToggleButton",
        -> content
            .override("disabled")
            .override("value")

        "SwipeableDrawer",
        -> content
            .override("onClose")
            .override("open")
            .replace("open: Boolean", "open: Boolean?")

        else -> content
    }

private fun String.override(
    name: String,
): String =
    replaceFirst("var $name:", "override var $name:")
