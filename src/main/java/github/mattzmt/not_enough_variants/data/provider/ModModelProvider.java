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

        var smoothStoneFamily = new BlockFamily.Builder(Blocks.SMOOTH_STONE)
                .door(ModBlocks.SMOOTH_STONE_DOOR)
                .wall(ModBlocks.SMOOTH_STONE_WALL)
                .sign(ModBlocks.SMOOTH_STONE_SIGN, ModBlocks.SMOOTH_STONE_WALL_SIGN)
                .fence(ModBlocks.SMOOTH_STONE_FENCE)
                .fenceGate(ModBlocks.SMOOTH_STONE_FENCE_GATE)
                .stairs(ModBlocks.SMOOTH_STONE_STAIRS)
                .trapdoor(ModBlocks.SMOOTH_STONE_TRAPDOOR)
                .pressurePlate(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE)
                .button(ModBlocks.SMOOTH_STONE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(smoothStoneFamily.getBaseBlock()).family(smoothStoneFamily);

        var stoneBrickFamily = new BlockFamily.Builder(Blocks.STONE_BRICKS)
                .door(ModBlocks.STONE_BRICK_DOOR)
                .sign(ModBlocks.STONE_BRICK_SIGN, ModBlocks.STONE_BRICK_WALL_SIGN)
                .fence(ModBlocks.STONE_BRICK_FENCE)
                .fenceGate(ModBlocks.STONE_BRICK_FENCE_GATE)
                .trapdoor(ModBlocks.STONE_BRICK_TRAPDOOR)
                .pressurePlate(ModBlocks.STONE_BRICK_PRESSURE_PLATE)
                .button(ModBlocks.STONE_BRICK_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(stoneBrickFamily.getBaseBlock()).family(stoneBrickFamily);

        var crackedStoneBrickFamily = new BlockFamily.Builder(Blocks.CRACKED_STONE_BRICKS)
                .door(ModBlocks.CRACKED_STONE_BRICK_DOOR)
                .wall(ModBlocks.CRACKED_STONE_BRICK_WALL)
                .sign(ModBlocks.CRACKED_STONE_BRICK_SIGN, ModBlocks.CRACKED_STONE_BRICK_WALL_SIGN)
                .fence(ModBlocks.CRACKED_STONE_BRICK_FENCE)
                .fenceGate(ModBlocks.CRACKED_STONE_BRICK_FENCE_GATE)
                .stairs(ModBlocks.CRACKED_STONE_BRICK_STAIRS)
                .slab(ModBlocks.CRACKED_STONE_BRICK_SLAB)
                .trapdoor(ModBlocks.CRACKED_STONE_BRICK_TRAPDOOR)
                .pressurePlate(ModBlocks.CRACKED_STONE_BRICK_PRESSURE_PLATE)
                .button(ModBlocks.CRACKED_STONE_BRICK_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(crackedStoneBrickFamily.getBaseBlock()).family(crackedStoneBrickFamily);

        var chiseledStoneBrickFamily = new BlockFamily.Builder(Blocks.CHISELED_STONE_BRICKS)
                .door(ModBlocks.CHISELED_STONE_BRICK_DOOR)
                .wall(ModBlocks.CHISELED_STONE_BRICK_WALL)
                .sign(ModBlocks.CHISELED_STONE_BRICK_SIGN, ModBlocks.CHISELED_STONE_BRICK_WALL_SIGN)
                .fence(ModBlocks.CHISELED_STONE_BRICK_FENCE)
                .fenceGate(ModBlocks.CHISELED_STONE_BRICK_FENCE_GATE)
                .stairs(ModBlocks.CHISELED_STONE_BRICK_STAIRS)
                .slab(ModBlocks.CHISELED_STONE_BRICK_SLAB)
                .trapdoor(ModBlocks.CHISELED_STONE_BRICK_TRAPDOOR)
                .pressurePlate(ModBlocks.CHISELED_STONE_BRICK_PRESSURE_PLATE)
                .button(ModBlocks.CHISELED_STONE_BRICK_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(chiseledStoneBrickFamily.getBaseBlock()).family(chiseledStoneBrickFamily);

        var mossyStoneBrickFamily = new BlockFamily.Builder(Blocks.MOSSY_STONE_BRICKS)
                .door(ModBlocks.MOSSY_STONE_BRICK_DOOR)
                .sign(ModBlocks.MOSSY_STONE_BRICK_SIGN, ModBlocks.MOSSY_STONE_BRICK_WALL_SIGN)
                .fence(ModBlocks.MOSSY_STONE_BRICK_FENCE)
                .fenceGate(ModBlocks.MOSSY_STONE_BRICK_FENCE_GATE)
                .trapdoor(ModBlocks.MOSSY_STONE_BRICK_TRAPDOOR)
                .pressurePlate(ModBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE)
                .button(ModBlocks.MOSSY_STONE_BRICK_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(mossyStoneBrickFamily.getBaseBlock()).family(mossyStoneBrickFamily);

        var polishedGraniteFamily = new BlockFamily.Builder(Blocks.POLISHED_GRANITE)
                .door(ModBlocks.POLISHED_GRANITE_DOOR)
                .sign(ModBlocks.POLISHED_GRANITE_SIGN, ModBlocks.POLISHED_GRANITE_WALL_SIGN)
                .wall(ModBlocks.POLISHED_GRANITE_WALL)
                .fence(ModBlocks.POLISHED_GRANITE_FENCE)
                .fenceGate(ModBlocks.POLISHED_GRANITE_FENCE_GATE)
                .trapdoor(ModBlocks.POLISHED_GRANITE_TRAPDOOR)
                .pressurePlate(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE)
                .button(ModBlocks.POLISHED_GRANITE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(polishedGraniteFamily.getBaseBlock()).family(polishedGraniteFamily);

        var dioriteFamily = new BlockFamily.Builder(Blocks.DIORITE)
                .door(ModBlocks.DIORITE_DOOR)
                .sign(ModBlocks.DIORITE_SIGN, ModBlocks.DIORITE_WALL_SIGN)
                .fence(ModBlocks.DIORITE_FENCE)
                .fenceGate(ModBlocks.DIORITE_FENCE_GATE)
                .trapdoor(ModBlocks.DIORITE_TRAPDOOR)
                .pressurePlate(ModBlocks.DIORITE_PRESSURE_PLATE)
                .button(ModBlocks.DIORITE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(dioriteFamily.getBaseBlock()).family(dioriteFamily);

        var polishedDioriteFamily = new BlockFamily.Builder(Blocks.POLISHED_DIORITE)
                .door(ModBlocks.POLISHED_DIORITE_DOOR)
                .sign(ModBlocks.POLISHED_DIORITE_SIGN, ModBlocks.POLISHED_DIORITE_WALL_SIGN)
                .wall(ModBlocks.POLISHED_DIORITE_WALL)
                .fence(ModBlocks.POLISHED_DIORITE_FENCE)
                .fenceGate(ModBlocks.POLISHED_DIORITE_FENCE_GATE)
                .trapdoor(ModBlocks.POLISHED_DIORITE_TRAPDOOR)
                .pressurePlate(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE)
                .button(ModBlocks.POLISHED_DIORITE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(polishedDioriteFamily.getBaseBlock()).family(polishedDioriteFamily);

        var andesiteFamily = new BlockFamily.Builder(Blocks.ANDESITE)
                .door(ModBlocks.ANDESITE_DOOR)
                .sign(ModBlocks.ANDESITE_SIGN, ModBlocks.ANDESITE_WALL_SIGN)
                .fence(ModBlocks.ANDESITE_FENCE)
                .fenceGate(ModBlocks.ANDESITE_FENCE_GATE)
                .trapdoor(ModBlocks.ANDESITE_TRAPDOOR)
                .pressurePlate(ModBlocks.ANDESITE_PRESSURE_PLATE)
                .button(ModBlocks.ANDESITE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(andesiteFamily.getBaseBlock()).family(andesiteFamily);

        var polishedAndesiteFamily = new BlockFamily.Builder(Blocks.POLISHED_ANDESITE)
                .door(ModBlocks.POLISHED_ANDESITE_DOOR)
                .sign(ModBlocks.POLISHED_ANDESITE_SIGN, ModBlocks.POLISHED_ANDESITE_WALL_SIGN)
                .wall(ModBlocks.POLISHED_ANDESITE_WALL)
                .fence(ModBlocks.POLISHED_ANDESITE_FENCE)
                .fenceGate(ModBlocks.POLISHED_ANDESITE_FENCE_GATE)
                .trapdoor(ModBlocks.POLISHED_ANDESITE_TRAPDOOR)
                .pressurePlate(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE)
                .button(ModBlocks.POLISHED_ANDESITE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(polishedAndesiteFamily.getBaseBlock()).family(polishedAndesiteFamily);

        var netheriteFamily = new BlockFamily.Builder(Blocks.NETHERITE_BLOCK)
                .door(ModBlocks.NETHERITE_DOOR)
                .wall(ModBlocks.NETHERITE_WALL)
                .sign(ModBlocks.NETHERITE_SIGN, ModBlocks.NETHERITE_WALL_SIGN)
                .fence(ModBlocks.NETHERITE_FENCE)
                .fenceGate(ModBlocks.NETHERITE_FENCE_GATE)
                .stairs(ModBlocks.NETHERITE_STAIRS)
                .slab(ModBlocks.NETHERITE_SLAB)
                .trapdoor(ModBlocks.NETHERITE_TRAPDOOR)
                .pressurePlate(ModBlocks.NETHERITE_PRESSURE_PLATE)
                .button(ModBlocks.NETHERITE_BUTTON)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(netheriteFamily.getBaseBlock()).family(netheriteFamily);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BUSH_HAMMER, Models.HANDHELD);
    }
}