package github.mattzmt.not_enough_variants.init;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item BUSH_HAMMER = register(
            "bush_hammer",
            new Item(new Item.Settings()
            ));

    public static final SignItem NETHERRACK_SIGN = register(
            "netherrack_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.NETHERRACK_SIGN, ModBlocks.NETHERRACK_WALL_SIGN
            ));

    public static final SignItem STONE_SIGN = register(
            "stone_sign",
            new SignItem(
                    new Item.Settings()
                            .maxCount(16),
                    ModBlocks.STONE_SIGN, ModBlocks.STONE_WALL_SIGN
            ));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, NotEnoughVariants.id(name), item);
    }

    public static void load() {}
}
