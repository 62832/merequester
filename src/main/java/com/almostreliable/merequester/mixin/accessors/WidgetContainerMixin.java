package com.almostreliable.merequester.mixin.accessors;

import net.minecraft.client.gui.components.AbstractWidget;

import appeng.client.gui.WidgetContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(WidgetContainer.class)
public interface WidgetContainerMixin {

    @Accessor(value = "widgets", remap = false)
    Map<String, AbstractWidget> merequester$getWidgets();
}
