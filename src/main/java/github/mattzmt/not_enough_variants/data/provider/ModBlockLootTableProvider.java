package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.init.ModBlocks;
import github.mattzmt.not_enough_variants.init.ModItems;
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
    }
}