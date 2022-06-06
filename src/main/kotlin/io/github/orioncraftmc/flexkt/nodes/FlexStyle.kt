package io.github.orioncraftmc.flexkt.nodes

import io.github.orioncraftmc.flexkt.enums.css.CssVisibility
import io.github.orioncraftmc.flexkt.enums.flex.FlexDirection
import io.github.orioncraftmc.flexkt.enums.flex.FlexJustifyContent
import io.github.orioncraftmc.flexkt.enums.flex.FlexWrap
import io.github.orioncraftmc.flexkt.math.css.CssDimension
import io.github.orioncraftmc.flexkt.math.css.CssMarginRectangle
import io.github.orioncraftmc.flexkt.math.css.CssNumber

data class FlexStyle(
    /**
     * The flex-direction property specifies how flex items are placed in the flex container,
     * by setting the direction of the flex container’s main axis.
     *
     * This determines the direction in which flex items are laid out.
     */
    var flexDirection: FlexDirection = FlexDirection.initial,
    /**
     * The flex-wrap property controls whether the flex container is single-line or multi-line,
     * and the direction of the cross-axis, which determines the direction new lines are stacked in.
     */
    var flexWrap: FlexWrap = FlexWrap.initial,
    /**
     * The flex-grow property sets the flex grow factor to the provided <number>.
     *
     * Negative numbers are invalid.
     */
    var flexGrow: CssNumber = CssNumber.initial,
    /**
     * The flex-shrink property sets the flex shrink factor to the provided <number>.
     *
     * Negative numbers are invalid.
     */
    var flexShrink: CssNumber = CssNumber.initial,
    /**
     * The flex-basis property sets the flex basis.
     *
     * It accepts the same values as the width and height property,
     * plus content.
     *
     * For all values other than auto and content (defined above),
     * flex-basis is resolved the same way as width in horizontal writing modes,
     * except that if a value would resolve to auto for width, it instead resolves to content for flex-basis.
     */
    var flexBasis: CssDimension = CssDimension.CssAuto,
    /**
     * The justify-content property aligns flex items along the main axis of the current line of the flex container.
     *
     * This is done after any flexible lengths and any auto margins have been resolved.
     *
     * Typically, it helps distribute extra free space leftover when either all the flex items on a line are
     * inflexible, or are flexible but have reached their maximum size.
     *
     * It also exerts some control over the alignment of items when they overflow the line.
     */
    val justifyContent: FlexJustifyContent = FlexJustifyContent.initial,
    /**
     * Flex items are, by default, displayed and laid out in the same order as they appear in the source document.
     * The order property can be used to change this ordering.
     */
    var order: Int = 0,
    /**
     * The margin property sets the margin for all four sides. The margins of adjacent flex items do not collapse.
     *
     * Auto margins expand to absorb extra space in the corresponding dimension. They can be used for alignment, or to push adjacent flex items apart.
     */
    var margin: CssMarginRectangle = CssMarginRectangle.initial,
    /**
     * The visibility property specifies whether the boxes generated by an element are rendered.
     *
     * Invisible boxes still affect layout (set the 'display' property to 'none' to suppress box generation altogether).
     */
    val visibility: CssVisibility = CssVisibility.initial
) {
    init {
        check(flexGrow >= CssNumber(0f)) { "flexGrow must be >= 0" }
        check(flexShrink >= CssNumber(0f)) { "flexShrink must be >= 0" }
    }
}
