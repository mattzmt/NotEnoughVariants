package github.mattzmt.not_enough_variants.block;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.sound.ModSounds;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class ModBlockSetType {
    public static final BlockSetType NETHERRACK = new BlockSetType(
            NotEnoughVariants.id("netherrack").toString(),
            true,
            true,
            false,
            BlockSetType.ActivationRule.EVERYTHING,
            BlockSoundGroup.NETHERRACK,
            ModSounds.NETHERRACK_DOOR_CLOSE,
            ModSounds.NETHERRACK_DOOR_OPEN,
            ModSounds.NETHERRACK_TRAPDOOR_CLOSE,
            ModSounds.NETHERRACK_TRAPDOOR_OPEN,
            SoundEvents.BLOCK_LEVER_CLICK,
            SoundEvents.BLOCK_LEVER_CLICK,
            SoundEvents.BLOCK_LEVER_CLICK,
            SoundEvents.BLOCK_LEVER_CLICK
    );

    public static final BlockSetType STONE = new BlockSetType(
            NotEnoughVariants.id("stone").toString(),
            true,
            true,
            false,
            BlockSetType.ActivationRule.MOBS,
            BlockSoundGroup.STONE,
            SoundEvents.BLOCK_LEVER_CLICK,
            SoundEvents.BLOCK_LEVER_CLICK,
            SoundEvents.BLOCK_LEVER_CLICK,
            SoundEvents.BLOCK_LEVER_CLICK,
            SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON
    );
}
