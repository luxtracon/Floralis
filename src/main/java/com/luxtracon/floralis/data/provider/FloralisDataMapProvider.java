package com.luxtracon.floralis.data.provider;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisItems;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;

import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Flammable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisDataMapProvider extends DataMapProvider {
	public FloralisDataMapProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider) {
		super(pPackOutput, pProvider);
	}

	@Override
	public void gather(HolderLookup.Provider pProvider) {
		this.flammables();
	}

	public void flammables() {
		this.flammables(FloralisItems.PLANT_FIBERS_BLOCK.get(), 60, 20);
		this.flammables(FloralisItems.WHITE_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.LIGHT_GRAY_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.GRAY_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.BLACK_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.BROWN_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.RED_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.ORANGE_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.YELLOW_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.LIME_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.GREEN_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.CYAN_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.LIGHT_BLUE_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.BLUE_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.PURPLE_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.MAGENTA_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.PINK_CACTUS.get(), 60, 100);
		this.flammables(FloralisItems.WHITE_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.LIGHT_GRAY_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.GRAY_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.BLACK_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.BROWN_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.RED_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.ORANGE_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.YELLOW_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.LIME_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.GREEN_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.CYAN_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.LIGHT_BLUE_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.BLUE_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.PURPLE_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.MAGENTA_FLOWER.get(), 60, 100);
		this.flammables(FloralisItems.PINK_FLOWER.get(), 60, 100);
	}

	public void flammables(Item pItem, int pIgniteOdds, int pBurnOdds) {
		this.builder(NeoForgeDataMaps.FLAMMABLE).add(BuiltInRegistries.ITEM.getKey(pItem), new Flammable(pIgniteOdds, pBurnOdds), false);
	}
}
