package com.luxtracon.floralis.data.registry;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.ids.FloralisFeatureIds;
import com.luxtracon.floralis.common.registry.FloralisBlockStateProperties;
import com.luxtracon.floralis.common.registry.FloralisBlocks;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisFeatures {

	public static void bootstrap(BootstrapContext<Feature> pBootstrapContext) {
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.WHITE_CACTUS_CROP, FloralisBlocks.WHITE_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.LIGHT_GRAY_CACTUS_CROP, FloralisBlocks.LIGHT_GRAY_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.GRAY_CACTUS_CROP, FloralisBlocks.GRAY_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.BLACK_CACTUS_CROP, FloralisBlocks.BLACK_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.BROWN_CACTUS_CROP, FloralisBlocks.BROWN_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.RED_CACTUS_CROP, FloralisBlocks.RED_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.ORANGE_CACTUS_CROP, FloralisBlocks.ORANGE_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.YELLOW_CACTUS_CROP, FloralisBlocks.YELLOW_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.LIME_CACTUS_CROP, FloralisBlocks.LIME_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.GREEN_CACTUS_CROP, FloralisBlocks.GREEN_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.CYAN_CACTUS_CROP, FloralisBlocks.CYAN_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.LIGHT_BLUE_CACTUS_CROP, FloralisBlocks.LIGHT_BLUE_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.BLUE_CACTUS_CROP, FloralisBlocks.BLUE_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.PURPLE_CACTUS_CROP, FloralisBlocks.PURPLE_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.MAGENTA_CACTUS_CROP, FloralisBlocks.MAGENTA_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.PINK_CACTUS_CROP, FloralisBlocks.PINK_CACTUS_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.WHITE_FLOWER_CROP, FloralisBlocks.WHITE_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.LIGHT_GRAY_FLOWER_CROP, FloralisBlocks.LIGHT_GRAY_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.GRAY_FLOWER_CROP, FloralisBlocks.GRAY_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.BLACK_FLOWER_CROP, FloralisBlocks.BLACK_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.BROWN_FLOWER_CROP, FloralisBlocks.BROWN_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.RED_FLOWER_CROP, FloralisBlocks.RED_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.ORANGE_FLOWER_CROP, FloralisBlocks.ORANGE_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.YELLOW_FLOWER_CROP, FloralisBlocks.YELLOW_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.LIME_FLOWER_CROP, FloralisBlocks.LIME_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.GREEN_FLOWER_CROP, FloralisBlocks.GREEN_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.CYAN_FLOWER_CROP, FloralisBlocks.CYAN_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.LIGHT_BLUE_FLOWER_CROP, FloralisBlocks.LIGHT_BLUE_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.BLUE_FLOWER_CROP, FloralisBlocks.BLUE_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.PURPLE_FLOWER_CROP, FloralisBlocks.PURPLE_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.MAGENTA_FLOWER_CROP, FloralisBlocks.MAGENTA_FLOWER_SEEDS.get());
		FloralisFeatures.register(pBootstrapContext, FloralisFeatureIds.PINK_FLOWER_CROP, FloralisBlocks.PINK_FLOWER_SEEDS.get());
	}

	public static void register(BootstrapContext<Feature> pBootstrapContext, ResourceKey<Feature> pFeature, Block pBlock) {
		pBootstrapContext.register(pFeature, new SimpleBlockFeature(new WeightedStateProvider(new WeightedList.Builder<BlockState>().add(pBlock.defaultBlockState().setValue(FloralisBlockStateProperties.AGE, 0)).add(pBlock.defaultBlockState().setValue(FloralisBlockStateProperties.AGE, 1)).add(pBlock.defaultBlockState().setValue(FloralisBlockStateProperties.AGE, 2)).add(pBlock.defaultBlockState().setValue(FloralisBlockStateProperties.AGE, 3)).build())));
	}
}
