package com.luxtracon.floralis.data.provider.tags;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.tags.FloralisBiomeTags;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.world.level.biome.Biomes;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBiomeTagsProvider extends BiomeTagsProvider {
	public FloralisBiomeTagsProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider, String pId) {
		super(pPackOutput, pProvider, pId);
	}

	@Override
	public void addTags(HolderLookup.Provider pProvider) {
		this.tag(FloralisBiomeTags.HAS_CACTUS)
			.add(Biomes.BADLANDS)
			.add(Biomes.DESERT)
			.add(Biomes.ERODED_BADLANDS)
			.add(Biomes.WOODED_BADLANDS);

		this.tag(FloralisBiomeTags.HAS_FLOWER)
			.add(Biomes.BADLANDS)
			.add(Biomes.BAMBOO_JUNGLE)
			.add(Biomes.BEACH)
			.add(Biomes.BIRCH_FOREST)
			.add(Biomes.COLD_OCEAN)
			.add(Biomes.CHERRY_GROVE)
			.add(Biomes.DAPPLED_FOREST)
			.add(Biomes.DARK_FOREST)
			.add(Biomes.DEEP_COLD_OCEAN)
			.add(Biomes.DEEP_DARK)
			.add(Biomes.DEEP_FROZEN_OCEAN)
			.add(Biomes.DEEP_LUKEWARM_OCEAN)
			.add(Biomes.DEEP_OCEAN)
			.add(Biomes.DESERT)
			.add(Biomes.DRIPSTONE_CAVES)
			.add(Biomes.ERODED_BADLANDS)
			.add(Biomes.FLOWER_FOREST)
			.add(Biomes.FOREST)
			.add(Biomes.FROZEN_OCEAN)
			.add(Biomes.FROZEN_PEAKS)
			.add(Biomes.FROZEN_RIVER)
			.add(Biomes.GROVE)
			.add(Biomes.ICE_SPIKES)
			.add(Biomes.JAGGED_PEAKS)
			.add(Biomes.JUNGLE)
			.add(Biomes.LUKEWARM_OCEAN)
			.add(Biomes.LUSH_CAVES)
			.add(Biomes.MANGROVE_SWAMP)
			.add(Biomes.MEADOW)
			.add(Biomes.MUSHROOM_FIELDS)
			.add(Biomes.OCEAN)
			.add(Biomes.OLD_GROWTH_BIRCH_FOREST)
			.add(Biomes.OLD_GROWTH_PINE_TAIGA)
			.add(Biomes.OLD_GROWTH_SPRUCE_TAIGA)
			.add(Biomes.PALE_GARDEN)
			.add(Biomes.PLAINS)
			.add(Biomes.RIVER)
			.add(Biomes.SAVANNA)
			.add(Biomes.SAVANNA_PLATEAU)
			.add(Biomes.SNOWY_BEACH)
			.add(Biomes.SNOWY_PLAINS)
			.add(Biomes.SNOWY_SLOPES)
			.add(Biomes.SNOWY_TAIGA)
			.add(Biomes.SPARSE_JUNGLE)
			.add(Biomes.STONY_PEAKS)
			.add(Biomes.STONY_SHORE)
			.add(Biomes.SULFUR_CAVES)
			.add(Biomes.SUNFLOWER_PLAINS)
			.add(Biomes.SWAMP)
			.add(Biomes.TAIGA)
			.add(Biomes.WARM_OCEAN)
			.add(Biomes.WINDSWEPT_FOREST)
			.add(Biomes.WINDSWEPT_GRAVELLY_HILLS)
			.add(Biomes.WINDSWEPT_HILLS)
			.add(Biomes.WINDSWEPT_SAVANNA)
			.add(Biomes.WOODED_BADLANDS);
	}

	@Override
	public String getName() {
		return "Biome Tags";
	}
}
