package com.luxtracon.floralis.common.ids;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBiomeModifierIds {
	public static final ResourceKey<BiomeModifier> WHITE_CACTUS_CROP = FloralisBiomeModifierIds.create("white_cactus_crop");
	public static final ResourceKey<BiomeModifier> LIGHT_GRAY_CACTUS_CROP = FloralisBiomeModifierIds.create("light_gray_cactus_crop");
	public static final ResourceKey<BiomeModifier> GRAY_CACTUS_CROP = FloralisBiomeModifierIds.create("gray_cactus_crop");
	public static final ResourceKey<BiomeModifier> BLACK_CACTUS_CROP = FloralisBiomeModifierIds.create("black_cactus_crop");
	public static final ResourceKey<BiomeModifier> BROWN_CACTUS_CROP = FloralisBiomeModifierIds.create("brown_cactus_crop");
	public static final ResourceKey<BiomeModifier> RED_CACTUS_CROP = FloralisBiomeModifierIds.create("red_cactus_crop");
	public static final ResourceKey<BiomeModifier> ORANGE_CACTUS_CROP = FloralisBiomeModifierIds.create("orange_cactus_crop");
	public static final ResourceKey<BiomeModifier> YELLOW_CACTUS_CROP = FloralisBiomeModifierIds.create("yellow_cactus_crop");
	public static final ResourceKey<BiomeModifier> LIME_CACTUS_CROP = FloralisBiomeModifierIds.create("lime_cactus_crop");
	public static final ResourceKey<BiomeModifier> GREEN_CACTUS_CROP = FloralisBiomeModifierIds.create("green_cactus_crop");
	public static final ResourceKey<BiomeModifier> CYAN_CACTUS_CROP = FloralisBiomeModifierIds.create("cyan_cactus_crop");
	public static final ResourceKey<BiomeModifier> LIGHT_BLUE_CACTUS_CROP = FloralisBiomeModifierIds.create("light_blue_cactus_crop");
	public static final ResourceKey<BiomeModifier> BLUE_CACTUS_CROP = FloralisBiomeModifierIds.create("blue_cactus_crop");
	public static final ResourceKey<BiomeModifier> PURPLE_CACTUS_CROP = FloralisBiomeModifierIds.create("purple_cactus_crop");
	public static final ResourceKey<BiomeModifier> MAGENTA_CACTUS_CROP = FloralisBiomeModifierIds.create("magenta_cactus_crop");
	public static final ResourceKey<BiomeModifier> PINK_CACTUS_CROP = FloralisBiomeModifierIds.create("pink_cactus_crop");

	public static final ResourceKey<BiomeModifier> WHITE_FLOWER_CROP = FloralisBiomeModifierIds.create("white_flower_crop");
	public static final ResourceKey<BiomeModifier> LIGHT_GRAY_FLOWER_CROP = FloralisBiomeModifierIds.create("light_gray_flower_crop");
	public static final ResourceKey<BiomeModifier> GRAY_FLOWER_CROP = FloralisBiomeModifierIds.create("gray_flower_crop");
	public static final ResourceKey<BiomeModifier> BLACK_FLOWER_CROP = FloralisBiomeModifierIds.create("black_flower_crop");
	public static final ResourceKey<BiomeModifier> BROWN_FLOWER_CROP = FloralisBiomeModifierIds.create("brown_flower_crop");
	public static final ResourceKey<BiomeModifier> RED_FLOWER_CROP = FloralisBiomeModifierIds.create("red_flower_crop");
	public static final ResourceKey<BiomeModifier> ORANGE_FLOWER_CROP = FloralisBiomeModifierIds.create("orange_flower_crop");
	public static final ResourceKey<BiomeModifier> YELLOW_FLOWER_CROP = FloralisBiomeModifierIds.create("yellow_flower_crop");
	public static final ResourceKey<BiomeModifier> LIME_FLOWER_CROP = FloralisBiomeModifierIds.create("lime_flower_crop");
	public static final ResourceKey<BiomeModifier> GREEN_FLOWER_CROP = FloralisBiomeModifierIds.create("green_flower_crop");
	public static final ResourceKey<BiomeModifier> CYAN_FLOWER_CROP = FloralisBiomeModifierIds.create("cyan_flower_crop");
	public static final ResourceKey<BiomeModifier> LIGHT_BLUE_FLOWER_CROP = FloralisBiomeModifierIds.create("light_blue_flower_crop");
	public static final ResourceKey<BiomeModifier> BLUE_FLOWER_CROP = FloralisBiomeModifierIds.create("blue_flower_crop");
	public static final ResourceKey<BiomeModifier> PURPLE_FLOWER_CROP = FloralisBiomeModifierIds.create("purple_flower_crop");
	public static final ResourceKey<BiomeModifier> MAGENTA_FLOWER_CROP = FloralisBiomeModifierIds.create("magenta_flower_crop");
	public static final ResourceKey<BiomeModifier> PINK_FLOWER_CROP = FloralisBiomeModifierIds.create("pink_flower_crop");

	public static ResourceKey<BiomeModifier> create(String pName) {
		return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName));
	}
}
