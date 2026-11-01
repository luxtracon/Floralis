package com.luxtracon.floralis.data.registry;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.ids.FloralisBiomeModifierIds;
import com.luxtracon.floralis.common.ids.FloralisPlacedFeatureIds;
import com.luxtracon.floralis.common.tags.FloralisBiomeTags;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBiomeModifiers {

	public static void bootstrap(BootstrapContext<BiomeModifier> pBootstrapContext) {
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.WHITE_CACTUS_CROP, FloralisPlacedFeatureIds.WHITE_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.LIGHT_GRAY_CACTUS_CROP, FloralisPlacedFeatureIds.LIGHT_GRAY_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.GRAY_CACTUS_CROP, FloralisPlacedFeatureIds.GRAY_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.BLACK_CACTUS_CROP, FloralisPlacedFeatureIds.BLACK_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.BROWN_CACTUS_CROP, FloralisPlacedFeatureIds.BROWN_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.RED_CACTUS_CROP, FloralisPlacedFeatureIds.RED_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.ORANGE_CACTUS_CROP, FloralisPlacedFeatureIds.ORANGE_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.YELLOW_CACTUS_CROP, FloralisPlacedFeatureIds.YELLOW_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.LIME_CACTUS_CROP, FloralisPlacedFeatureIds.LIME_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.GREEN_CACTUS_CROP, FloralisPlacedFeatureIds.GREEN_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.CYAN_CACTUS_CROP, FloralisPlacedFeatureIds.CYAN_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.LIGHT_BLUE_CACTUS_CROP, FloralisPlacedFeatureIds.LIGHT_BLUE_CACTUS, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.BLUE_CACTUS_CROP, FloralisPlacedFeatureIds.BLUE_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.PURPLE_CACTUS_CROP, FloralisPlacedFeatureIds.PURPLE_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.MAGENTA_CACTUS_CROP, FloralisPlacedFeatureIds.MAGENTA_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.PINK_CACTUS_CROP, FloralisPlacedFeatureIds.PINK_CACTUS_CROP, FloralisBiomeTags.HAS_CACTUS);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.WHITE_FLOWER_CROP, FloralisPlacedFeatureIds.WHITE_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.LIGHT_GRAY_FLOWER_CROP, FloralisPlacedFeatureIds.LIGHT_GRAY_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.GRAY_FLOWER_CROP, FloralisPlacedFeatureIds.GRAY_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.BLACK_FLOWER_CROP, FloralisPlacedFeatureIds.BLACK_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.BROWN_FLOWER_CROP, FloralisPlacedFeatureIds.BROWN_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.RED_FLOWER_CROP, FloralisPlacedFeatureIds.RED_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.ORANGE_FLOWER_CROP, FloralisPlacedFeatureIds.ORANGE_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.YELLOW_FLOWER_CROP, FloralisPlacedFeatureIds.YELLOW_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.LIME_FLOWER_CROP, FloralisPlacedFeatureIds.LIME_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.GREEN_FLOWER_CROP, FloralisPlacedFeatureIds.GREEN_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.CYAN_FLOWER_CROP, FloralisPlacedFeatureIds.CYAN_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.LIGHT_BLUE_FLOWER_CROP, FloralisPlacedFeatureIds.LIGHT_BLUE_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.BLUE_FLOWER_CROP, FloralisPlacedFeatureIds.BLUE_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.PURPLE_FLOWER_CROP, FloralisPlacedFeatureIds.PURPLE_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.MAGENTA_FLOWER_CROP, FloralisPlacedFeatureIds.MAGENTA_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
		FloralisBiomeModifiers.register(pBootstrapContext, FloralisBiomeModifierIds.PINK_FLOWER_CROP, FloralisPlacedFeatureIds.PINK_FLOWER_CROP, FloralisBiomeTags.HAS_FLOWER);
	}

	public static void register(BootstrapContext<BiomeModifier> pBootstrapContext, ResourceKey<BiomeModifier> pBiomeModifier, ResourceKey<PlacedFeature> pPlacedFeature, TagKey<Biome> pBiomes) {
		pBootstrapContext.register(pBiomeModifier, new BiomeModifiers.AddFeaturesBiomeModifier(pBootstrapContext.lookup(Registries.BIOME).getOrThrow(pBiomes), HolderSet.direct(pBootstrapContext.lookup(Registries.PLACED_FEATURE).getOrThrow(pPlacedFeature)), GenerationStep.Decoration.VEGETAL_DECORATION));
	}
}
