package karakum.mui

internal fun fixOverrides(
    name: String,
    content: String,
): String =
    when (name) {
        "Autocomplete",
        -> content
            .override("disabled")
            .override("readOnly")
            .replaceFirst("var key: String", "override var key: react.Key? /* Key */")

        "Slider",
        -> content
            .override("classes")

        "Box",
        -> content
            .override("component")

        "ButtonBase",
        -> content
            .override("disabled")
            .override("tabIndex")

        "Dialog",
        -> content
            .override("disableEscapeKeyDown")
            .override("onBackdropClick")
            .override("onClose")
            .override("open")
            .replaceFirst("override var children:", "    /* override */ var children:")

        "Drawer",
        -> content
            .override("onClose")
            .replaceFirst("override var children:", "    /* override */ var children:")

        "Popover",
        -> content
            .override("container")
            .override("onClose")
            .override("open")
            .replaceFirst("override var children:", "    /* override */ var children:")

        "Button",
        "Fab",
        "IconButton",
        -> content
            .override("disabled")

        "ToggleButton",
        -> content
            .override("disabled")
            .override("value")

        "LoadingButton",
        -> content
            .override("classes")

        "SwipeableDrawer",
        -> content
            .override("open")
            .replace("open: Boolean", "open: Boolean?")

        "MultiSelectUnstyled",
        -> content
            .override("disabled")
            .replace("disabled: Boolean", "disabled: Boolean?")
            .replace("var component: dynamic", "var component: react.ElementType<*>?")

        "OptionUnstyled",
        -> content
            .replace("var component: dynamic", "var component: react.ElementType<*>?")

        "SelectUnstyled",
        -> content
            .replace("var component: dynamic", "var component: react.ElementType<*>?")
            .replaceLast("var disabled: Boolean?", "override var disabled: Boolean?")

        "TableCell",
        -> content
            .override("align")
            .override("scope")

        "SpeedDial",
        -> content
            .override("hidden")

        "TabUnstyled",
        -> content
            .override("components")
            .override("componentsProps")
            .replace(": Components?", ": ButtonUnstyledOwnProps.Components?")
            .replace(": ComponentsProps?", ": ButtonUnstyledOwnProps.ComponentsProps?")

        "MenuItem",
        "MenuList",
        -> content
            .override("autoFocus")

        "ModalUnstyled",
        -> content
            .replace("children: react.ReactElement<*>", "children: dynamic /* react.ReactElement<*> */")

        "MenuItemUnstyled",
        -> content
            .replace(
                "onClick: react.dom.events.MouseEventHandler<web.html.HTMLElement>?",
                "onClick: react.dom.events.MouseEventHandler<web.html.HTMLLIElement>?"
            )

        else -> content
    }

private fun String.override(
    name: String,
): String =
    replaceFirst("var $name:", "override var $name:")

private fun String.replaceLast(regex: String, replacement: String): String =
    replaceFirst("(?s)(.*)$regex".toRegex(), "$1$replacement")
