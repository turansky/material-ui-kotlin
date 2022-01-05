package com.github.turansky.mui

private val ALIAS_MAP = mapOf(
    "BackdropUnstyledTypeMap['props']['classes']" to "",
    "FilledInputProps['onChange']" to "react.dom.events.ChangeEventHandler<org.w3c.dom.HTMLElement>",
    "InputBaseProps['inputProps']" to "InputBaseComponentProps",
    "InputBaseProps['onBlur']" to "react.dom.events.FocusEventHandler<org.w3c.dom.HTMLElement>",
    "InputProps['inputProps']" to "InputBaseComponentProps",
    "ModalProps['container']" to "",
    "ModalProps['onBackdropClick']" to "",
    "ModalProps['onClose']" to "",
    "ModalProps['open']" to "",
    "NativeSelectInputProps['onChange']" to "",
    "OutlinedInputProps['onChange']" to "react.dom.events.ChangeEventHandler<org.w3c.dom.HTMLElement>",
    "PaperProps['role']" to "react.dom.aria.AriaRole",
    "PopoverProps['anchorEl']" to "(element: org.w3c.dom.Element) -> org.w3c.dom.Element",
    "PopoverProps['classes']" to "PopoverClasses",
    "PopoverProps['onClose']" to "",
    "PortalProps['container']" to "org.w3c.dom.Element",
    "PortalProps['disablePortal']" to "Boolean",
    "SelectInputProps<T>['onChange']" to "",
    "SnackbarContentProps['action']" to "react.ReactNode",
    "SnackbarContentProps['message']" to "react.ReactNode",
    "StandardInputProps['onChange']" to "",
    "StandardInputProps['onFocus']" to "",
    "StaticWrapperProps['displayStaticWrapperAs']" to "",
    "StyledGlobalStylesProps['styles']" to "",
    "SwitchBaseProps['checked']" to "Boolean",
    "SwitchBaseProps['disableRipple']" to "Boolean",
    "SwitchBaseProps['disabled']" to "Boolean",
    "SwitchBaseProps['id']" to "String",
    "SwitchBaseProps['inputProps']" to "react.dom.html.InputHTMLAttributes<org.w3c.dom.HTMLInputElement>",
    "SwitchBaseProps['onChange']" to "(event: react.dom.events.ChangeEvent<org.w3c.dom.HTMLInputElement>, checked: Boolean) -> Unit",
    "SwitchBaseProps['required']" to "Boolean",
    "SwitchBaseProps['value']" to "",
    "TableCellBaseProps['scope']" to "String",
    "TooltipProps['classes']" to "TooltipClasses",
    "TooltipProps['placement']" to "",
    "TransitionProps['easing']" to "",
    "TransitionProps['in']" to "",
    "TransitionProps['timeout']" to "",
    "TypographyProps['classes']" to "TypographyClasses",
    "TypographyProps['color']" to "",
    "TypographyProps['variant']" to "",
    "UsePaginationItem['type']" to "",

    "FormLabelProps['color']" to "FormLabelColor",
    "PaginationProps['color']" to "PaginationColor",
    "PaginationProps['size']" to "Size",
    "PaginationProps['shape']" to "PaginationShape",
    "PaginationProps['variant']" to "PaginationVariant",

    "Options['modifiers']" to "ReadonlyArray<popper.core.Modifier<*>>",
)

internal fun String.toAlias(): String? =
    ALIAS_MAP[this]
        ?.takeIf { it.isNotEmpty() }
