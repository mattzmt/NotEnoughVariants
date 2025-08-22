package github.mattzmt.not_enough_variants.block;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.sound.ModSounds;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class ModWoodType {
    public static final WoodType NETHERRACK = new WoodType(
            NotEnoughVariants.id("netherrack").toString(),
            ModBlockSetType.NETHERRACK,
            BlockSoundGroup.NETHERRACK,
            BlockSoundGroup.HANGING_SIGN,
            ModSounds.NETHERRACK_GATE_CLOSE,
            ModSounds.NETHERRACK_GATE_OPEN
    );

    public static final WoodType STONE = new WoodType(
            NotEnoughVariants.id("stone").toString(),
            ModBlockSetType.STONE,
            BlockSoundGroup.STONE,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_LEVER_CLICK,
            SoundEvents.BLOCK_LEVER_CLICK
    );
}