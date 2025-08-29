package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.block.ModBlocks;
import github.mattzmt.not_enough_variants.item.ModItemGroups;
import github.mattzmt.not_enough_variants.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModLangEnGbProvider extends FabricLanguageProvider {
    public ModLangEnGbProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_gb", registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if(text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        }else{
            NotEnoughVariants.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        //ITEM GROUPS
        addText(translationBuilder, ModItemGroups.NEV_GROUP_TITLE, "Not Enough Variants");

        //ITEMS
        translationBuilder.add(ModItems.BUSH_HAMMER, "Bush Hammer");
        translationBuilder.add(ModItems.NETHERRACK_SIGN, "Netherrack Sign");
        translationBuilder.add(ModItems.STONE_SIGN, "Stone Sign");
        translationBuilder.add(ModItems.COBBLESTONE_SIGN, "Cobblestone Sign");
        translationBuilder.add(ModItems.GRANITE_SIGN, "Granite Sign");
        translationBuilder.add(ModItems.MOSSY_COBBLESTONE_SIGN, "Mossy Cobblestone Sign");
        translationBuilder.add(ModItems.SMOOTH_STONE_SIGN, "Smooth Stone Sign");
        translationBuilder.add(ModItems.STONE_BRICK_SIGN, "Stone Brick Sign");
        translationBuilder.add(ModItems.CRACKED_STONE_BRICK_SIGN, "Cracked Stone Brick Sign");
        translationBuilder.add(ModItems.CHISELED_STONE_BRICK_SIGN, "Chiselled Stone Brick Sign");
        translationBuilder.add(ModItems.MOSSY_STONE_BRICK_SIGN, "Mossy Stone Brick Sign");
        translationBuilder.add(ModItems.POLISHED_GRANITE_SIGN, "Polished Granite Sign");
        translationBuilder.add(ModItems.DIORITE_SIGN, "Diorite Sign");
        translationBuilder.add(ModItems.POLISHED_DIORITE_SIGN, "Polished Diorite Sign");
        translationBuilder.add(ModItems.ANDESITE_SIGN, "Andesite Sign");
        translationBuilder.add(ModItems.POLISHED_ANDESITE_SIGN, "Polished Andesite Sign");
        translationBuilder.add(ModItems.NETHERITE_SIGN, "Swaggiest Sign Ever");

        //BLOCKS
        translationBuilder.add(ModBlocks.NETHERRACK_DOOR, "Netherrack Door");
        translationBuilder.add(ModBlocks.NETHERRACK_WALL, "Netherrack Wall");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE, "Netherrack Fence");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE_GATE, "Netherrack Fence Gate");
        translationBuilder.add(ModBlocks.NETHERRACK_STAIRS, "Netherrack Stairs");
        translationBuilder.add(ModBlocks.NETHERRACK_SLAB, "Netherrack Slab");
        translationBuilder.add(ModBlocks.NETHERRACK_TRAPDOOR, "Netherrack Trapdoor");
        translationBuilder.add(ModBlocks.NETHERRACK_PRESSURE_PLATE, "Netherrack Pressure Plate");
        translationBuilder.add(ModBlocks.NETHERRACK_BUTTON, "Netherrack Button");

        translationBuilder.add(ModBlocks.STONE_DOOR, "Stone Door");
        translationBuilder.add(ModBlocks.STONE_WALL, "Stone Wall");
        translationBuilder.add(ModBlocks.STONE_FENCE, "Stone Fence");
        translationBuilder.add(ModBlocks.STONE_FENCE_GATE, "Stone Fence Gate");
        translationBuilder.add(ModBlocks.STONE_TRAPDOOR, "Stone Trapdoor");

        translationBuilder.add(ModBlocks.COBBLESTONE_DOOR, "Cobblestone Door");
        translationBuilder.add(ModBlocks.COBBLESTONE_FENCE, "Cobblestone Fence");
        translationBuilder.add(ModBlocks.COBBLESTONE_FENCE_GATE, "Cobblestone Fence Gate");
        translationBuilder.add(ModBlocks.COBBLESTONE_TRAPDOOR, "Cobblestone Trapdoor");
        translationBuilder.add(ModBlocks.COBBLESTONE_PRESSURE_PLATE, "Cobblestone Pressure Plate");
        translationBuilder.add(ModBlocks.COBBLESTONE_BUTTON, "Cobblestone Button");

        translationBuilder.add(ModBlocks.GRANITE_DOOR, "Granite Door");
        translationBuilder.add(ModBlocks.GRANITE_FENCE, "Granite Fence");
        translationBuilder.add(ModBlocks.GRANITE_FENCE_GATE, "Granite Fence Gate");
        translationBuilder.add(ModBlocks.GRANITE_TRAPDOOR, "Granite Trapdoor");
        translationBuilder.add(ModBlocks.GRANITE_PRESSURE_PLATE, "Granite Pressure Plate");
        translationBuilder.add(ModBlocks.GRANITE_BUTTON, "Granite Button");

        translationBuilder.add(ModBlocks.OAK_WALL, "Oak Wall");
        translationBuilder.add(ModBlocks.SPRUCE_WALL, "Spruce Wall");
        translationBuilder.add(ModBlocks.BIRCH_WALL, "Birch Wall");
        translationBuilder.add(ModBlocks.JUNGLE_WALL, "Jungle Wall");
        translationBuilder.add(ModBlocks.ACACIA_WALL, "Acacia Wall");
        translationBuilder.add(ModBlocks.DARK_OAK_WALL, "Dark Oak Wall");
        translationBuilder.add(ModBlocks.MANGROVE_WALL, "Mangrove Wall");
        translationBuilder.add(ModBlocks.CHERRY_WALL, "Cherry Wall");
        translationBuilder.add(ModBlocks.BAMBOO_WALL, "Bamboo Wall");
        translationBuilder.add(ModBlocks.CRIMSON_WALL, "Crimson Wall");
        translationBuilder.add(ModBlocks.WARPED_WALL, "Warped Wall");

        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_DOOR, "Mossy Cobblestone Door");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_FENCE, "Mossy Cobblestone Fence");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE, "Mossy Cobblestone Fence Gate");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_TRAPDOOR, "Mossy Cobblestone Trapdoor");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE, "Mossy Cobblestone Pressure Plate");
        translationBuilder.add(ModBlocks.MOSSY_COBBLESTONE_BUTTON, "Mossy Cobblestone Button");

        translationBuilder.add(ModBlocks.SMOOTH_STONE_DOOR, "Smooth Stone Door");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_WALL, "Smooth Stone Wall");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_FENCE, "Smooth Stone Fence");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_FENCE_GATE, "Smooth Stone Fence Gate");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_STAIRS, "Smooth Stone Stairs");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_TRAPDOOR, "Smooth Stone Trapdoor");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE, "Smooth Stone Pressure Plate");
        translationBuilder.add(ModBlocks.SMOOTH_STONE_BUTTON, "Smooth Stone Button");

        translationBuilder.add(ModBlocks.STONE_BRICK_DOOR, "Stone Brick Door");
        translationBuilder.add(ModBlocks.STONE_BRICK_FENCE, "Stone Brick Fence");
        translationBuilder.add(ModBlocks.STONE_BRICK_FENCE_GATE, "Stone Brick Fence Gate");
        translationBuilder.add(ModBlocks.STONE_BRICK_TRAPDOOR, "Stone Brick Trapdoor");
        translationBuilder.add(ModBlocks.STONE_BRICK_PRESSURE_PLATE, "Stone Brick Pressure Plate");
        translationBuilder.add(ModBlocks.STONE_BRICK_BUTTON, "Stone Brick Button");

        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_DOOR, "Cracked Stone Brick Door");
        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_WALL, "Cracked Stone Brick Wall");
        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_FENCE, "Cracked Stone Brick Fence");
        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_FENCE_GATE, "Cracked Stone Brick Fence Gate");
        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_STAIRS, "Cracked Stone Brick Stairs");
        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_SLAB, "Cracked Stone Brick Slab");
        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_TRAPDOOR, "Cracked Stone Brick Trapdoor");
        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_PRESSURE_PLATE, "Cracked Stone Brick Pressure Plate");
        translationBuilder.add(ModBlocks.CRACKED_STONE_BRICK_BUTTON, "Cracked Stone Brick Button");

        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_DOOR, "Chiselled Stone Brick Door");
        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_WALL, "Chiselled Stone Brick Wall");
        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_FENCE, "Chiselled Stone Brick Fence");
        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_FENCE_GATE, "Chiselled Stone Brick Fence Gate");
        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_STAIRS, "Chiselled Stone Brick Stairs");
        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_SLAB, "Chiselled Stone Brick Slab");
        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_TRAPDOOR, "Chiselled Stone Brick Trapdoor");
        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_PRESSURE_PLATE, "Chiselled Stone Brick Pressure Plate");
        translationBuilder.add(ModBlocks.CHISELED_STONE_BRICK_BUTTON, "Chiselled Stone Brick Button");

        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_DOOR, "Mossy Stone Brick Door");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_FENCE, "Mossy Stone Brick Fence");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_FENCE_GATE, "Mossy Stone Brick Fence Gate");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_TRAPDOOR, "Mossy Stone Brick Trapdoor");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE, "Mossy Stone Brick Pressure Plate");
        translationBuilder.add(ModBlocks.MOSSY_STONE_BRICK_BUTTON, "Mossy Stone Brick Button");

        translationBuilder.add(ModBlocks.POLISHED_GRANITE_DOOR, "Polished Granite Door");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_WALL, "Polished Granite Wall");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_FENCE, "Polished Granite Fence");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_FENCE_GATE, "Polished Granite Fence Gate");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_TRAPDOOR, "Polished Granite Trapdoor");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, "Polished Granite Pressure Plate");
        translationBuilder.add(ModBlocks.POLISHED_GRANITE_BUTTON, "Polished Granite Button");

        translationBuilder.add(ModBlocks.DIORITE_DOOR, "Diorite Door");
        translationBuilder.add(ModBlocks.DIORITE_FENCE, "Diorite Fence");
        translationBuilder.add(ModBlocks.DIORITE_FENCE_GATE, "Diorite Fence Gate");
        translationBuilder.add(ModBlocks.DIORITE_TRAPDOOR, "Diorite Trapdoor");
        translationBuilder.add(ModBlocks.DIORITE_PRESSURE_PLATE, "Diorite Pressure Plate");
        translationBuilder.add(ModBlocks.DIORITE_BUTTON, "Diorite Button");

        translationBuilder.add(ModBlocks.POLISHED_DIORITE_DOOR, "Polished Diorite Door");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_WALL, "Polished Diorite Wall");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_FENCE, "Polished Diorite Fence");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_FENCE_GATE, "Polished Diorite Fence Gate");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_TRAPDOOR, "Polished Diorite Trapdoor");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, "Polished Diorite Pressure Plate");
        translationBuilder.add(ModBlocks.POLISHED_DIORITE_BUTTON, "Polished Diorite Button");

        translationBuilder.add(ModBlocks.ANDESITE_DOOR, "Andesite Door");
        translationBuilder.add(ModBlocks.ANDESITE_FENCE, "Andesite Fence");
        translationBuilder.add(ModBlocks.ANDESITE_FENCE_GATE, "Andesite Fence Gate");
        translationBuilder.add(ModBlocks.ANDESITE_TRAPDOOR, "Andesite Trapdoor");
        translationBuilder.add(ModBlocks.ANDESITE_PRESSURE_PLATE, "Andesite Pressure Plate");
        translationBuilder.add(ModBlocks.ANDESITE_BUTTON, "Andesite Button");

        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_DOOR, "Polished Andesite Door");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_WALL, "Polished Andesite Wall");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_FENCE, "Polished Andesite Fence");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_FENCE_GATE, "Polished Andesite Fence Gate");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_TRAPDOOR, "Polished Andesite Trapdoor");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, "Polished Andesite Pressure Plate");
        translationBuilder.add(ModBlocks.POLISHED_ANDESITE_BUTTON, "Polished Andesite Button");

        translationBuilder.add(ModBlocks.NETHERITE_DOOR, "Swaggiest Door Ever");
        translationBuilder.add(ModBlocks.NETHERITE_WALL, "Swaggiest Wall Ever");
        translationBuilder.add(ModBlocks.NETHERITE_FENCE, "Swaggiest Fence Ever");
        translationBuilder.add(ModBlocks.NETHERITE_FENCE_GATE, "Swaggiest Fence Gate Ever");
        translationBuilder.add(ModBlocks.NETHERITE_STAIRS, "Swaggiest Stairs Ever");
        translationBuilder.add(ModBlocks.NETHERITE_SLAB, "Swaggiest Slab Ever");
        translationBuilder.add(ModBlocks.NETHERITE_TRAPDOOR, "Swaggiest Trapdoor Ever");
        translationBuilder.add(ModBlocks.NETHERITE_PRESSURE_PLATE, "Swaggiest Pressure Plate Ever");
        translationBuilder.add(ModBlocks.NETHERITE_BUTTON, "Swaggiest Button Ever");
    }
}
