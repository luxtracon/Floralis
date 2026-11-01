package com.luxtracon.floralis.common.tags;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisIds;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBiomeTags {
	public static final TagKey<Biome> HAS_CACTUS = FloralisBiomeTags.createFloralis("has_cactus");
	public static final TagKey<Biome> HAS_FLOWER = FloralisBiomeTags.createFloralis("has_flower");

	public static TagKey<Biome> create(String pName) {
		return TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(FloralisIds.C, pName));
	}

	public static TagKey<Biome> createFloralis(String pName) {
		return TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(FloralisIds.ID, pName));
	}
}
