package com.luxtracon.floralis.common.events;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisCreativeModeTabs;
import com.luxtracon.floralis.common.registry.FloralisIds;
import com.luxtracon.floralis.common.registry.FloralisItems;
import com.luxtracon.floralis.data.bootstrap.FloralisRecipeBootstrap;
import com.luxtracon.floralis.data.provider.FloralisDataMapProvider;
import com.luxtracon.floralis.data.provider.language.*;
import com.luxtracon.floralis.data.provider.loot.FloralisLootTableProvider;
import com.luxtracon.floralis.data.provider.model.FloralisModelProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisBiomeTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisBlockTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisItemTagsProvider;
import com.luxtracon.floralis.data.registry.FloralisBiomeModifiers;
import com.luxtracon.floralis.data.registry.FloralisContextIntProviders;
import com.luxtracon.floralis.data.registry.FloralisFeatures;
import com.luxtracon.floralis.data.registry.FloralisPlacedFeatures;

import net.minecraft.core.registries.Registries;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

@SuppressWarnings("unused")

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

@EventBusSubscriber(modid = FloralisIds.ID)
public class FloralisCommonEvents {

	@SubscribeEvent
	public static void onBuildCreativeModeTabContents(BuildCreativeModeTabContentsEvent pEvent) {
		if (pEvent.getTab() == FloralisCreativeModeTabs.FLORALIS.get()) {
			pEvent.accept(FloralisItems.WHITE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.GRAY_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.BLACK_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.BROWN_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.RED_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.ORANGE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.YELLOW_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.LIME_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.GREEN_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.CYAN_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.BLUE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.PURPLE_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.MAGENTA_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.PINK_DYE_BLOCK.get());
			pEvent.accept(FloralisItems.PLANT_FIBERS_BLOCK.get());
			pEvent.accept(FloralisItems.WHITE_CACTUS.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_CACTUS.get());
			pEvent.accept(FloralisItems.GRAY_CACTUS.get());
			pEvent.accept(FloralisItems.BLACK_CACTUS.get());
			pEvent.accept(FloralisItems.BROWN_CACTUS.get());
			pEvent.accept(FloralisItems.RED_CACTUS.get());
			pEvent.accept(FloralisItems.ORANGE_CACTUS.get());
			pEvent.accept(FloralisItems.YELLOW_CACTUS.get());
			pEvent.accept(FloralisItems.LIME_CACTUS.get());
			pEvent.accept(FloralisItems.GREEN_CACTUS.get());
			pEvent.accept(FloralisItems.CYAN_CACTUS.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_CACTUS.get());
			pEvent.accept(FloralisItems.BLUE_CACTUS.get());
			pEvent.accept(FloralisItems.PURPLE_CACTUS.get());
			pEvent.accept(FloralisItems.MAGENTA_CACTUS.get());
			pEvent.accept(FloralisItems.PINK_CACTUS.get());
			pEvent.accept(FloralisItems.WHITE_FLOWER.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_FLOWER.get());
			pEvent.accept(FloralisItems.GRAY_FLOWER.get());
			pEvent.accept(FloralisItems.BLACK_FLOWER.get());
			pEvent.accept(FloralisItems.BROWN_FLOWER.get());
			pEvent.accept(FloralisItems.RED_FLOWER.get());
			pEvent.accept(FloralisItems.ORANGE_FLOWER.get());
			pEvent.accept(FloralisItems.YELLOW_FLOWER.get());
			pEvent.accept(FloralisItems.LIME_FLOWER.get());
			pEvent.accept(FloralisItems.GREEN_FLOWER.get());
			pEvent.accept(FloralisItems.CYAN_FLOWER.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_FLOWER.get());
			pEvent.accept(FloralisItems.BLUE_FLOWER.get());
			pEvent.accept(FloralisItems.PURPLE_FLOWER.get());
			pEvent.accept(FloralisItems.MAGENTA_FLOWER.get());
			pEvent.accept(FloralisItems.PINK_FLOWER.get());
			pEvent.accept(FloralisItems.WHITE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.GRAY_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.BLACK_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.BROWN_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.RED_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.ORANGE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.YELLOW_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.LIME_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.GREEN_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.CYAN_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.BLUE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.PURPLE_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.MAGENTA_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.PINK_CACTUS_SEEDS.get());
			pEvent.accept(FloralisItems.WHITE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.GRAY_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.BLACK_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.BROWN_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.RED_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.ORANGE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.YELLOW_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.LIME_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.GREEN_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.CYAN_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.BLUE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.PURPLE_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.MAGENTA_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.PINK_FLOWER_SEEDS.get());
			pEvent.accept(FloralisItems.WHITE_PETALS.get());
			pEvent.accept(FloralisItems.LIGHT_GRAY_PETALS.get());
			pEvent.accept(FloralisItems.GRAY_PETALS.get());
			pEvent.accept(FloralisItems.BLACK_PETALS.get());
			pEvent.accept(FloralisItems.BROWN_PETALS.get());
			pEvent.accept(FloralisItems.RED_PETALS.get());
			pEvent.accept(FloralisItems.ORANGE_PETALS.get());
			pEvent.accept(FloralisItems.YELLOW_PETALS.get());
			pEvent.accept(FloralisItems.LIME_PETALS.get());
			pEvent.accept(FloralisItems.GREEN_PETALS.get());
			pEvent.accept(FloralisItems.CYAN_PETALS.get());
			pEvent.accept(FloralisItems.LIGHT_BLUE_PETALS.get());
			pEvent.accept(FloralisItems.BLUE_PETALS.get());
			pEvent.accept(FloralisItems.PURPLE_PETALS.get());
			pEvent.accept(FloralisItems.MAGENTA_PETALS.get());
			pEvent.accept(FloralisItems.PINK_PETALS.get());
			pEvent.accept(FloralisItems.PLANT_FIBERS.get());
		}
	}

