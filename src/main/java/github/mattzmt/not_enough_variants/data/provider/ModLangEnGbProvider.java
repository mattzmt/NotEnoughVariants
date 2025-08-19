package github.mattzmt.not_enough_variants.data.provider;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.init.ModBlocks;
import github.mattzmt.not_enough_variants.init.ModItemGroups;
import github.mattzmt.not_enough_variants.init.ModItems;
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
    }
}
