package com.luxtracon.floralis.common.block;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class DyeBlock extends FallingBlock {
	public DyeBlock(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public int getDustColor(BlockState pBlockState, BlockGetter pBlockGetter, BlockPos pBlockPos) {
		return pBlockState.getMapColor(pBlockGetter, pBlockPos).col;
	}
}
