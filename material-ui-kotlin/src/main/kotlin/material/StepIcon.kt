// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/StepIcon")
@file:JsNonModule

package material

external interface StepIconProps : react.RProps {
    /**
     * Whether this step is active.
     */
    var active: Boolean

    /**
     * Mark the step as completed. Is passed to child components.
     */
    var completed: Boolean

    /**
     * Mark the step as failed.
     */
    var error: Boolean

    /**
     * The label displayed in the step icon.
     */
    var icon: react.ReactNode
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://material-ui.com/components/steppers/)
 *
 * API:
 *
 * - [StepIcon API](https://material-ui.com/api/step-icon/)
 */
@JsName("default")
external val StepIcon: react.FC<StepIconProps>