package com.luxtracon.floralis.data.registry;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.ids.FloralisContextIntProviderIds;

import java.util.List;

import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;
import net.minecraft.world.level.storage.loot.providers.number.DispatcherProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.minecraft.world.level.storage.loot.providers.number.ints.NumberDispatcher;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisContextIntProviders {

	public static void bootstrap(BootstrapContext<ContextIntProvider> pBootstrapContext) {
		FloralisContextIntProviders.compostable(pBootstrapContext);
	}

	public static void compostable(BootstrapContext<ContextIntProvider> pBootstrapContext) {
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PLANT_FIBERS_BLOCK, 85);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_WHITE_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_GRAY_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GRAY_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLACK_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BROWN_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_RED_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_ORANGE_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_YELLOW_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIME_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GREEN_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_CYAN_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_BLUE_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLUE_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PURPLE_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_MAGENTA_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PINK_CACTUS, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_WHITE_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_GRAY_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GRAY_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLACK_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BROWN_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_RED_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_ORANGE_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_YELLOW_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIME_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GREEN_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_CYAN_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_BLUE_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLUE_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PURPLE_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_MAGENTA_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PINK_FLOWER, 65);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_WHITE_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_GRAY_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GRAY_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLACK_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BROWN_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_RED_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_ORANGE_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_YELLOW_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIME_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GREEN_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_CYAN_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_BLUE_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLUE_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PURPLE_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_MAGENTA_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PINK_CACTUS_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_WHITE_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_GRAY_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GRAY_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLACK_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BROWN_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_RED_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_ORANGE_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_YELLOW_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIME_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GREEN_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_CYAN_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_BLUE_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLUE_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PURPLE_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_MAGENTA_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PINK_FLOWER_SEEDS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_WHITE_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_GRAY_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GRAY_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLACK_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BROWN_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_RED_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_ORANGE_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_YELLOW_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIME_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_GREEN_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_CYAN_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_LIGHT_BLUE_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_BLUE_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PURPLE_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_MAGENTA_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PINK_PETALS, 30);
		FloralisContextIntProviders.compostable(pBootstrapContext, FloralisContextIntProviderIds.COMPOSTABLE_PLANT_FIBERS, 30);
	}

	public static void compostable(BootstrapContext<ContextIntProvider> pBootstrapContext, ResourceKey<ContextIntProvider> pContextIntProvider, int pChance) {
		pBootstrapContext.register(pContextIntProvider, pChance >= 100 ? new ConstantValue(1) : new NumberDispatcher(List.of(new DispatcherProvider.Case<>(Holder.direct(MatchBlock.blockMatches(pBootstrapContext.lookup(Registries.BLOCK), Blocks.COMPOSTER, StatePropertiesPredicate.Builder.properties().hasProperty(ComposterBlock.LEVEL, 0)).build()), ContextIntProviders.exactly(1))), ContextIntProviders.weighted(WeightedList.<Holder<ContextIntProvider>>builder().add(ContextIntProviders.exactly(0), 100 - pChance).add(ContextIntProviders.exactly(1), pChance).build())));
	}
}
