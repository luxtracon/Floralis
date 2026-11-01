package com.luxtracon.floralis.common.ids;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlockIds {
	public static final ResourceKey<Block> POTTED_WHITE_CACTUS = FloralisBlockIds.create("potted_white_cactus");
	public static final ResourceKey<Block> POTTED_LIGHT_GRAY_CACTUS = FloralisBlockIds.create("potted_light_gray_cactus");
	public static final ResourceKey<Block> POTTED_GRAY_CACTUS = FloralisBlockIds.create("potted_gray_cactus");
	public static final ResourceKey<Block> POTTED_BLACK_CACTUS = FloralisBlockIds.create("potted_black_cactus");
	public static final ResourceKey<Block> POTTED_BROWN_CACTUS = FloralisBlockIds.create("potted_brown_cactus");
	public static final ResourceKey<Block> POTTED_RED_CACTUS = FloralisBlockIds.create("potted_red_cactus");
	public static final ResourceKey<Block> POTTED_ORANGE_CACTUS = FloralisBlockIds.create("potted_orange_cactus");
	public static final ResourceKey<Block> POTTED_YELLOW_CACTUS = FloralisBlockIds.create("potted_yellow_cactus");
	public static final ResourceKey<Block> POTTED_LIME_CACTUS = FloralisBlockIds.create("potted_lime_cactus");
	public static final ResourceKey<Block> POTTED_GREEN_CACTUS = FloralisBlockIds.create("potted_green_cactus");
	public static final ResourceKey<Block> POTTED_CYAN_CACTUS = FloralisBlockIds.create("potted_cyan_cactus");
	public static final ResourceKey<Block> POTTED_LIGHT_BLUE_CACTUS = FloralisBlockIds.create("potted_light_blue_cactus");
	public static final ResourceKey<Block> POTTED_BLUE_CACTUS = FloralisBlockIds.create("potted_blue_cactus");
	public static final ResourceKey<Block> POTTED_PURPLE_CACTUS = FloralisBlockIds.create("potted_purple_cactus");
	public static final ResourceKey<Block> POTTED_MAGENTA_CACTUS = FloralisBlockIds.create("potted_magenta_cactus");
	public static final ResourceKey<Block> POTTED_PINK_CACTUS = FloralisBlockIds.create("potted_pink_cactus");

	public static final ResourceKey<Block> POTTED_WHITE_FLOWER = FloralisBlockIds.create("potted_white_flower");
	public static final ResourceKey<Block> POTTED_LIGHT_GRAY_FLOWER = FloralisBlockIds.create("potted_light_gray_flower");
	public static final ResourceKey<Block> POTTED_GRAY_FLOWER = FloralisBlockIds.create("potted_gray_flower");
	public static final ResourceKey<Block> POTTED_BLACK_FLOWER = FloralisBlockIds.create("potted_black_flower");
	public static final ResourceKey<Block> POTTED_BROWN_FLOWER = FloralisBlockIds.create("potted_brown_flower");
	public static final ResourceKey<Block> POTTED_RED_FLOWER = FloralisBlockIds.create("potted_red_flower");
	public static final ResourceKey<Block> POTTED_ORANGE_FLOWER = FloralisBlockIds.create("potted_orange_flower");
	public static final ResourceKey<Block> POTTED_YELLOW_FLOWER = FloralisBlockIds.create("potted_yellow_flower");
	public static final ResourceKey<Block> POTTED_LIME_FLOWER = FloralisBlockIds.create("potted_lime_flower");
	public static final ResourceKey<Block> POTTED_GREEN_FLOWER = FloralisBlockIds.create("potted_green_flower");
	public static final ResourceKey<Block> POTTED_CYAN_FLOWER = FloralisBlockIds.create("potted_cyan_flower");
	public static final ResourceKey<Block> POTTED_LIGHT_BLUE_FLOWER = FloralisBlockIds.create("potted_light_blue_flower");
	public static final ResourceKey<Block> POTTED_BLUE_FLOWER = FloralisBlockIds.create("potted_blue_flower");
	public static final ResourceKey<Block> POTTED_PURPLE_FLOWER = FloralisBlockIds.create("potted_purple_flower");
	public static final ResourceKey<Block> POTTED_MAGENTA_FLOWER = FloralisBlockIds.create("potted_magenta_flower");
	public static final ResourceKey<Block> POTTED_PINK_FLOWER = FloralisBlockIds.create("potted_pink_flower");

	public static ResourceKey<Block> create(String pName) {
		return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName));
	}
}
