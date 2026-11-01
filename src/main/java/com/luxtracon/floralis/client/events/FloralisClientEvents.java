package com.luxtracon.floralis.client.events;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.client.tint.FloralisBlockTintSource;
import com.luxtracon.floralis.client.tint.FloralisPottedBlockTintSource;
import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisIds;

import java.util.List;

import net.minecraft.world.level.block.Block;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

@EventBusSubscriber(modid = FloralisIds.ID, value = Dist.CLIENT)
public class FloralisClientEvents {

	@SubscribeEvent
	public static void onRegisterColorHandlers(RegisterColorHandlersEvent.BlockTintSources pEvent) {
		FloralisClientEvents.blockTintSource(pEvent);
		FloralisClientEvents.pottedBlockTintSource(pEvent);
	}

	public static void blockTintSource(RegisterColorHandlersEvent.BlockTintSources pEvent) {
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PLANT_FIBERS_BLOCK.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.WHITE_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIGHT_GRAY_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.GRAY_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BLACK_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BROWN_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.RED_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.ORANGE_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.YELLOW_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIME_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.GREEN_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.CYAN_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIGHT_BLUE_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BLUE_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PURPLE_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.MAGENTA_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PINK_CACTUS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.WHITE_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIGHT_GRAY_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.GRAY_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BLACK_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BROWN_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.RED_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.ORANGE_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.YELLOW_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIME_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.GREEN_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.CYAN_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIGHT_BLUE_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BLUE_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PURPLE_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.MAGENTA_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PINK_FLOWER.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.WHITE_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIGHT_GRAY_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.GRAY_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BLACK_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BROWN_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.RED_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.ORANGE_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.YELLOW_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIME_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.GREEN_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.CYAN_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIGHT_BLUE_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BLUE_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PURPLE_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.MAGENTA_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PINK_CACTUS_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.WHITE_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIGHT_GRAY_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.GRAY_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BLACK_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BROWN_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.RED_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.ORANGE_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.YELLOW_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIME_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.GREEN_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.CYAN_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.LIGHT_BLUE_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.BLUE_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PURPLE_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.MAGENTA_FLOWER_SEEDS.get());
		FloralisClientEvents.blockTintSource(pEvent, FloralisBlocks.PINK_FLOWER_SEEDS.get());
	}

	public static void pottedBlockTintSource(RegisterColorHandlersEvent.BlockTintSources pEvent) {
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_WHITE_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_LIGHT_GRAY_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_GRAY_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_BLACK_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_BROWN_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_RED_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_ORANGE_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_YELLOW_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_LIME_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_GREEN_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_CYAN_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_LIGHT_BLUE_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_BLUE_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_PURPLE_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_MAGENTA_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_PINK_CACTUS.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_WHITE_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_LIGHT_GRAY_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_GRAY_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_BLACK_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_BROWN_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_RED_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_ORANGE_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_YELLOW_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_LIME_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_GREEN_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_CYAN_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_LIGHT_BLUE_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_BLUE_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_PURPLE_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_MAGENTA_FLOWER.get());
		FloralisClientEvents.pottedBlockTintSource(pEvent, FloralisBlocks.POTTED_PINK_FLOWER.get());
	}

	public static void blockTintSource(RegisterColorHandlersEvent.BlockTintSources pEvent, Block pBlock) {
		pEvent.register(List.of(new FloralisBlockTintSource()), pBlock);
	}

	public static void pottedBlockTintSource(RegisterColorHandlersEvent.BlockTintSources pEvent, Block pBlock) {
		pEvent.register(List.of(new FloralisPottedBlockTintSource()), pBlock);
	}
}
