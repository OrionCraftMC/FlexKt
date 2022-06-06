package io.github.orioncraftmc.flexkt.enums.flex

import io.github.orioncraftmc.flexkt.traits.DefaultTrait

/**
 * The align-content property aligns a flex container’s lines within the flex container when there
 * is extra space in the cross-axis, similar to how justify-content aligns individual items within the main-axis.
 *
 * Note, this property has no effect on a single-line flex container.
 */
enum class FlexAlignContent {
    /**
     * Lines are packed toward the start of the flex container.
     *
     * The cross-start edge of the first line in the flex container is placed flush with
     * the cross-start edge of the flex container, and each subsequent line is placed
     * flush with the preceding line.
     */
    FLEX_START,
    /**
     * Lines are packed toward the end of the flex container.
     *
     * The cross-end edge of the last line is placed flush with the cross-end edge of the
     * flex container, and each preceding line is placed flush with the subsequent line.
     */
    FLEX_END,

    /**
     * Lines are packed toward the center of the flex container.
     *
     * The lines in the flex container are placed flush with each other and aligned in the center
     * of the flex container, with equal amounts of space between the cross-start content edge of
     * the flex container and the first line in the flex container, and between the cross-end
     * content edge of the flex container and the last line in the flex container.
     *
     * (If the leftover free-space is negative, the lines will overflow equally in both directions.)
     */
    CENTER,

    /**
     * Lines are evenly distributed in the flex container.
     *
     * If the leftover free-space is negative or there is only a single flex line in the flex container,
     * this value is identical to flex-start.
     *
     * Otherwise, the cross-start edge of the first line in the flex container is placed flush with the
     * cross-start content edge of the flex container, the cross-end edge of the last line in the flex
     * container is placed flush with the cross-end content edge of the flex container, and the remaining
     * lines in the flex container are distributed so that the spacing between any two adjacent lines is the same.
     */
    SPACE_BETWEEN,

    /**
     * Lines are evenly distributed in the flex container, with half-size spaces on either end.
     *
     * If the leftover free-space is negative this value is identical to center.
     *
     * Otherwise, the lines in the flex container are distributed such that the spacing between any two
     * adjacent lines is the same, and the spacing between the first/last lines and the flex container
     * edges is half the size of the spacing between flex lines.
     */
    SPACE_AROUND,

    /**
     * Lines stretch to take up the remaining space.
     *
     * If the leftover free-space is negative, this value is identical to flex-start.
     *
     * Otherwise, the free-space is split equally between all the lines, increasing their cross size.
     */
    STRETCH;

    companion object : DefaultTrait<FlexAlignContent> {
        override val initial: FlexAlignContent = STRETCH
    }
}