package com.luxtracon.floralis.common.ids;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisPlacedFeatureIds {
	public static final ResourceKey<PlacedFeature> WHITE_CACTUS_CROP = FloralisPlacedFeatureIds.create("white_cactus_crop");
	public static final ResourceKey<PlacedFeature> LIGHT_GRAY_CACTUS_CROP = FloralisPlacedFeatureIds.create("light_gray_cactus_crop");
	public static final ResourceKey<PlacedFeature> GRAY_CACTUS_CROP = FloralisPlacedFeatureIds.create("gray_cactus_crop");
	public static final ResourceKey<PlacedFeature> BLACK_CACTUS_CROP = FloralisPlacedFeatureIds.create("black_cactus_crop");
	public static final ResourceKey<PlacedFeature> BROWN_CACTUS_CROP = FloralisPlacedFeatureIds.create("brown_cactus_crop");
	public static final ResourceKey<PlacedFeature> RED_CACTUS_CROP = FloralisPlacedFeatureIds.create("red_cactus_crop");
	public static final ResourceKey<PlacedFeature> ORANGE_CACTUS_CROP = FloralisPlacedFeatureIds.create("orange_cactus_crop");
	public static final ResourceKey<PlacedFeature> YELLOW_CACTUS_CROP = FloralisPlacedFeatureIds.create("yellow_cactus_crop");
	public static final ResourceKey<PlacedFeature> LIME_CACTUS_CROP = FloralisPlacedFeatureIds.create("lime_cactus_crop");
	public static final ResourceKey<PlacedFeature> GREEN_CACTUS_CROP = FloralisPlacedFeatureIds.create("green_cactus_crop");
	public static final ResourceKey<PlacedFeature> CYAN_CACTUS_CROP = FloralisPlacedFeatureIds.create("cyan_cactus_crop");
	public static final ResourceKey<PlacedFeature> LIGHT_BLUE_CACTUS = FloralisPlacedFeatureIds.create("light_blue_cactus_crop");
	public static final ResourceKey<PlacedFeature> BLUE_CACTUS_CROP = FloralisPlacedFeatureIds.create("blue_cactus_crop");
	public static final ResourceKey<PlacedFeature> PURPLE_CACTUS_CROP = FloralisPlacedFeatureIds.create("purple_cactus_crop");
	public static final ResourceKey<PlacedFeature> MAGENTA_CACTUS_CROP = FloralisPlacedFeatureIds.create("magenta_cactus_crop");
	public static final ResourceKey<PlacedFeature> PINK_CACTUS_CROP = FloralisPlacedFeatureIds.create("pink_cactus_crop");

	public static final ResourceKey<PlacedFeature> WHITE_FLOWER_CROP = FloralisPlacedFeatureIds.create("white_flower_crop");
	public static final ResourceKey<PlacedFeature> LIGHT_GRAY_FLOWER_CROP = FloralisPlacedFeatureIds.create("light_gray_flower_crop");
	public static final ResourceKey<PlacedFeature> GRAY_FLOWER_CROP = FloralisPlacedFeatureIds.create("gray_flower_crop");
	public static final ResourceKey<PlacedFeature> BLACK_FLOWER_CROP = FloralisPlacedFeatureIds.create("black_flower_crop");
	public static final ResourceKey<PlacedFeature> BROWN_FLOWER_CROP = FloralisPlacedFeatureIds.create("brown_flower_crop");
	public static final ResourceKey<PlacedFeature> RED_FLOWER_CROP = FloralisPlacedFeatureIds.create("red_flower_crop");
	public static final ResourceKey<PlacedFeature> ORANGE_FLOWER_CROP = FloralisPlacedFeatureIds.create("orange_flower_crop");
	public static final ResourceKey<PlacedFeature> YELLOW_FLOWER_CROP = FloralisPlacedFeatureIds.create("yellow_flower_crop");
	public static final ResourceKey<PlacedFeature> LIME_FLOWER_CROP = FloralisPlacedFeatureIds.create("lime_flower_crop");
	public static final ResourceKey<PlacedFeature> GREEN_FLOWER_CROP = FloralisPlacedFeatureIds.create("green_flower_crop");
	public static final ResourceKey<PlacedFeature> CYAN_FLOWER_CROP = FloralisPlacedFeatureIds.create("cyan_flower_crop");
	public static final ResourceKey<PlacedFeature> LIGHT_BLUE_FLOWER_CROP = FloralisPlacedFeatureIds.create("light_blue_flower_crop");
	public static final ResourceKey<PlacedFeature> BLUE_FLOWER_CROP = FloralisPlacedFeatureIds.create("blue_flower_crop");
	public static final ResourceKey<PlacedFeature> PURPLE_FLOWER_CROP = FloralisPlacedFeatureIds.create("purple_flower_crop");
	public static final ResourceKey<PlacedFeature> MAGENTA_FLOWER_CROP = FloralisPlacedFeatureIds.create("magenta_flower_crop");
	public static final ResourceKey<PlacedFeature> PINK_FLOWER_CROP = FloralisPlacedFeatureIds.create("pink_flower_crop");

	public static ResourceKey<PlacedFeature> create(String pName) {
		return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName));
	}
}
