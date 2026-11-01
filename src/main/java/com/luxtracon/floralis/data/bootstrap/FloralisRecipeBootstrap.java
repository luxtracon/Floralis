package com.luxtracon.floralis.data.bootstrap;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.data.provider.FloralisRecipeProvider;

import java.util.Set;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisRecipeBootstrap implements MultiRegistryBootstrap {

	@Override
	public Set<ResourceKey<? extends Registry<?>>> requestedRegistries() {
		return Set.of(Registries.RECIPE, Registries.ADVANCEMENT);
	}

	@Override
	public void run(BootstrapGetter registries) {
		new FloralisRecipeProvider(registries.get(Registries.RECIPE), registries.get(Registries.ADVANCEMENT)).buildRecipes();
	}
}
