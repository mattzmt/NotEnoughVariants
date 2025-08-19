package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.init.ModBlocks;
import github.mattzmt.not_enough_variants.init.ModItems;
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
                .add(ModBlocks.STONE_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.NETHERRACK_WALL.asItem())
                .add(ModBlocks.STONE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(ModItems.NETHERRACK_SIGN)
                .add(ModItems.STONE_SIGN);

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModBlocks.NETHERRACK_FENCE.asItem())
                .add(ModBlocks.STONE_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.NETHERRACK_FENCE_GATE.asItem())
                .add(ModBlocks.STONE_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.NETHERRACK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.NETHERRACK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(ModBlocks.NETHERRACK_TRAPDOOR.asItem())
                .add(ModBlocks.STONE_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.NETHERRACK_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ModBlocks.NETHERRACK_BUTTON.asItem());
    }
}
