package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.NETHERRACK_DOOR)
                .add(ModBlocks.NETHERRACK_WALL)
                .add(ModBlocks.NETHERRACK_SIGN)
                .add(ModBlocks.NETHERRACK_WALL_SIGN)
                .add(ModBlocks.NETHERRACK_FENCE)
                .add(ModBlocks.NETHERRACK_FENCE_GATE)
                .add(ModBlocks.NETHERRACK_STAIRS)
                .add(ModBlocks.NETHERRACK_SLAB)
                .add(ModBlocks.NETHERRACK_TRAPDOOR)
                .add(ModBlocks.NETHERRACK_PRESSURE_PLATE)
                .add(ModBlocks.NETHERRACK_BUTTON)

                .add(ModBlocks.STONE_DOOR)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.STONE_SIGN)
                .add(ModBlocks.STONE_FENCE)
                .add(ModBlocks.STONE_FENCE_GATE)
                .add(ModBlocks.STONE_TRAPDOOR)
                .add(ModBlocks.STONE_WALL_SIGN)

                .add(ModBlocks.COBBLESTONE_DOOR)
                .add(ModBlocks.COBBLESTONE_FENCE)
                .add(ModBlocks.COBBLESTONE_FENCE_GATE)
                .add(ModBlocks.COBBLESTONE_TRAPDOOR)
                .add(ModBlocks.COBBLESTONE_PRESSURE_PLATE)
                .add(ModBlocks.COBBLESTONE_BUTTON)
                .add(ModBlocks.COBBLESTONE_SIGN)
                .add(ModBlocks.COBBLESTONE_WALL_SIGN)

                .add(ModBlocks.GRANITE_DOOR)
                .add(ModBlocks.GRANITE_FENCE)
                .add(ModBlocks.GRANITE_FENCE_GATE)
                .add(ModBlocks.GRANITE_TRAPDOOR)
                .add(ModBlocks.GRANITE_PRESSURE_PLATE)
                .add(ModBlocks.GRANITE_BUTTON)
                .add(ModBlocks.GRANITE_SIGN)
                .add(ModBlocks.GRANITE_WALL_SIGN)

                .add(ModBlocks.MOSSY_COBBLESTONE_DOOR)
                .add(ModBlocks.MOSSY_COBBLESTONE_FENCE)
                .add(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE)
                .add(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR)
                .add(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_COBBLESTONE_BUTTON)
                .add(ModBlocks.MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.MOSSY_COBBLESTONE_WALL_SIGN)

                .add(ModBlocks.SMOOTH_STONE_DOOR)
                .add(ModBlocks.SMOOTH_STONE_WALL)
                .add(ModBlocks.SMOOTH_STONE_FENCE)
                .add(ModBlocks.SMOOTH_STONE_FENCE_GATE)
                .add(ModBlocks.SMOOTH_STONE_STAIRS)
                .add(ModBlocks.SMOOTH_STONE_TRAPDOOR)
                .add(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE)
                .add(ModBlocks.SMOOTH_STONE_BUTTON)
                .add(ModBlocks.SMOOTH_STONE_SIGN)
                .add(ModBlocks.SMOOTH_STONE_WALL_SIGN)

                .add(ModBlocks.STONE_BRICK_DOOR)
                .add(ModBlocks.STONE_BRICK_FENCE)
                .add(ModBlocks.STONE_BRICK_FENCE_GATE)
                .add(ModBlocks.STONE_BRICK_TRAPDOOR)
                .add(ModBlocks.STONE_BRICK_PRESSURE_PLATE)
                .add(ModBlocks.STONE_BRICK_BUTTON)
                .add(ModBlocks.STONE_BRICK_SIGN)
                .add(ModBlocks.STONE_BRICK_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.NETHERRACK_DOOR)
                .add(ModBlocks.STONE_DOOR)
                .add(ModBlocks.COBBLESTONE_DOOR)
                .add(ModBlocks.GRANITE_DOOR)
                .add(ModBlocks.MOSSY_COBBLESTONE_DOOR)
                .add(ModBlocks.SMOOTH_STONE_DOOR)
                .add(ModBlocks.STONE_BRICK_DOOR);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.NETHERRACK_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.OAK_WALL)
                .add(ModBlocks.SPRUCE_WALL)
                .add(ModBlocks.BIRCH_WALL)
                .add(ModBlocks.JUNGLE_WALL)
                .add(ModBlocks.ACACIA_WALL)
                .add(ModBlocks.DARK_OAK_WALL)
                .add(ModBlocks.MANGROVE_WALL)
                .add(ModBlocks.CHERRY_WALL)
                .add(ModBlocks.BAMBOO_WALL)
                .add(ModBlocks.CRIMSON_WALL)
                .add(ModBlocks.WARPED_WALL)
                .add(ModBlocks.SMOOTH_STONE_WALL);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.NETHERRACK_SIGN)
                .add(ModBlocks.STONE_SIGN)
                .add(ModBlocks.COBBLESTONE_SIGN)
                .add(ModBlocks.GRANITE_SIGN)
                .add(ModBlocks.MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.SMOOTH_STONE_SIGN)
                .add(ModBlocks.STONE_BRICK_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.NETHERRACK_WALL_SIGN)
                .add(ModBlocks.STONE_WALL_SIGN)
                .add(ModBlocks.COBBLESTONE_WALL_SIGN)
                .add(ModBlocks.GRANITE_WALL_SIGN)
                .add(ModBlocks.MOSSY_COBBLESTONE_WALL_SIGN)
                .add(ModBlocks.SMOOTH_STONE_WALL_SIGN)
                .add(ModBlocks.STONE_BRICK_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.NETHERRACK_FENCE)
                .add(ModBlocks.STONE_FENCE)
                .add(ModBlocks.COBBLESTONE_FENCE)
                .add(ModBlocks.GRANITE_FENCE)
                .add(ModBlocks.MOSSY_COBBLESTONE_FENCE)
                .add(ModBlocks.SMOOTH_STONE_FENCE)
                .add(ModBlocks.STONE_BRICK_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.NETHERRACK_FENCE_GATE)
                .add(ModBlocks.STONE_FENCE_GATE)
                .add(ModBlocks.COBBLESTONE_FENCE_GATE)
                .add(ModBlocks.GRANITE_FENCE_GATE)
                .add(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE)
                .add(ModBlocks.SMOOTH_STONE_FENCE_GATE)
                .add(ModBlocks.STONE_BRICK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.NETHERRACK_STAIRS)
                .add(ModBlocks.SMOOTH_STONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.NETHERRACK_SLAB);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.NETHERRACK_TRAPDOOR)
                .add(ModBlocks.STONE_TRAPDOOR)
                .add(ModBlocks.COBBLESTONE_TRAPDOOR)
                .add(ModBlocks.GRANITE_TRAPDOOR)
                .add(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR)
                .add(ModBlocks.SMOOTH_STONE_TRAPDOOR)
                .add(ModBlocks.STONE_BRICK_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.NETHERRACK_PRESSURE_PLATE)
                .add(ModBlocks.COBBLESTONE_PRESSURE_PLATE)
                .add(ModBlocks.GRANITE_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE)
                .add(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE)
                .add(ModBlocks.STONE_BRICK_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.NETHERRACK_BUTTON)
                .add(ModBlocks.COBBLESTONE_BUTTON)
                .add(ModBlocks.GRANITE_BUTTON)
                .add(ModBlocks.MOSSY_COBBLESTONE_BUTTON)
                .add(ModBlocks.SMOOTH_STONE_BUTTON)
                .add(ModBlocks.STONE_BRICK_BUTTON);
    }
}