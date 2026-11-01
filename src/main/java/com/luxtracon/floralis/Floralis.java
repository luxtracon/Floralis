package com.luxtracon.floralis;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisCreativeModeTabs;
import com.luxtracon.floralis.common.registry.FloralisIds;
import com.luxtracon.floralis.common.registry.FloralisItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

@Mod(FloralisIds.ID)
public class Floralis {
	public Floralis(IEventBus pBus) {
		FloralisBlocks.BLOCKS.register(pBus);
		FloralisCreativeModeTabs.CREATIVE_MODE_TABS.register(pBus);
		FloralisItems.ITEMS.register(pBus);
	}
}
