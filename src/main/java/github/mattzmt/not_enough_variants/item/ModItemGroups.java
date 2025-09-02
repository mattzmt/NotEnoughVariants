package github.mattzmt.not_enough_variants.item;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroups {
    public static final Text NEV_GROUP_TITLE = Text.translatable("itemGroup." + NotEnoughVariants.MOD_ID + ".nev_group");
    public static final ItemGroup NEV_GROUP = register("nev_group", FabricItemGroup.builder()
            .displayName(NEV_GROUP_TITLE)
            .icon(ModItems.BUSH_HAMMER::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(ModItems.BUSH_HAMMER);

                entries.add(ModBlocks.OAK_LOG_STAIRS);
                entries.add(ModBlocks.OAK_LOG_SLAB);

                entries.add(ModBlocks.NETHERRACK_DOOR);
                entries.add(ModBlocks.NETHERRACK_WALL);
                entries.add(ModItems.NETHERRACK_SIGN);
                entries.add(ModBlocks.NETHERRACK_FENCE);
                entries.add(ModBlocks.NETHERRACK_FENCE_GATE);
                entries.add(ModBlocks.NETHERRACK_STAIRS);
                entries.add(ModBlocks.NETHERRACK_SLAB);
                entries.add(ModBlocks.NETHERRACK_TRAPDOOR);
                entries.add(ModBlocks.NETHERRACK_PRESSURE_PLATE);
                entries.add(ModBlocks.NETHERRACK_BUTTON);

                entries.add(ModBlocks.STONE_DOOR);
                entries.add(ModBlocks.STONE_WALL);
                entries.add(ModItems.STONE_SIGN);
                entries.add(ModBlocks.STONE_FENCE);
                entries.add(ModBlocks.STONE_FENCE_GATE);
                entries.add(ModBlocks.STONE_TRAPDOOR);

                entries.add(ModBlocks.COBBLESTONE_DOOR);
                entries.add(ModItems.COBBLESTONE_SIGN);
                entries.add(ModBlocks.COBBLESTONE_FENCE);
                entries.add(ModBlocks.COBBLESTONE_FENCE_GATE);
                entries.add(ModBlocks.COBBLESTONE_TRAPDOOR);
                entries.add(ModBlocks.COBBLESTONE_PRESSURE_PLATE);
                entries.add(ModBlocks.COBBLESTONE_BUTTON);

                entries.add(ModBlocks.GRANITE_DOOR);
                entries.add(ModItems.GRANITE_SIGN);
                entries.add(ModBlocks.GRANITE_FENCE);
                entries.add(ModBlocks.GRANITE_FENCE_GATE);
                entries.add(ModBlocks.GRANITE_TRAPDOOR);
                entries.add(ModBlocks.GRANITE_PRESSURE_PLATE);
                entries.add(ModBlocks.GRANITE_BUTTON);

                entries.add(ModBlocks.OAK_WALL);
                entries.add(ModBlocks.SPRUCE_WALL);
                entries.add(ModBlocks.BIRCH_WALL);
                entries.add(ModBlocks.JUNGLE_WALL);
                entries.add(ModBlocks.ACACIA_WALL);
                entries.add(ModBlocks.DARK_OAK_WALL);
                entries.add(ModBlocks.MANGROVE_WALL);
                entries.add(ModBlocks.CHERRY_WALL);
                entries.add(ModBlocks.BAMBOO_WALL);
                entries.add(ModBlocks.CRIMSON_WALL);
                entries.add(ModBlocks.WARPED_WALL);

                entries.add(ModBlocks.MOSSY_COBBLESTONE_DOOR);
                entries.add(ModItems.MOSSY_COBBLESTONE_SIGN);
                entries.add(ModBlocks.MOSSY_COBBLESTONE_FENCE);
                entries.add(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE);
                entries.add(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR);
                entries.add(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
                entries.add(ModBlocks.MOSSY_COBBLESTONE_BUTTON);

                entries.add(ModBlocks.SMOOTH_STONE_DOOR);
                entries.add(ModBlocks.SMOOTH_STONE_WALL);
                entries.add(ModItems.SMOOTH_STONE_SIGN);
                entries.add(ModBlocks.SMOOTH_STONE_FENCE);
                entries.add(ModBlocks.SMOOTH_STONE_FENCE_GATE);
                entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                entries.add(ModBlocks.SMOOTH_STONE_TRAPDOOR);
                entries.add(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE);
                entries.add(ModBlocks.SMOOTH_STONE_BUTTON);

                entries.add(ModBlocks.STONE_BRICK_DOOR);
                entries.add(ModItems.STONE_BRICK_SIGN);
                entries.add(ModBlocks.STONE_BRICK_FENCE);
                entries.add(ModBlocks.STONE_BRICK_FENCE_GATE);
                entries.add(ModBlocks.STONE_BRICK_TRAPDOOR);
                entries.add(ModBlocks.STONE_BRICK_PRESSURE_PLATE);
                entries.add(ModBlocks.STONE_BRICK_BUTTON);

                entries.add(ModBlocks.CRACKED_STONE_BRICK_DOOR);
                entries.add(ModBlocks.CRACKED_STONE_BRICK_WALL);
                entries.add(ModItems.CRACKED_STONE_BRICK_SIGN);
                entries.add(ModBlocks.CRACKED_STONE_BRICK_FENCE);
                entries.add(ModBlocks.CRACKED_STONE_BRICK_FENCE_GATE);
                entries.add(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.CRACKED_STONE_BRICK_SLAB);
                entries.add(ModBlocks.CRACKED_STONE_BRICK_TRAPDOOR);
                entries.add(ModBlocks.CRACKED_STONE_BRICK_PRESSURE_PLATE);
                entries.add(ModBlocks.CRACKED_STONE_BRICK_BUTTON);

                entries.add(ModBlocks.CHISELED_STONE_BRICK_DOOR);
                entries.add(ModBlocks.CHISELED_STONE_BRICK_WALL);
                entries.add(ModItems.CHISELED_STONE_BRICK_SIGN);
                entries.add(ModBlocks.CHISELED_STONE_BRICK_FENCE);
                entries.add(ModBlocks.CHISELED_STONE_BRICK_FENCE_GATE);
                entries.add(ModBlocks.CHISELED_STONE_BRICK_STAIRS);
                entries.add(ModBlocks.CHISELED_STONE_BRICK_SLAB);
                entries.add(ModBlocks.CHISELED_STONE_BRICK_TRAPDOOR);
                entries.add(ModBlocks.CHISELED_STONE_BRICK_PRESSURE_PLATE);
                entries.add(ModBlocks.CHISELED_STONE_BRICK_BUTTON);

                entries.add(ModBlocks.MOSSY_STONE_BRICK_DOOR);
                entries.add(ModItems.MOSSY_STONE_BRICK_SIGN);
                entries.add(ModBlocks.MOSSY_STONE_BRICK_FENCE);
                entries.add(ModBlocks.MOSSY_STONE_BRICK_FENCE_GATE);
                entries.add(ModBlocks.MOSSY_STONE_BRICK_TRAPDOOR);
                entries.add(ModBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE);
                entries.add(ModBlocks.MOSSY_STONE_BRICK_BUTTON);

                entries.add(ModBlocks.POLISHED_GRANITE_DOOR);
                entries.add(ModBlocks.POLISHED_GRANITE_WALL);
                entries.add(ModItems.POLISHED_GRANITE_SIGN);
                entries.add(ModBlocks.POLISHED_GRANITE_FENCE);
                entries.add(ModBlocks.POLISHED_GRANITE_FENCE_GATE);
                entries.add(ModBlocks.POLISHED_GRANITE_TRAPDOOR);
                entries.add(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
                entries.add(ModBlocks.POLISHED_GRANITE_BUTTON);

                entries.add(ModBlocks.DIORITE_DOOR);
                entries.add(ModItems.DIORITE_SIGN);
                entries.add(ModBlocks.DIORITE_FENCE);
                entries.add(ModBlocks.DIORITE_FENCE_GATE);
                entries.add(ModBlocks.DIORITE_TRAPDOOR);
                entries.add(ModBlocks.DIORITE_PRESSURE_PLATE);
                entries.add(ModBlocks.DIORITE_BUTTON);

                entries.add(ModBlocks.POLISHED_DIORITE_DOOR);
                entries.add(ModBlocks.POLISHED_DIORITE_WALL);
                entries.add(ModItems.POLISHED_DIORITE_SIGN);
                entries.add(ModBlocks.POLISHED_DIORITE_FENCE);
                entries.add(ModBlocks.POLISHED_DIORITE_FENCE_GATE);
                entries.add(ModBlocks.POLISHED_DIORITE_TRAPDOOR);
                entries.add(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
                entries.add(ModBlocks.POLISHED_DIORITE_BUTTON);

                entries.add(ModBlocks.ANDESITE_DOOR);
                entries.add(ModItems.ANDESITE_SIGN);
                entries.add(ModBlocks.ANDESITE_FENCE);
                entries.add(ModBlocks.ANDESITE_FENCE_GATE);
                entries.add(ModBlocks.ANDESITE_TRAPDOOR);
                entries.add(ModBlocks.ANDESITE_PRESSURE_PLATE);
                entries.add(ModBlocks.ANDESITE_BUTTON);

                entries.add(ModBlocks.POLISHED_ANDESITE_DOOR);
                entries.add(ModBlocks.POLISHED_ANDESITE_WALL);
                entries.add(ModItems.POLISHED_ANDESITE_SIGN);
                entries.add(ModBlocks.POLISHED_ANDESITE_FENCE);
                entries.add(ModBlocks.POLISHED_ANDESITE_FENCE_GATE);
                entries.add(ModBlocks.POLISHED_ANDESITE_TRAPDOOR);
                entries.add(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
                entries.add(ModBlocks.POLISHED_ANDESITE_BUTTON);

                entries.add(ModBlocks.NETHERITE_DOOR);
                entries.add(ModBlocks.NETHERITE_WALL);
                entries.add(ModItems.NETHERITE_SIGN);
                entries.add(ModBlocks.NETHERITE_FENCE);
                entries.add(ModBlocks.NETHERITE_FENCE_GATE);
                entries.add(ModBlocks.NETHERITE_STAIRS);
                entries.add(ModBlocks.NETHERITE_SLAB);
                entries.add(ModBlocks.NETHERITE_TRAPDOOR);
                entries.add(ModBlocks.NETHERITE_PRESSURE_PLATE);
                entries.add(ModBlocks.NETHERITE_BUTTON);
            }).build()
    );

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, NotEnoughVariants.id(name), itemGroup);
    }

    public static void load() {}
}