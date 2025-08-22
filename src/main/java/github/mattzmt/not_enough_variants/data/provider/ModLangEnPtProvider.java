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

public class ModLangEnPtProvider extends FabricLanguageProvider {
    public ModLangEnPtProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_pt", registryLookup);
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
        addText(translationBuilder, ModItemGroups.NEV_GROUP_TITLE, "Nay Enough Variants Fo' Meself");

        //ITEMS
        translationBuilder.add(ModItems.BUSH_HAMMER, "Bush Hammer");
        translationBuilder.add(ModItems.NETHERRACK_SIGN, "Seal o' netherrack");

        //BLOCKS
        translationBuilder.add(ModBlocks.NETHERRACK_DOOR, "Door o' netherrack");
        translationBuilder.add(ModBlocks.NETHERRACK_WALL, "Wall o' netherrack");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE, "Picket o' netherrack");
        translationBuilder.add(ModBlocks.NETHERRACK_FENCE_GATE, "Picket gate o' netherrack");
        translationBuilder.add(ModBlocks.NETHERRACK_STAIRS, "Stairs o' netherrack");
        translationBuilder.add(ModBlocks.NETHERRACK_SLAB, "Slab o' netherrack");
        translationBuilder.add(ModBlocks.NETHERRACK_TRAPDOOR, "Hatch o' netherrack");
        translationBuilder.add(ModBlocks.NETHERRACK_PRESSURE_PLATE, "Booby trap o' netherrack");
        translationBuilder.add(ModBlocks.NETHERRACK_BUTTON, "Knob o' netherrack");
    }
}
