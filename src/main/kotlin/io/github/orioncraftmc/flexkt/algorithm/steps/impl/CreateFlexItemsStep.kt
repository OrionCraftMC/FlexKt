package io.github.orioncraftmc.flexkt.algorithm.steps.impl

import io.github.orioncraftmc.flexkt.algorithm.model.ctx.FlexibleBoxLayoutContext
import io.github.orioncraftmc.flexkt.algorithm.steps.FlexibleBoxStep

object CreateFlexItemsStep : FlexibleBoxStep {
    /**
     * Performs the first layout step of the flexible box algorithm.
     *
     * The steps are as follows:
     * - Order the children by their order property. (Flex layout works with the flex items in order-modified document order,
     * not their original document order)
     * - Then collect the items that participate in the flex layout.
     * - Then finally create the flex items for each node.
     */
    override fun layout(context: FlexibleBoxLayoutContext) {
        context.container.children
            .asSequence()
            .sortedBy { it.style.order }
            .filter { it.style.visibility.affectsLayout }
            .forEach {
                context.flexItems.add(it)
            }
    }

}