	@SubscribeEvent
	public static void onGatherData(GatherDataEvent.Client pEvent) {
		var packOutput = pEvent.getGenerator().getPackOutput();
		var reloadableLookupProvider = pEvent.getReloadableLookupProvider();

		pEvent.addProvider(new FloralisChineseLanguageProvider(packOutput, FloralisIds.ID));
		pEvent.addProvider(new FloralisEnglishLanguageProvider(packOutput, FloralisIds.ID));
		pEvent.addProvider(new FloralisGermanLanguageProvider(packOutput, FloralisIds.ID));
		pEvent.addProvider(new FloralisRussianLanguageProvider(packOutput, FloralisIds.ID));
		pEvent.addProvider(new FloralisUkrainianLanguageProvider(packOutput, FloralisIds.ID));
		pEvent.addProvider(new FloralisModelProvider(packOutput, FloralisIds.ID));
		pEvent.addProvider(new FloralisBiomeTagsProvider(packOutput, reloadableLookupProvider, FloralisIds.ID));
		pEvent.addProvider(new FloralisBlockTagsProvider(packOutput, reloadableLookupProvider, FloralisIds.ID));
		pEvent.addProvider(new FloralisItemTagsProvider(packOutput, reloadableLookupProvider, FloralisIds.ID));
		pEvent.addProvider(new FloralisDataMapProvider(packOutput, reloadableLookupProvider));
	}

	@SubscribeEvent
	public static void onGatherDataRegistryEntries(GatherDataRegistryEntriesEvent pEvent) {
		pEvent.add(new FloralisRecipeBootstrap());
		pEvent.add(Registries.LOOT_TABLE, new FloralisLootTableProvider());
		pEvent.add(Registries.CONTEXT_INT_PROVIDER, FloralisContextIntProviders::bootstrap);
		pEvent.add(Registries.FEATURE, FloralisFeatures::bootstrap);
		pEvent.add(Registries.PLACED_FEATURE, FloralisPlacedFeatures::bootstrap);
		pEvent.add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, FloralisBiomeModifiers::bootstrap);
	}
}
