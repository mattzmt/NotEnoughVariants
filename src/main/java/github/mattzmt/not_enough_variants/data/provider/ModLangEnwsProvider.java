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

public class ModLangEnwsProvider extends FabricLanguageProvider {
    public ModLangEnwsProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "enws", registryLookup);
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
        addText(translationBuilder, ModItemGroups.NEV_GROUP_TITLE, "Enough, Or Not Enough?");

        //ITEMS
        translationBuilder.add(ModItems.BUSH_HAMMER, "Bush Hammer");
        translationBuilder.add(ModItems.NETHERRACK_SIGN, "Netherrack Sign");

        //BLOCKS
        translationBuilder.add(ModBlocks.NETHERRACK_DOOR, "Netherrack Door");
        translationBuilder.add(ModBlocks.NETHERRACK_WALL, "Netherrack Hedge");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE, "Small Netherrack Hedge");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE_GATE, "Netherrack Hedge Gate");
        translationBuilder.add(ModBlocks.NETHERRACK_STAIRS, "Netherrack Stairs");
        translationBuilder.add(ModBlocks.NETHERRACK_SLAB, "Netherrack Slab");
        translationBuilder.add(ModBlocks.NETHERRACK_TRAPDOOR, "Netherrack Hatch");
        translationBuilder.add(ModBlocks.NETHERRACK_PRESSURE_PLATE, "Netherrack Pressure Plate");
        translationBuilder.add(ModBlocks.NETHERRACK_BUTTON, "Netherrack Button");
    }
}
