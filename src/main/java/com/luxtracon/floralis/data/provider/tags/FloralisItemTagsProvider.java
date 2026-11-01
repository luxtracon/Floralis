package com.luxtracon.floralis.data.provider.tags;

import com.luxtracon.floralis.annotation.MethodsReturnNonnullByDefault;
import com.luxtracon.floralis.annotation.ParametersAreNonnullByDefault;
import com.luxtracon.floralis.common.ids.FloralisBlockItemIds;
import com.luxtracon.floralis.common.ids.FloralisItemIds;
import com.luxtracon.floralis.common.tags.FloralisBlockItemTags;
import com.luxtracon.floralis.common.tags.FloralisItemTags;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.ItemTags;

import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisItemTagsProvider extends ItemTagsProvider {
	public FloralisItemTagsProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider, String pId) {
		super(pPackOutput, pProvider, pId);
	}

	@Override
	public void addTags(HolderLookup.Provider pProvider) {
		this.tag(ItemTags.CAMEL_FOOD)
			.add(FloralisBlockItemIds.WHITE_CACTUS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_CACTUS.item())
			.add(FloralisBlockItemIds.GRAY_CACTUS.item())
			.add(FloralisBlockItemIds.BLACK_CACTUS.item())
			.add(FloralisBlockItemIds.BROWN_CACTUS.item())
			.add(FloralisBlockItemIds.RED_CACTUS.item())
			.add(FloralisBlockItemIds.ORANGE_CACTUS.item())
			.add(FloralisBlockItemIds.YELLOW_CACTUS.item())
			.add(FloralisBlockItemIds.LIME_CACTUS.item())
			.add(FloralisBlockItemIds.GREEN_CACTUS.item())
			.add(FloralisBlockItemIds.CYAN_CACTUS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_CACTUS.item())
			.add(FloralisBlockItemIds.BLUE_CACTUS.item())
			.add(FloralisBlockItemIds.PURPLE_CACTUS.item())
			.add(FloralisBlockItemIds.MAGENTA_CACTUS.item())
			.add(FloralisBlockItemIds.PINK_CACTUS.item());

		this.tag(ItemTags.CHICKEN_FOOD)
			.add(FloralisBlockItemIds.WHITE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.GRAY_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BLACK_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BROWN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.RED_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.ORANGE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.YELLOW_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIME_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.GREEN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.CYAN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BLUE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.PURPLE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.MAGENTA_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.PINK_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.WHITE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.GRAY_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BLACK_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BROWN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.RED_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.ORANGE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.YELLOW_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIME_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.GREEN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.CYAN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BLUE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.PURPLE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.MAGENTA_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.PINK_FLOWER_SEEDS.item());

		this.tag(ItemTags.PARROT_FOOD)
			.add(FloralisBlockItemIds.WHITE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.GRAY_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BLACK_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BROWN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.RED_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.ORANGE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.YELLOW_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIME_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.GREEN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.CYAN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BLUE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.PURPLE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.MAGENTA_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.PINK_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.WHITE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.GRAY_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BLACK_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BROWN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.RED_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.ORANGE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.YELLOW_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIME_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.GREEN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.CYAN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BLUE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.PURPLE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.MAGENTA_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.PINK_FLOWER_SEEDS.item());

		this.tag(ItemTags.SULFUR_CUBE_ARCHETYPE_FAST_FLAT)
			.add(FloralisBlockItemIds.PLANT_FIBERS_BLOCK.item());

		this.tag(ItemTags.SULFUR_CUBE_ARCHETYPE_REGULAR)
			.add(FloralisBlockItemIds.WHITE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.GRAY_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.BLACK_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.BROWN_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.RED_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.ORANGE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.YELLOW_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.LIME_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.GREEN_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.CYAN_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.BLUE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.PURPLE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.MAGENTA_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.PINK_DYE_BLOCK.item());

		this.tag(ItemTags.VILLAGER_PICKS_UP)
			.add(FloralisItemIds.WHITE_PETALS)
			.add(FloralisItemIds.LIGHT_GRAY_PETALS)
			.add(FloralisItemIds.GRAY_PETALS)
			.add(FloralisItemIds.BLACK_PETALS)
			.add(FloralisItemIds.BROWN_PETALS)
			.add(FloralisItemIds.RED_PETALS)
			.add(FloralisItemIds.ORANGE_PETALS)
			.add(FloralisItemIds.YELLOW_PETALS)
			.add(FloralisItemIds.LIME_PETALS)
			.add(FloralisItemIds.GREEN_PETALS)
			.add(FloralisItemIds.CYAN_PETALS)
			.add(FloralisItemIds.LIGHT_BLUE_PETALS)
			.add(FloralisItemIds.BLUE_PETALS)
			.add(FloralisItemIds.PURPLE_PETALS)
			.add(FloralisItemIds.MAGENTA_PETALS)
			.add(FloralisItemIds.PINK_PETALS)
			.add(FloralisItemIds.PLANT_FIBERS);

		this.tag(ItemTags.VILLAGER_PLANTABLE_SEEDS)
			.add(FloralisBlockItemIds.WHITE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.GRAY_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BLACK_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BROWN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.RED_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.ORANGE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.YELLOW_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIME_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.GREEN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.CYAN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BLUE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.PURPLE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.MAGENTA_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.PINK_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.WHITE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.GRAY_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BLACK_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BROWN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.RED_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.ORANGE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.YELLOW_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIME_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.GREEN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.CYAN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BLUE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.PURPLE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.MAGENTA_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.PINK_FLOWER_SEEDS.item());

		this.tag(Tags.Items.FERTILIZERS)
			.add(FloralisItemIds.PLANT_FIBERS);

		this.tag(Tags.Items.SEEDS)
			.addTag(FloralisItemTags.SEEDS_CACTUS)
			.addTag(FloralisItemTags.SEEDS_FLOWER);

		this.tag(FloralisItemTags.SEEDS_CACTUS)
			.add(FloralisBlockItemIds.WHITE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.GRAY_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BLACK_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BROWN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.RED_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.ORANGE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.YELLOW_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIME_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.GREEN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.CYAN_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.BLUE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.PURPLE_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.MAGENTA_CACTUS_SEEDS.item())
			.add(FloralisBlockItemIds.PINK_CACTUS_SEEDS.item());

		this.tag(FloralisItemTags.SEEDS_FLOWER)
			.add(FloralisBlockItemIds.WHITE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.GRAY_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BLACK_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BROWN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.RED_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.ORANGE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.YELLOW_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIME_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.GREEN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.CYAN_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.BLUE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.PURPLE_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.MAGENTA_FLOWER_SEEDS.item())
			.add(FloralisBlockItemIds.PINK_FLOWER_SEEDS.item());

		this.tag(BlockItemTags.BEE_FOOD.item())
			.add(FloralisBlockItemIds.WHITE_CACTUS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_CACTUS.item())
			.add(FloralisBlockItemIds.GRAY_CACTUS.item())
			.add(FloralisBlockItemIds.BLACK_CACTUS.item())
			.add(FloralisBlockItemIds.BROWN_CACTUS.item())
			.add(FloralisBlockItemIds.RED_CACTUS.item())
			.add(FloralisBlockItemIds.ORANGE_CACTUS.item())
			.add(FloralisBlockItemIds.YELLOW_CACTUS.item())
			.add(FloralisBlockItemIds.LIME_CACTUS.item())
			.add(FloralisBlockItemIds.GREEN_CACTUS.item())
			.add(FloralisBlockItemIds.CYAN_CACTUS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_CACTUS.item())
			.add(FloralisBlockItemIds.BLUE_CACTUS.item())
			.add(FloralisBlockItemIds.PURPLE_CACTUS.item())
			.add(FloralisBlockItemIds.MAGENTA_CACTUS.item())
			.add(FloralisBlockItemIds.PINK_CACTUS.item())
			.add(FloralisBlockItemIds.WHITE_FLOWER.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_FLOWER.item())
			.add(FloralisBlockItemIds.GRAY_FLOWER.item())
			.add(FloralisBlockItemIds.BLACK_FLOWER.item())
			.add(FloralisBlockItemIds.BROWN_FLOWER.item())
			.add(FloralisBlockItemIds.RED_FLOWER.item())
			.add(FloralisBlockItemIds.ORANGE_FLOWER.item())
			.add(FloralisBlockItemIds.YELLOW_FLOWER.item())
			.add(FloralisBlockItemIds.LIME_FLOWER.item())
			.add(FloralisBlockItemIds.GREEN_FLOWER.item())
			.add(FloralisBlockItemIds.CYAN_FLOWER.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_FLOWER.item())
			.add(FloralisBlockItemIds.BLUE_FLOWER.item())
			.add(FloralisBlockItemIds.PURPLE_FLOWER.item())
			.add(FloralisBlockItemIds.MAGENTA_FLOWER.item())
			.add(FloralisBlockItemIds.PINK_FLOWER.item());

		this.tag(BlockItemTags.SMALL_FLOWERS.item())
			.add(FloralisBlockItemIds.WHITE_CACTUS.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_CACTUS.item())
			.add(FloralisBlockItemIds.GRAY_CACTUS.item())
			.add(FloralisBlockItemIds.BLACK_CACTUS.item())
			.add(FloralisBlockItemIds.BROWN_CACTUS.item())
			.add(FloralisBlockItemIds.RED_CACTUS.item())
			.add(FloralisBlockItemIds.ORANGE_CACTUS.item())
			.add(FloralisBlockItemIds.YELLOW_CACTUS.item())
			.add(FloralisBlockItemIds.LIME_CACTUS.item())
			.add(FloralisBlockItemIds.GREEN_CACTUS.item())
			.add(FloralisBlockItemIds.CYAN_CACTUS.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_CACTUS.item())
			.add(FloralisBlockItemIds.BLUE_CACTUS.item())
			.add(FloralisBlockItemIds.PURPLE_CACTUS.item())
			.add(FloralisBlockItemIds.MAGENTA_CACTUS.item())
			.add(FloralisBlockItemIds.PINK_CACTUS.item())
			.add(FloralisBlockItemIds.WHITE_FLOWER.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_FLOWER.item())
			.add(FloralisBlockItemIds.GRAY_FLOWER.item())
			.add(FloralisBlockItemIds.BLACK_FLOWER.item())
			.add(FloralisBlockItemIds.BROWN_FLOWER.item())
			.add(FloralisBlockItemIds.RED_FLOWER.item())
			.add(FloralisBlockItemIds.ORANGE_FLOWER.item())
			.add(FloralisBlockItemIds.YELLOW_FLOWER.item())
			.add(FloralisBlockItemIds.LIME_FLOWER.item())
			.add(FloralisBlockItemIds.GREEN_FLOWER.item())
			.add(FloralisBlockItemIds.CYAN_FLOWER.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_FLOWER.item())
			.add(FloralisBlockItemIds.BLUE_FLOWER.item())
			.add(FloralisBlockItemIds.PURPLE_FLOWER.item())
			.add(FloralisBlockItemIds.MAGENTA_FLOWER.item())
			.add(FloralisBlockItemIds.PINK_FLOWER.item());

		this.tag(Tags.BlockItems.STORAGE_BLOCKS.item())
			.addTag(FloralisBlockItemTags.STORAGE_BLOCKS_DYE.item())
			.addTag(FloralisBlockItemTags.STORAGE_BLOCKS_PLANT_FIBERS.item());

		this.tag(FloralisBlockItemTags.STORAGE_BLOCKS_DYE.item())
			.add(FloralisBlockItemIds.WHITE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.LIGHT_GRAY_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.GRAY_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.BLACK_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.BROWN_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.RED_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.ORANGE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.YELLOW_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.LIME_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.GREEN_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.CYAN_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.LIGHT_BLUE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.BLUE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.PURPLE_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.MAGENTA_DYE_BLOCK.item())
			.add(FloralisBlockItemIds.PINK_DYE_BLOCK.item());

		this.tag(FloralisBlockItemTags.STORAGE_BLOCKS_PLANT_FIBERS.item())
			.add(FloralisBlockItemIds.PLANT_FIBERS_BLOCK.item());
	}

	@Override
	public String getName() {
		return "Item Tags";
	}
}
