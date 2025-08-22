package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.block.ModBlocks;
import github.mattzmt.not_enough_variants.item.ModItems;
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

        var cobblestoneFamily = new BlockFamily.Builder(Blocks.COBBLESTONE)
                .door(ModBlocks.COBBLESTONE_DOOR)
                .sign(ModBlocks.COBBLESTONE_SIGN, ModBlocks.COBBLESTONE_WALL_SIGN)
                .fence(ModBlocks.COBBLESTONE_FENCE)
                .fenceGate(ModBlocks.COBBLESTONE_FENCE_GATE)
                .trapdoor(ModBlocks.COBBLESTONE_TRAPDOOR)
                .pressurePlate(ModBlocks.COBBLESTONE_PRESSURE_PLATE)
                .button(ModBlocks.COBBLESTONE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(cobblestoneFamily.getBaseBlock()).family(cobblestoneFamily);

        var graniteFamily = new BlockFamily.Builder(Blocks.GRANITE)
                .door(ModBlocks.GRANITE_DOOR)
                .sign(ModBlocks.GRANITE_SIGN, ModBlocks.GRANITE_WALL_SIGN)
                .fence(ModBlocks.GRANITE_FENCE)
                .fenceGate(ModBlocks.GRANITE_FENCE_GATE)
                .trapdoor(ModBlocks.GRANITE_TRAPDOOR)
                .pressurePlate(ModBlocks.GRANITE_PRESSURE_PLATE)
                .button(ModBlocks.GRANITE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(graniteFamily.getBaseBlock()).family(graniteFamily);

        var mossyCobblestoneFamily = new BlockFamily.Builder(Blocks.MOSSY_COBBLESTONE)
                .door(ModBlocks.MOSSY_COBBLESTONE_DOOR)
                .sign(ModBlocks.MOSSY_COBBLESTONE_SIGN, ModBlocks.MOSSY_COBBLESTONE_WALL_SIGN)
                .fence(ModBlocks.MOSSY_COBBLESTONE_FENCE)
                .fenceGate(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE)
                .trapdoor(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR)
                .pressurePlate(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE)
                .button(ModBlocks.MOSSY_COBBLESTONE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(mossyCobblestoneFamily.getBaseBlock()).family(mossyCobblestoneFamily);

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OAK_PLANKS)
                .wall(ModBlocks.OAK_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SPRUCE_PLANKS)
                .wall(ModBlocks.SPRUCE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BIRCH_PLANKS)
                .wall(ModBlocks.BIRCH_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.JUNGLE_PLANKS)
                .wall(ModBlocks.JUNGLE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ACACIA_PLANKS)
                .wall(ModBlocks.ACACIA_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_OAK_PLANKS)
                .wall(ModBlocks.DARK_OAK_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MANGROVE_PLANKS)
                .wall(ModBlocks.MANGROVE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHERRY_PLANKS)
                .wall(ModBlocks.CHERRY_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_PLANKS)
                .wall(ModBlocks.BAMBOO_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRIMSON_PLANKS)
                .wall(ModBlocks.CRIMSON_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WARPED_PLANKS)
                .wall(ModBlocks.WARPED_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BUSH_HAMMER, Models.HANDHELD);
    }
}