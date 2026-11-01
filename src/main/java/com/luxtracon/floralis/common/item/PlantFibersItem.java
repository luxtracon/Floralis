package com.luxtracon.floralis.common.item;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import java.util.function.Consumer;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

@SuppressWarnings("deprecation")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class PlantFibersItem extends BoneMealItem {
	public PlantFibersItem(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public void appendHoverText(ItemStack pItemStack, TooltipContext pTooltipContext, TooltipDisplay pTooltipDisplay, Consumer<Component> pConsumer, TooltipFlag pTooltipFlag) {
		pConsumer.accept(Component.translatable("tip" + "." + FloralisIds.ID + "." + "plant_fibers").withStyle(ChatFormatting.GRAY));
	}
}
