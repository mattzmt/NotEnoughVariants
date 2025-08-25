package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.block.ModBlockSetType;
import github.mattzmt.not_enough_variants.block.ModBlocks;
import github.mattzmt.not_enough_variants.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider<Item> {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(ModBlocks.NETHERRACK_DOOR.asItem())
                .add(ModBlocks.STONE_DOOR.asItem())
                .add(ModBlocks.COBBLESTONE_DOOR.asItem())
                .add(ModBlocks.GRANITE_DOOR.asItem())
                .add(ModBlocks.MOSSY_COBBLESTONE_DOOR.asItem())
                .add(ModBlocks.SMOOTH_STONE_DOOR.asItem())
                .add(ModBlocks.STONE_BRICK_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.NETHERRACK_WALL.asItem())
                .add(ModBlocks.STONE_WALL.asItem())
                .add(ModBlocks.OAK_WALL.asItem())
                .add(ModBlocks.SPRUCE_WALL.asItem())
                .add(ModBlocks.BIRCH_WALL.asItem())
                .add(ModBlocks.JUNGLE_WALL.asItem())
                .add(ModBlocks.ACACIA_WALL.asItem())
                .add(ModBlocks.DARK_OAK_WALL.asItem())
                .add(ModBlocks.MANGROVE_WALL.asItem())
                .add(ModBlocks.CHERRY_WALL.asItem())
                .add(ModBlocks.BAMBOO_WALL.asItem())
                .add(ModBlocks.CRIMSON_WALL.asItem())
                .add(ModBlocks.WARPED_WALL.asItem())
                .add(ModBlocks.SMOOTH_STONE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(ModItems.NETHERRACK_SIGN)
                .add(ModItems.STONE_SIGN)
                .add(ModItems.COBBLESTONE_SIGN)
                .add(ModItems.GRANITE_SIGN)
                .add(ModItems.MOSSY_COBBLESTONE_SIGN)
                .add(ModItems.SMOOTH_STONE_SIGN)
                .add(ModItems.STONE_BRICK_SIGN);

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModBlocks.NETHERRACK_FENCE.asItem())
                .add(ModBlocks.STONE_FENCE.asItem())
                .add(ModBlocks.COBBLESTONE_FENCE.asItem())
                .add(ModBlocks.GRANITE_FENCE.asItem())
                .add(ModBlocks.MOSSY_COBBLESTONE_FENCE.asItem())
                .add(ModBlocks.SMOOTH_STONE_FENCE.asItem())
                .add(ModBlocks.STONE_BRICK_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.NETHERRACK_FENCE_GATE.asItem())
                .add(ModBlocks.STONE_FENCE_GATE.asItem())
                .add(ModBlocks.COBBLESTONE_FENCE_GATE.asItem())
                .add(ModBlocks.GRANITE_FENCE_GATE.asItem())
                .add(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE.asItem())
                .add(ModBlocks.SMOOTH_STONE_FENCE_GATE.asItem())
                .add(ModBlocks.STONE_BRICK_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.NETHERRACK_STAIRS.asItem())
                .add(ModBlocks.SMOOTH_STONE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.NETHERRACK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(ModBlocks.NETHERRACK_TRAPDOOR.asItem())
                .add(ModBlocks.STONE_TRAPDOOR.asItem())
                .add(ModBlocks.COBBLESTONE_TRAPDOOR.asItem())
                .add(ModBlocks.GRANITE_TRAPDOOR.asItem())
                .add(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR.asItem())
                .add(ModBlocks.SMOOTH_STONE_TRAPDOOR.asItem())
                .add(ModBlocks.STONE_BRICK_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ModBlocks.NETHERRACK_BUTTON.asItem())
                .add(ModBlocks.COBBLESTONE_BUTTON.asItem())
                .add(ModBlocks.GRANITE_BUTTON.asItem())
                .add(ModBlocks.MOSSY_COBBLESTONE_BUTTON.asItem())
                .add(ModBlocks.SMOOTH_STONE_BUTTON.asItem())
                .add(ModBlocks.STONE_BRICK_BUTTON.asItem());
    }
}