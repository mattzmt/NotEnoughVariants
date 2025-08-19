package github.mattzmt.not_enough_variants.sound;

import github.mattzmt.not_enough_variants.NotEnoughVariants;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent NETHERRACK_DOOR_CLOSE = registerSoundEvent("netherrack_door_close");
    public static final SoundEvent NETHERRACK_DOOR_OPEN = registerSoundEvent("netherrack_door_open");
    public static final SoundEvent NETHERRACK_TRAPDOOR_CLOSE = registerSoundEvent("netherrack_trapdoor_close");
    public static final SoundEvent NETHERRACK_TRAPDOOR_OPEN = registerSoundEvent("netherrack_trapdoor_open");
    public static final SoundEvent NETHERRACK_GATE_CLOSE = registerSoundEvent("netherrack_gate_close");
    public static final SoundEvent NETHERRACK_GATE_OPEN = registerSoundEvent("netherrack_gate_open");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = NotEnoughVariants.id(name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        NotEnoughVariants.LOGGER.info("Registering mod sounds for "+NotEnoughVariants.MOD_ID);
    }
}
