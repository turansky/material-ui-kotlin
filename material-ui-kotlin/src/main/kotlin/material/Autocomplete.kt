// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/Autocomplete")
@file:JsNonModule

package material

external interface AutocompleteProps : react.RProps {
    /**
     * Props applied to the [`Chip`](/api/chip/) element.
     */
    var ChipProps: dynamic

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The icon to display in place of the default clear icon.
     * @default <ClearIcon fontSize="small" />
     */
    var clearIcon: react.ReactNode

    /**
     * Override the default text for the *clear* icon button.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @default 'Clear'
     */
    var clearText: String

    /**
     * Override the default text for the *close popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @default 'Close'
     */
    var closeText: String

    /**
     * The props used for each slot inside.
     * @default {}
     */
    var componentsProps: dynamic

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean

    /**
     * If `true`, the `Popper` content will be under the DOM hierarchy of the parent component.
     * @default false
     */
    var disablePortal: Boolean

    /**
     * Force the visibility display of the popup icon.
     * @default 'auto'
     */
    var forcePopupIcon: dynamic

    /**
     * If `true`, the input will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean

    /**
     * The label to display when the tags are truncated (`limitTags`).
     *
     * @param {number} more The number of truncated tags.
     * @returns {ReactNode}
     * @default (more) => `+${more}`
     */
    var getLimitTagsText: dynamic

    /**
     * The component used to render the listbox.
     * @default 'ul'
     */
    var ListboxComponent: dynamic

    /**
     * Props applied to the Listbox element.
     */
    var ListboxProps: dynamic

    /**
     * If `true`, the component is in a loading state.
     * This shows the `loadingText` in place of suggestions (only if there are no suggestions to show, e.g. `options` are empty).
     * @default false
     */
    var loading: Boolean

    /**
     * Text to display when in a loading state.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @default 'Loading…'
     */
    var loadingText: react.ReactNode

    /**
     * The maximum number of tags that will be visible when not focused.
     * Set `-1` to disable the limit.
     * @default -1
     */
    var limitTags: Number

    /**
     * Text to display when there are no options.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @default 'No options'
     */
    var noOptionsText: react.ReactNode

    /**
     * Override the default text for the *open popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @default 'Open'
     */
    var openText: String

    /**
     * The component used to render the body of the popup.
     * @default Paper
     */
    var PaperComponent: dynamic

    /**
     * The component used to position the popup.
     * @default Popper
     */
    var PopperComponent: dynamic

    /**
     * The icon to display in place of the default popup icon.
     * @default <ArrowDropDownIcon />
     */
    var popupIcon: react.ReactNode

    /**
     * Render the group.
     *
     * @param {any} option The group to render.
     * @returns {ReactNode}
     */
    var renderGroup: dynamic

    /**
     * Render the input.
     *
     * @param {object} params
     * @returns {ReactNode}
     */
    var renderInput: dynamic

    /**
     * Render the option, use `getOptionLabel` by default.
     *
     * @param {object} props The props to apply on the li element.
     * @param {T} option The option to render.
     * @param {object} state The state of the component.
     * @returns {ReactNode}
     */
    var renderOption: dynamic

    /**
     * Render the selected value.
     *
     * @param {T[]} value The `value` provided to the component.
     * @param {function} getTagProps A tag props getter.
     * @returns {ReactNode}
     */
    var renderTags: dynamic

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}
