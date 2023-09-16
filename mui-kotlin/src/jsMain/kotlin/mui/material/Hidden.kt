// Automatically generated - do not modify!

@file:JsModule("@mui/material/Hidden")

package mui.material

external interface HiddenProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Specify which implementation to use.  'js' is the default, 'css' works better for
     * server-side rendering.
     * @default 'js'
     */
    var implementation: HiddenImplementation?

    /**
     * You can use this prop when choosing the `js` implementation with server-side rendering.
     *
     * As `window.innerWidth` is unavailable on the server,
     * we default to rendering an empty component during the first mount.
     * You might want to use a heuristic to approximate
     * the screen width of the client browser screen width.
     *
     * For instance, you could be using the user-agent or the client-hints.
     * https://caniuse.com/#search=client%20hint
     */
    var initialWidth: dynamic

    /**
     * If `true`, component is hidden on screens below (but not including) this size.
     * @default false
     */
    var lgDown: Boolean?

    /**
     * If `true`, component is hidden on screens this size and above.
     * @default false
     */
    var lgUp: Boolean?

    /**
     * If `true`, component is hidden on screens below (but not including) this size.
     * @default false
     */
    var mdDown: Boolean?

    /**
     * If `true`, component is hidden on screens this size and above.
     * @default false
     */
    var mdUp: Boolean?

    /**
     * Hide the given breakpoint(s).
     */
    var only: dynamic

    /**
     * If `true`, component is hidden on screens below (but not including) this size.
     * @default false
     */
    var smDown: Boolean?

    /**
     * If `true`, component is hidden on screens this size and above.
     * @default false
     */
    var smUp: Boolean?

    /**
     * If `true`, component is hidden on screens below (but not including) this size.
     * @default false
     */
    var xlDown: Boolean?

    /**
     * If `true`, component is hidden on screens this size and above.
     * @default false
     */
    var xlUp: Boolean?

    /**
     * If `true`, component is hidden on screens below (but not including) this size.
     * @default false
     */
    var xsDown: Boolean?

    /**
     * If `true`, component is hidden on screens this size and above.
     * @default false
     */
    var xsUp: Boolean?
}

/**
 * Responsively hides children based on the selected implementation.
 *
 * Demos:
 *
 * - [Hidden](https://mui.com/material-ui/react-hidden/)
 *
 * API:
 *
 * - [Hidden API](https://mui.com/material-ui/api/hidden/)
 */
@JsName("default")
external val Hidden: react.FC<HiddenProps>
