package com.luxtracon.floralis.common.tags;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisItemTags {
	public static final TagKey<Item> SEEDS_CACTUS = FloralisItemTags.create("seeds/cactus");
	public static final TagKey<Item> SEEDS_FLOWER = FloralisItemTags.create("seeds/flower");

	public static TagKey<Item> create(String pName) {
		return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FloralisIds.C, pName));
	}

	public static TagKey<Item> createFloralis(String pName) {
		return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName));
	}
}
