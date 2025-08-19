package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.init.ModBlocks;
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
                .add(ModBlocks.STONE_WALL_SIGN)
                .add(ModBlocks.STONE_FENCE)
                .add(ModBlocks.STONE_FENCE_GATE)
                .add(ModBlocks.STONE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.NETHERRACK_DOOR)
                .add(ModBlocks.STONE_DOOR);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.NETHERRACK_WALL)
                .add(ModBlocks.STONE_WALL);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.NETHERRACK_SIGN)
                .add(ModBlocks.STONE_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.NETHERRACK_WALL_SIGN)
                .add(ModBlocks.STONE_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.NETHERRACK_FENCE)
                .add(ModBlocks.STONE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.NETHERRACK_FENCE_GATE)
                .add(ModBlocks.STONE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.NETHERRACK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.NETHERRACK_SLAB);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.NETHERRACK_TRAPDOOR)
                .add(ModBlocks.STONE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.NETHERRACK_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.NETHERRACK_BUTTON);
    }
}
