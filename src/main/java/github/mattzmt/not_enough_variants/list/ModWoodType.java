package github.mattzmt.not_enough_variants.list;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import github.mattzmt.not_enough_variants.sound.ModSounds;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;

public class ModWoodType {
    public static final WoodType NETHERRACK = new WoodType(
            NotEnoughVariants.id("netherrack").toString(),
            ModBlockSetType.NETHERRACK,
            BlockSoundGroup.NETHERRACK,
            BlockSoundGroup.NETHERRACK,
            ModSounds.NETHERRACK_GATE_CLOSE,
            ModSounds.NETHERRACK_GATE_OPEN
    );

    public static final WoodType STONE = new WoodType(
            NotEnoughVariants.id("stone").toString(),
            ModBlockSetType.STONE,
            BlockSoundGroup.STONE,
            BlockSoundGroup.STONE,
            ModSounds.NETHERRACK_DOOR_CLOSE,
            ModSounds.NETHERRACK_DOOR_OPEN
    );
}