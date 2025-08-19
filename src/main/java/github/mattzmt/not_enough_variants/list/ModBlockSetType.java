package github.mattzmt.not_enough_variants.list;

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
            ModSounds.NETHERRACK_DOOR_CLOSE,
            ModSounds.NETHERRACK_DOOR_OPEN,
            ModSounds.NETHERRACK_DOOR_CLOSE,
            ModSounds.NETHERRACK_DOOR_OPEN
    );

    public static final BlockSetType STONE = new BlockSetType(
            NotEnoughVariants.id("stone").toString(),
            true,
            true,
            false,
            BlockSetType.ActivationRule.MOBS,
            BlockSoundGroup.STONE,
            ModSounds.NETHERRACK_DOOR_CLOSE,
            ModSounds.NETHERRACK_DOOR_OPEN,
            ModSounds.NETHERRACK_DOOR_CLOSE,
            ModSounds.NETHERRACK_DOOR_OPEN,
            SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF,
            SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON
    );
}
