package github.mattzmt.not_enough_variants.init;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ModItemGroups {
    public static final Text NEV_GROUP_TITLE = Text.translatable("itemGroup." + NotEnoughVariants.MOD_ID + ".nev_group");
    public static final ItemGroup NEV_GROUP = register("nev_group", FabricItemGroup.builder()
            .displayName(NEV_GROUP_TITLE)
            .icon(ModItems.BUSH_HAMMER::getDefaultStack)
            .entries((displayContext, entries) -> {
                entries.add(ModItems.BUSH_HAMMER);

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
            }).build()
    );

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, NotEnoughVariants.id(name), itemGroup);
    }

    public static void load() {}
}