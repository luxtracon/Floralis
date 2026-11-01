package com.luxtracon.floralis.common.ids;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisItemIds {
	public static final ResourceKey<Item> WHITE_PETALS = FloralisItemIds.create("white_petals");
	public static final ResourceKey<Item> LIGHT_GRAY_PETALS = FloralisItemIds.create("light_gray_petals");
	public static final ResourceKey<Item> GRAY_PETALS = FloralisItemIds.create("gray_petals");
	public static final ResourceKey<Item> BLACK_PETALS = FloralisItemIds.create("black_petals");
	public static final ResourceKey<Item> BROWN_PETALS = FloralisItemIds.create("brown_petals");
	public static final ResourceKey<Item> RED_PETALS = FloralisItemIds.create("red_petals");
	public static final ResourceKey<Item> ORANGE_PETALS = FloralisItemIds.create("orange_petals");
	public static final ResourceKey<Item> YELLOW_PETALS = FloralisItemIds.create("yellow_petals");
	public static final ResourceKey<Item> LIME_PETALS = FloralisItemIds.create("lime_petals");
	public static final ResourceKey<Item> GREEN_PETALS = FloralisItemIds.create("green_petals");
	public static final ResourceKey<Item> CYAN_PETALS = FloralisItemIds.create("cyan_petals");
	public static final ResourceKey<Item> LIGHT_BLUE_PETALS = FloralisItemIds.create("light_blue_petals");
	public static final ResourceKey<Item> BLUE_PETALS = FloralisItemIds.create("blue_petals");
	public static final ResourceKey<Item> PURPLE_PETALS = FloralisItemIds.create("purple_petals");
	public static final ResourceKey<Item> MAGENTA_PETALS = FloralisItemIds.create("magenta_petals");
	public static final ResourceKey<Item> PINK_PETALS = FloralisItemIds.create("pink_petals");

	public static final ResourceKey<Item> PLANT_FIBERS = FloralisItemIds.create("plant_fibers");

	public static ResourceKey<Item> create(String pName) {
		return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName));
	}
}
