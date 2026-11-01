package com.luxtracon.floralis.common.ids;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisFeatureIds {
	public static final ResourceKey<Feature> WHITE_CACTUS_CROP = FloralisFeatureIds.create("white_cactus_crop");
	public static final ResourceKey<Feature> LIGHT_GRAY_CACTUS_CROP = FloralisFeatureIds.create("light_gray_cactus_crop");
	public static final ResourceKey<Feature> GRAY_CACTUS_CROP = FloralisFeatureIds.create("gray_cactus_crop");
	public static final ResourceKey<Feature> BLACK_CACTUS_CROP = FloralisFeatureIds.create("black_cactus_crop");
	public static final ResourceKey<Feature> BROWN_CACTUS_CROP = FloralisFeatureIds.create("brown_cactus_crop");
	public static final ResourceKey<Feature> RED_CACTUS_CROP = FloralisFeatureIds.create("red_cactus_crop");
	public static final ResourceKey<Feature> ORANGE_CACTUS_CROP = FloralisFeatureIds.create("orange_cactus_crop");
	public static final ResourceKey<Feature> YELLOW_CACTUS_CROP = FloralisFeatureIds.create("yellow_cactus_crop");
	public static final ResourceKey<Feature> LIME_CACTUS_CROP = FloralisFeatureIds.create("lime_cactus_crop");
	public static final ResourceKey<Feature> GREEN_CACTUS_CROP = FloralisFeatureIds.create("green_cactus_crop");
	public static final ResourceKey<Feature> CYAN_CACTUS_CROP = FloralisFeatureIds.create("cyan_cactus_crop");
	public static final ResourceKey<Feature> LIGHT_BLUE_CACTUS_CROP = FloralisFeatureIds.create("light_blue_cactus_crop");
	public static final ResourceKey<Feature> BLUE_CACTUS_CROP = FloralisFeatureIds.create("blue_cactus_crop");
	public static final ResourceKey<Feature> PURPLE_CACTUS_CROP = FloralisFeatureIds.create("purple_cactus_crop");
	public static final ResourceKey<Feature> MAGENTA_CACTUS_CROP = FloralisFeatureIds.create("magenta_cactus_crop");
	public static final ResourceKey<Feature> PINK_CACTUS_CROP = FloralisFeatureIds.create("pink_cactus_crop");

	public static final ResourceKey<Feature> WHITE_FLOWER_CROP = FloralisFeatureIds.create("white_flower_crop");
	public static final ResourceKey<Feature> LIGHT_GRAY_FLOWER_CROP = FloralisFeatureIds.create("light_gray_flower_crop");
	public static final ResourceKey<Feature> GRAY_FLOWER_CROP = FloralisFeatureIds.create("gray_flower_crop");
	public static final ResourceKey<Feature> BLACK_FLOWER_CROP = FloralisFeatureIds.create("black_flower_crop");
	public static final ResourceKey<Feature> BROWN_FLOWER_CROP = FloralisFeatureIds.create("brown_flower_crop");
	public static final ResourceKey<Feature> RED_FLOWER_CROP = FloralisFeatureIds.create("red_flower_crop");
	public static final ResourceKey<Feature> ORANGE_FLOWER_CROP = FloralisFeatureIds.create("orange_flower_crop");
	public static final ResourceKey<Feature> YELLOW_FLOWER_CROP = FloralisFeatureIds.create("yellow_flower_crop");
	public static final ResourceKey<Feature> LIME_FLOWER_CROP = FloralisFeatureIds.create("lime_flower_crop");
	public static final ResourceKey<Feature> GREEN_FLOWER_CROP = FloralisFeatureIds.create("green_flower_crop");
	public static final ResourceKey<Feature> CYAN_FLOWER_CROP = FloralisFeatureIds.create("cyan_flower_crop");
	public static final ResourceKey<Feature> LIGHT_BLUE_FLOWER_CROP = FloralisFeatureIds.create("light_blue_flower_crop");
	public static final ResourceKey<Feature> BLUE_FLOWER_CROP = FloralisFeatureIds.create("blue_flower_crop");
	public static final ResourceKey<Feature> PURPLE_FLOWER_CROP = FloralisFeatureIds.create("purple_flower_crop");
	public static final ResourceKey<Feature> MAGENTA_FLOWER_CROP = FloralisFeatureIds.create("magenta_flower_crop");
	public static final ResourceKey<Feature> PINK_FLOWER_CROP = FloralisFeatureIds.create("pink_flower_crop");

	public static ResourceKey<Feature> create(String pName) {
		return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName));
	}
}
