package com.luxtracon.floralis.common.tags;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockItemTagId;
import net.minecraft.tags.TagKey;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlockItemTags {
	public static final BlockItemTagId STORAGE_BLOCKS_DYE = FloralisBlockItemTags.create("storage_blocks/dye");
	public static final BlockItemTagId STORAGE_BLOCKS_PLANT_FIBERS = FloralisBlockItemTags.create("storage_blocks/plant_fibers");

	public static BlockItemTagId create(String pName) {
		return new BlockItemTagId(TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(FloralisIds.C, pName)), TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FloralisIds.C, pName)));
	}

	public static BlockItemTagId createFloralis(String pName) {
		return new BlockItemTagId(TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName)), TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName)));
	}
}
