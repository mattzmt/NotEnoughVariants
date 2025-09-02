package github.mattzmt.not_enough_variants.item;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.block.ModBlocks;
import github.mattzmt.not_enough_variants.item.advanced.BushHammer;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item BUSH_HAMMER = register(
            "bush_hammer",
            new BushHammer(new Item.Settings()
                    .maxCount(1)
            ));

    public static final SignItem NETHERRACK_SIGN = register(
            "netherrack_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.NETHERRACK_SIGN, ModBlocks.NETHERRACK_WALL_SIGN));

    public static final SignItem STONE_SIGN = register(
            "stone_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.STONE_SIGN, ModBlocks.STONE_WALL_SIGN));

    public static final SignItem COBBLESTONE_SIGN = register(
            "cobblestone_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.COBBLESTONE_SIGN, ModBlocks.COBBLESTONE_WALL_SIGN));

    public static final SignItem GRANITE_SIGN = register(
            "granite_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.GRANITE_SIGN, ModBlocks.GRANITE_WALL_SIGN));

    public static final SignItem MOSSY_COBBLESTONE_SIGN = register(
            "mossy_cobblestone_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.MOSSY_COBBLESTONE_SIGN, ModBlocks.MOSSY_COBBLESTONE_WALL_SIGN));

    public static final SignItem SMOOTH_STONE_SIGN = register(
            "smooth_stone_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.SMOOTH_STONE_SIGN, ModBlocks.SMOOTH_STONE_WALL_SIGN));

    public static final SignItem STONE_BRICK_SIGN = register(
            "stone_brick_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.STONE_BRICK_SIGN, ModBlocks.STONE_BRICK_WALL_SIGN));

    public static final SignItem CRACKED_STONE_BRICK_SIGN = register(
            "cracked_stone_brick_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.CRACKED_STONE_BRICK_SIGN, ModBlocks.CRACKED_STONE_BRICK_WALL_SIGN));

    public static final SignItem CHISELED_STONE_BRICK_SIGN = register(
            "chiseled_stone_brick_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.CHISELED_STONE_BRICK_SIGN, ModBlocks.CHISELED_STONE_BRICK_WALL_SIGN));

    public static final SignItem MOSSY_STONE_BRICK_SIGN = register(
            "mossy_stone_brick_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.MOSSY_STONE_BRICK_SIGN, ModBlocks.MOSSY_STONE_BRICK_WALL_SIGN));

    public static final SignItem POLISHED_GRANITE_SIGN = register(
            "polished_granite_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.POLISHED_GRANITE_SIGN, ModBlocks.POLISHED_GRANITE_WALL_SIGN));

    public static final SignItem DIORITE_SIGN = register(
            "diorite_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.DIORITE_SIGN, ModBlocks.DIORITE_WALL_SIGN));

    public static final SignItem POLISHED_DIORITE_SIGN = register(
            "polished_diorite_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.POLISHED_DIORITE_SIGN, ModBlocks.POLISHED_DIORITE_WALL_SIGN));

    public static final SignItem ANDESITE_SIGN = register(
            "andesite_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.ANDESITE_SIGN, ModBlocks.ANDESITE_WALL_SIGN));

    public static final SignItem POLISHED_ANDESITE_SIGN = register(
            "polished_andesite_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.POLISHED_ANDESITE_SIGN, ModBlocks.POLISHED_ANDESITE_WALL_SIGN));

    /*public static final SignItem DEEPSLATE_SIGN = register(
            "deepslate_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.DEEPSLATE_SIGN, ModBlocks.DEEPSLATE_WALL_SIGN));*/

    public static final SignItem NETHERITE_SIGN = register(
            "netherite_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.NETHERITE_SIGN, ModBlocks.NETHERITE_WALL_SIGN));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, NotEnoughVariants.id(name), item);
    }

    public static void load() {}
}
