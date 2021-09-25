// Automatically generated - do not modify!

@file:JsModule("@mui/material/Checkbox")
@file:JsNonModule

package mui.material

external interface CheckboxProps : react.Props {
    /**
     * If `true`, the component is checked.
     */
    var checked: dynamic /* SwitchBaseProps['checked'] */

    /**
     * The icon to display when the component is checked.
     * @default <CheckBoxIcon />
     */
    var checkedIcon: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CheckboxClasses

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: Union /* 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning' | 'default', CheckboxPropsColorOverrides */

    /**
     * If `true`, the component is disabled.
     */
    var disabled: dynamic /* SwitchBaseProps['disabled'] */

    /**
     * If `true`, the ripple effect is disabled.
     */
    var disableRipple: dynamic /* SwitchBaseProps['disableRipple'] */

    /**
     * The icon to display when the component is unchecked.
     * @default <CheckBoxOutlineBlankIcon />
     */
    var icon: react.ReactNode

    /**
     * The id of the `input` element.
     */
    var id: dynamic /* SwitchBaseProps['id'] */

    /**
     * If `true`, the component appears indeterminate.
     * This does not set the native input element to indeterminate due
     * to inconsistent behavior across browsers.
     * However, we set a `data-indeterminate` attribute on the `input`.
     * @default false
     */
    var indeterminate: Boolean

    /**
     * The icon to display when the component is indeterminate.
     * @default <IndeterminateCheckBoxIcon />
     */
    var indeterminateIcon: react.ReactNode

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
     */
    var inputProps: dynamic /* SwitchBaseProps['inputProps'] */

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: react.Ref<org.w3c.dom.HTMLInputElement>

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: dynamic /* SwitchBaseProps['onChange'] */

    /**
     * If `true`, the `input` element is required.
     */
    var required: dynamic /* SwitchBaseProps['required'] */

    /**
     * The size of the component.
     * `small` is equivalent to the dense checkbox styling.
     * @default 'medium'
     */
    var size: Union /* 'small' | 'medium', CheckboxPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The value of the component. The DOM API casts this to a string.
     * The browser uses "on" as the default value.
     */
    var value: dynamic /* SwitchBaseProps['value'] */
}

/**
 *
 * Demos:
 *
 * - [Checkboxes](https://mui.com/components/checkboxes/)
 * - [Transfer List](https://mui.com/components/transfer-list/)
 *
 * API:
 *
 * - [Checkbox API](https://mui.com/api/checkbox/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val Checkbox: react.FC<CheckboxProps>