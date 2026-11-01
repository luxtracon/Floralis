package com.luxtracon.floralis.data.provider.loot;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;

import java.util.List;
import java.util.Set;

import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisLootTableProvider extends LootTableProvider {
	public FloralisLootTableProvider() {
		super(
			Set.of(), List.of(
				new LootTableProvider.SubProviderEntry(FloralisBlockLootSubProvider::new, LootContextParamSets.BLOCK)
			)
		);
	}
}
