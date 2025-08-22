package github.mattzmt.not_enough_variants;

import github.mattzmt.not_enough_variants.block.ModBlocks;
import github.mattzmt.not_enough_variants.item.ModItemGroups;
import github.mattzmt.not_enough_variants.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotEnoughVariants implements ModInitializer {
	public static final String MOD_ID = "not_enough_variants";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod Initialised");
        ModItems.load();
        ModBlocks.load();
        ModItemGroups.load();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.addAfter(Items.BRUSH, ModItems.BUSH_HAMMER);
        });
	}

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}