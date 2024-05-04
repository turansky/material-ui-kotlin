// Automatically generated - do not modify!

@file:JsModule("@mui/material/AccordionSummary")

package mui.material

import web.cssom.ClassName

external interface AccordionSummaryClasses {
    /** Styles applied to the root element. */
    var root: ClassName

    /** State class applied to the root element, children wrapper element and `IconButton` component if `expanded={true}`. */
    var expanded: ClassName

    /** State class applied to the ButtonBase root element if the button is keyboard focused. */
    var focusVisible: ClassName

    /** State class applied to the root element if `disabled={true}`. */
    var disabled: ClassName

    /** Styles applied to the root element unless `disableGutters={true}`. */
    var gutters: ClassName

    /**
     * Styles applied to the children wrapper element unless `disableGutters={true}`.
     * @deprecated Combine the [.MuiAccordionSummary-gutters](/material-ui/api/accordion-summary/#AccordionSummary-classes-gutters) and [.MuiAccordionSummary-content](/material-ui/api/accordion-summary/#AccordionSummary-classes-content) classes instead. [How to migrate](/material-ui/migration/migrating-from-deprecated-apis/).
     */
    var contentGutters: ClassName

    /** Styles applied to the children wrapper element. */
    var content: ClassName

    /** Styles applied to the `expandIcon`'s wrapper element. */
    var expandIconWrapper: ClassName
}

@JsName("default")
external val accordionSummaryClasses: AccordionSummaryClasses
