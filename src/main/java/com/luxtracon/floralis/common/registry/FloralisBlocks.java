package com.luxtracon.floralis.common.registry;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.block.*;
import com.luxtracon.floralis.common.ids.FloralisBlockIds;
import com.luxtracon.floralis.common.ids.FloralisBlockItemIds;

import java.util.function.Function;

import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, FloralisIds.ID);

	public static final DeferredHolder<Block, Block> WHITE_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.WHITE_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.SNOW), DyeBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_GRAY_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_GRAY), DyeBlock::new);
	public static final DeferredHolder<Block, Block> GRAY_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.GRAY_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_GRAY), DyeBlock::new);
	public static final DeferredHolder<Block, Block> BLACK_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.BLACK_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BLACK), DyeBlock::new);
	public static final DeferredHolder<Block, Block> BROWN_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.BROWN_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BROWN), DyeBlock::new);
	public static final DeferredHolder<Block, Block> RED_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.RED_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_RED), DyeBlock::new);
	public static final DeferredHolder<Block, Block> ORANGE_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.ORANGE_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_ORANGE), DyeBlock::new);
	public static final DeferredHolder<Block, Block> YELLOW_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.YELLOW_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_YELLOW), DyeBlock::new);
	public static final DeferredHolder<Block, Block> LIME_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.LIME_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_GREEN), DyeBlock::new);
	public static final DeferredHolder<Block, Block> GREEN_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.GREEN_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_GREEN), DyeBlock::new);
	public static final DeferredHolder<Block, Block> CYAN_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.CYAN_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_CYAN), DyeBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_BLUE_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_LIGHT_BLUE), DyeBlock::new);
	public static final DeferredHolder<Block, Block> BLUE_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.BLUE_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_BLUE), DyeBlock::new);
	public static final DeferredHolder<Block, Block> PURPLE_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.PURPLE_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_PURPLE), DyeBlock::new);
	public static final DeferredHolder<Block, Block> MAGENTA_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.MAGENTA_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_MAGENTA), DyeBlock::new);
	public static final DeferredHolder<Block, Block> PINK_DYE_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.PINK_DYE_BLOCK, FloralisBlocks.propertiesDyeBlock(MapColor.COLOR_PINK), DyeBlock::new);

	public static final DeferredHolder<Block, Block> PLANT_FIBERS_BLOCK = FloralisBlocks.register(FloralisBlockItemIds.PLANT_FIBERS_BLOCK, FloralisBlocks.propertiesPlantFibersBlock(MapColor.COLOR_GREEN), PlantFibersBlock::new);

	public static final DeferredHolder<Block, Block> WHITE_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.WHITE_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_GRAY_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> GRAY_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.GRAY_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> BLACK_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.BLACK_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> BROWN_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.BROWN_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> RED_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.RED_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> ORANGE_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.ORANGE_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> YELLOW_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.YELLOW_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> LIME_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.LIME_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> GREEN_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.GREEN_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> CYAN_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.CYAN_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_BLUE_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> BLUE_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.BLUE_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> PURPLE_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.PURPLE_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> MAGENTA_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.MAGENTA_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);
	public static final DeferredHolder<Block, Block> PINK_CACTUS = FloralisBlocks.register(FloralisBlockItemIds.PINK_CACTUS, FloralisBlocks.propertiesBush(MapColor.PLANT), CactusBushBlock::new);

	public static final DeferredHolder<Block, Block> WHITE_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.WHITE_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_GRAY_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> GRAY_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.GRAY_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> BLACK_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.BLACK_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> BROWN_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.BROWN_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> RED_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.RED_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> ORANGE_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.ORANGE_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> YELLOW_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.YELLOW_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> LIME_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.LIME_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> GREEN_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.GREEN_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> CYAN_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.CYAN_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_BLUE_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> BLUE_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.BLUE_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> PURPLE_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.PURPLE_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> MAGENTA_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.MAGENTA_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);
	public static final DeferredHolder<Block, Block> PINK_FLOWER = FloralisBlocks.register(FloralisBlockItemIds.PINK_FLOWER, FloralisBlocks.propertiesBush(MapColor.PLANT), FlowerBushBlock::new);

	public static final DeferredHolder<Block, Block> WHITE_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.WHITE_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_GRAY_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> GRAY_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.GRAY_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> BLACK_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.BLACK_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> BROWN_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.BROWN_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> RED_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.RED_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> ORANGE_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.ORANGE_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> YELLOW_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.YELLOW_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> LIME_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.LIME_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> GREEN_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.GREEN_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> CYAN_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.CYAN_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_BLUE_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> BLUE_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.BLUE_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> PURPLE_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.PURPLE_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> MAGENTA_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.MAGENTA_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);
	public static final DeferredHolder<Block, Block> PINK_CACTUS_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.PINK_CACTUS_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), CactusCropBlock::new);

	public static final DeferredHolder<Block, Block> WHITE_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.WHITE_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_GRAY_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_GRAY_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> GRAY_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.GRAY_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> BLACK_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.BLACK_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> BROWN_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.BROWN_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> RED_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.RED_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> ORANGE_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.ORANGE_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> YELLOW_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.YELLOW_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> LIME_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.LIME_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> GREEN_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.GREEN_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> CYAN_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.CYAN_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.LIGHT_BLUE_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> BLUE_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.BLUE_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> PURPLE_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.PURPLE_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> MAGENTA_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.MAGENTA_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);
	public static final DeferredHolder<Block, Block> PINK_FLOWER_SEEDS = FloralisBlocks.register(FloralisBlockItemIds.PINK_FLOWER_SEEDS, FloralisBlocks.propertiesCrop(MapColor.PLANT), FlowerCropBlock::new);

	public static final DeferredHolder<Block, Block> POTTED_WHITE_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_WHITE_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.WHITE_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_LIGHT_GRAY_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_LIGHT_GRAY_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIGHT_GRAY_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_GRAY_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_GRAY_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.GRAY_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_BLACK_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_BLACK_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BLACK_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_BROWN_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_BROWN_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BROWN_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_RED_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_RED_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.RED_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_ORANGE_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_ORANGE_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.ORANGE_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_YELLOW_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_YELLOW_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.YELLOW_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_LIME_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_LIME_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIME_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_GREEN_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_GREEN_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.GREEN_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_CYAN_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_CYAN_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.CYAN_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_LIGHT_BLUE_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_LIGHT_BLUE_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIGHT_BLUE_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_BLUE_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_BLUE_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BLUE_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_PURPLE_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_PURPLE_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.PURPLE_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_MAGENTA_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_MAGENTA_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.MAGENTA_CACTUS, properties));
	public static final DeferredHolder<Block, Block> POTTED_PINK_CACTUS = FloralisBlocks.register(FloralisBlockIds.POTTED_PINK_CACTUS, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.PINK_CACTUS, properties));

	public static final DeferredHolder<Block, Block> POTTED_WHITE_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_WHITE_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.WHITE_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_LIGHT_GRAY_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_LIGHT_GRAY_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIGHT_GRAY_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_GRAY_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_GRAY_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.GRAY_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_BLACK_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_BLACK_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BLACK_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_BROWN_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_BROWN_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BROWN_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_RED_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_RED_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.RED_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_ORANGE_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_ORANGE_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.ORANGE_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_YELLOW_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_YELLOW_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.YELLOW_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_LIME_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_LIME_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIME_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_GREEN_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_GREEN_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.GREEN_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_CYAN_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_CYAN_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.CYAN_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_LIGHT_BLUE_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_LIGHT_BLUE_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.LIGHT_BLUE_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_BLUE_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_BLUE_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.BLUE_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_PURPLE_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_PURPLE_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.PURPLE_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_MAGENTA_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_MAGENTA_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.MAGENTA_FLOWER, properties));
	public static final DeferredHolder<Block, Block> POTTED_PINK_FLOWER = FloralisBlocks.register(FloralisBlockIds.POTTED_PINK_FLOWER, FloralisBlocks.propertiesPotted(MapColor.NONE), properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, FloralisBlocks.PINK_FLOWER, properties));

	public static BlockBehaviour.Properties propertiesDyeBlock(MapColor pMapColor) {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.SNARE).mapColor(pMapColor).pushReaction(PushReaction.PUSH_PULL).sound(SoundType.SAND).explosionResistance(0.5F).strength(0.5F);
	}

	public static BlockBehaviour.Properties propertiesPlantFibersBlock(MapColor pMapColor) {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BANJO).mapColor(pMapColor).pushReaction(PushReaction.PUSH_PULL).sound(SoundType.GRASS).explosionResistance(0.5F).strength(0.5F);
	}

	public static BlockBehaviour.Properties propertiesBush(MapColor pMapColor) {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HARP).mapColor(pMapColor).pushReaction(PushReaction.POPPED).sound(SoundType.GRASS).instabreak();
	}

	public static BlockBehaviour.Properties propertiesCrop(MapColor pMapColor) {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HARP).mapColor(pMapColor).pushReaction(PushReaction.POPPED).sound(SoundType.CROP).instabreak().randomTicks();
	}

	public static BlockBehaviour.Properties propertiesPotted(MapColor pMapColor) {
		return BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HARP).mapColor(pMapColor).pushReaction(PushReaction.POPPED).sound(SoundType.STONE).instabreak().noOcclusion();
	}

	public static <T extends Block> DeferredHolder<Block, T> register(BlockItemId pBlockItemId, BlockBehaviour.Properties pProperties, Function<BlockBehaviour.Properties, T> pFunction) {
		return FloralisBlocks.BLOCKS.register(pBlockItemId.block().identifier().getPath(), () -> pFunction.apply(pProperties.setId(pBlockItemId.block())));
	}

	public static <T extends Block> DeferredHolder<Block, T> register(ResourceKey<Block> pResourceKey, BlockBehaviour.Properties pProperties, Function<BlockBehaviour.Properties, T> pFunction) {
		return FloralisBlocks.BLOCKS.register(pResourceKey.identifier().getPath(), () -> pFunction.apply(pProperties.setId(pResourceKey)));
	}
}
