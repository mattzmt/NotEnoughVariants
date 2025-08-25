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
    }
}
