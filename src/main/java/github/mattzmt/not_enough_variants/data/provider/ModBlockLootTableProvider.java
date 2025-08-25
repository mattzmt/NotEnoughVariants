package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.block.ModBlocks;
import github.mattzmt.not_enough_variants.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.NETHERRACK_DOOR, doorDrops(ModBlocks.NETHERRACK_DOOR));
        addDrop(ModBlocks.NETHERRACK_WALL);
        addDrop(ModBlocks.NETHERRACK_FENCE);
        addDrop(ModBlocks.NETHERRACK_FENCE_GATE);
        addDrop(ModBlocks.NETHERRACK_STAIRS);
        addDrop(ModBlocks.NETHERRACK_SLAB, slabDrops(ModBlocks.NETHERRACK_SLAB));
        addDrop(ModBlocks.NETHERRACK_TRAPDOOR);
        addDrop(ModBlocks.NETHERRACK_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHERRACK_BUTTON);
        addDrop(ModBlocks.NETHERRACK_SIGN, ModItems.NETHERRACK_SIGN);
        addDrop(ModBlocks.NETHERRACK_WALL_SIGN, ModItems.NETHERRACK_SIGN);

        addDrop(ModBlocks.STONE_DOOR, doorDrops(ModBlocks.STONE_DOOR));
        addDrop(ModBlocks.STONE_WALL);
        addDrop(ModBlocks.STONE_FENCE);
        addDrop(ModBlocks.STONE_FENCE_GATE);
        addDrop(ModBlocks.STONE_TRAPDOOR);
        addDrop(ModBlocks.STONE_SIGN, ModItems.STONE_SIGN);
        addDrop(ModBlocks.STONE_WALL_SIGN, ModItems.STONE_SIGN);

        addDrop(ModBlocks.GRANITE_DOOR, doorDrops(ModBlocks.GRANITE_DOOR));
        addDrop(ModBlocks.GRANITE_FENCE);
        addDrop(ModBlocks.GRANITE_FENCE_GATE);
        addDrop(ModBlocks.GRANITE_TRAPDOOR);
        addDrop(ModBlocks.GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.GRANITE_BUTTON);
        addDrop(ModBlocks.GRANITE_SIGN, ModItems.GRANITE_SIGN);
        addDrop(ModBlocks.GRANITE_WALL_SIGN, ModItems.GRANITE_SIGN);

        addDrop(ModBlocks.OAK_WALL);
        addDrop(ModBlocks.SPRUCE_WALL);
        addDrop(ModBlocks.BIRCH_WALL);
        addDrop(ModBlocks.JUNGLE_WALL);
        addDrop(ModBlocks.ACACIA_WALL);
        addDrop(ModBlocks.DARK_OAK_WALL);
        addDrop(ModBlocks.MANGROVE_WALL);
        addDrop(ModBlocks.CHERRY_WALL);
        addDrop(ModBlocks.BAMBOO_WALL);
        addDrop(ModBlocks.CRIMSON_WALL);
        addDrop(ModBlocks.WARPED_WALL);

        addDrop(ModBlocks.MOSSY_COBBLESTONE_DOOR, doorDrops(ModBlocks.MOSSY_COBBLESTONE_DOOR));
        addDrop(ModBlocks.MOSSY_COBBLESTONE_FENCE);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_BUTTON);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_SIGN, ModItems.MOSSY_COBBLESTONE_SIGN);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_WALL_SIGN, ModItems.MOSSY_COBBLESTONE_SIGN);

        addDrop(ModBlocks.SMOOTH_STONE_DOOR, doorDrops(ModBlocks.SMOOTH_STONE_DOOR));
        addDrop(ModBlocks.SMOOTH_STONE_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_FENCE);
        addDrop(ModBlocks.SMOOTH_STONE_FENCE_GATE);
        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_TRAPDOOR);
        addDrop(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_STONE_BUTTON);
        addDrop(ModBlocks.SMOOTH_STONE_SIGN, ModItems.SMOOTH_STONE_SIGN);
        addDrop(ModBlocks.SMOOTH_STONE_WALL_SIGN, ModItems.SMOOTH_STONE_SIGN);

        addDrop(ModBlocks.STONE_BRICK_DOOR, doorDrops(ModBlocks.STONE_BRICK_DOOR));
        addDrop(ModBlocks.STONE_BRICK_FENCE);
        addDrop(ModBlocks.STONE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.STONE_BRICK_TRAPDOOR);
        addDrop(ModBlocks.STONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.STONE_BRICK_BUTTON);
        addDrop(ModBlocks.STONE_BRICK_SIGN, ModItems.STONE_BRICK_SIGN);
        addDrop(ModBlocks.STONE_BRICK_WALL_SIGN, ModItems.STONE_BRICK_SIGN);

        addDrop(ModBlocks.CRACKED_STONE_BRICK_DOOR, doorDrops(ModBlocks.CRACKED_STONE_BRICK_DOOR));
        addDrop(ModBlocks.CRACKED_STONE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_FENCE);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_STONE_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_STONE_BRICK_TRAPDOOR);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_BUTTON);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_SIGN, ModItems.CRACKED_STONE_BRICK_SIGN);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_WALL_SIGN, ModItems.CRACKED_STONE_BRICK_SIGN);
    }
}