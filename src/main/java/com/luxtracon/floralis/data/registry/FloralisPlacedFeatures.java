package com.luxtracon.floralis.data.registry;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.ids.FloralisFeatureIds;
import com.luxtracon.floralis.common.ids.FloralisPlacedFeatureIds;

import java.util.List;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisPlacedFeatures {

	public static void bootstrap(BootstrapContext<PlacedFeature> pBootstrapContext) {
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.WHITE_CACTUS_CROP, FloralisFeatureIds.WHITE_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.LIGHT_GRAY_CACTUS_CROP, FloralisFeatureIds.LIGHT_GRAY_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.GRAY_CACTUS_CROP, FloralisFeatureIds.GRAY_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.BLACK_CACTUS_CROP, FloralisFeatureIds.BLACK_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.BROWN_CACTUS_CROP, FloralisFeatureIds.BROWN_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.RED_CACTUS_CROP, FloralisFeatureIds.RED_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.ORANGE_CACTUS_CROP, FloralisFeatureIds.ORANGE_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.YELLOW_CACTUS_CROP, FloralisFeatureIds.YELLOW_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.LIME_CACTUS_CROP, FloralisFeatureIds.LIME_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.GREEN_CACTUS_CROP, FloralisFeatureIds.GREEN_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.CYAN_CACTUS_CROP, FloralisFeatureIds.CYAN_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.LIGHT_BLUE_CACTUS, FloralisFeatureIds.LIGHT_BLUE_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.BLUE_CACTUS_CROP, FloralisFeatureIds.BLUE_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.PURPLE_CACTUS_CROP, FloralisFeatureIds.PURPLE_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.MAGENTA_CACTUS_CROP, FloralisFeatureIds.MAGENTA_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.PINK_CACTUS_CROP, FloralisFeatureIds.PINK_CACTUS_CROP, BlockTags.SAND);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.WHITE_FLOWER_CROP, FloralisFeatureIds.WHITE_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.LIGHT_GRAY_FLOWER_CROP, FloralisFeatureIds.LIGHT_GRAY_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.GRAY_FLOWER_CROP, FloralisFeatureIds.GRAY_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.BLACK_FLOWER_CROP, FloralisFeatureIds.BLACK_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.BROWN_FLOWER_CROP, FloralisFeatureIds.BROWN_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.RED_FLOWER_CROP, FloralisFeatureIds.RED_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.ORANGE_FLOWER_CROP, FloralisFeatureIds.ORANGE_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.YELLOW_FLOWER_CROP, FloralisFeatureIds.YELLOW_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.LIME_FLOWER_CROP, FloralisFeatureIds.LIME_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.GREEN_FLOWER_CROP, FloralisFeatureIds.GREEN_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.CYAN_FLOWER_CROP, FloralisFeatureIds.CYAN_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.LIGHT_BLUE_FLOWER_CROP, FloralisFeatureIds.LIGHT_BLUE_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.BLUE_FLOWER_CROP, FloralisFeatureIds.BLUE_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.PURPLE_FLOWER_CROP, FloralisFeatureIds.PURPLE_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.MAGENTA_FLOWER_CROP, FloralisFeatureIds.MAGENTA_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
		FloralisPlacedFeatures.register(pBootstrapContext, FloralisPlacedFeatureIds.PINK_FLOWER_CROP, FloralisFeatureIds.PINK_FLOWER_CROP, BlockTags.SUBSTRATE_OVERWORLD);
	}

	public static void register(BootstrapContext<PlacedFeature> pBootstrapContext, ResourceKey<PlacedFeature> pPlacedFeature, ResourceKey<Feature> pFeature, TagKey<Block> pBlocks) {
		pBootstrapContext.register(pPlacedFeature, new PlacedFeature(pBootstrapContext.lookup(Registries.FEATURE).getOrThrow(pFeature), List.of(RarityFilter.onAverageOnceEvery(256), InSquarePlacement.spread(), HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING), BiomeFilter.biome(), CountPlacement.of(64), OffsetPlacement.ofTriangle(4, 4), BlockPredicateFilter.forPredicate(BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.AIR), BlockPredicate.matchesTag(Direction.DOWN, pBlocks))))));
	}
}
