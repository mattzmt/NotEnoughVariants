package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.init.ModBlocks;
import github.mattzmt.not_enough_variants.init.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        var netherrackFamily = new BlockFamily.Builder(Blocks.NETHERRACK)
                .door(ModBlocks.NETHERRACK_DOOR)
                .wall(ModBlocks.NETHERRACK_WALL)
                .fence(ModBlocks.NETHERRACK_FENCE)
                .fenceGate(ModBlocks.NETHERRACK_FENCE_GATE)
                .stairs(ModBlocks.NETHERRACK_STAIRS)
                .slab(ModBlocks.NETHERRACK_SLAB)
                .trapdoor(ModBlocks.NETHERRACK_TRAPDOOR)
                .pressurePlate(ModBlocks.NETHERRACK_PRESSURE_PLATE)
                .button(ModBlocks.NETHERRACK_BUTTON)
                .sign(ModBlocks.NETHERRACK_SIGN, ModBlocks.NETHERRACK_WALL_SIGN)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(netherrackFamily.getBaseBlock()).family(netherrackFamily);
        var stoneFamily = new BlockFamily.Builder(Blocks.STONE)
                .door(ModBlocks.STONE_DOOR)
                .wall(ModBlocks.STONE_WALL)
                .sign(ModBlocks.STONE_SIGN, ModBlocks.STONE_WALL_SIGN)
                .fence(ModBlocks.STONE_FENCE)
                .fenceGate(ModBlocks.STONE_FENCE_GATE)
                .trapdoor(ModBlocks.STONE_TRAPDOOR)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(stoneFamily.getBaseBlock()).family(stoneFamily);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BUSH_HAMMER, Models.HANDHELD);
    }
}