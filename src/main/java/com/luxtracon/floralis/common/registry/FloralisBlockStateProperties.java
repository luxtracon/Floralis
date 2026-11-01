package com.luxtracon.floralis.common.registry;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlockStateProperties {
	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);
}
