package com.garrafielo.lucasmod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundRegistry  {
    public static final ResourceLocation AMOGUS_SOUND_ID = new ResourceLocation("lucasmod:amogus_sound_effect");
    public static final SoundEvent AMOGUS_SOUND_EVENT = new SoundEvent(AMOGUS_SOUND_ID);

    public static final ResourceLocation AMONG_US_ROLE_SOUND_ID = new ResourceLocation("lucasmod:among_us_role");
    public static final SoundEvent AMONG_US_ROLE_SOUND_EVENT = new SoundEvent(AMONG_US_ROLE_SOUND_ID);

    public static final ResourceLocation WHATSAPP_SOUND_ID = new ResourceLocation("lucasmod:whatsapp_whistle");
    public static final SoundEvent WHATSAPP_SOUND_EVENT = new SoundEvent(WHATSAPP_SOUND_ID);

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LucasMod.MOD_ID);
   
    public static final RegistryObject<SoundEvent> amogUsSoundEffect = SOUNDS.register("amogus_sound_effect", () -> AMOGUS_SOUND_EVENT);
    public static final RegistryObject<SoundEvent> amongUsRole = SOUNDS.register("among_us_role", () -> AMONG_US_ROLE_SOUND_EVENT);
    public static final RegistryObject<SoundEvent> whatsappWhistle = SOUNDS.register("whatsapp_whistle", () -> WHATSAPP_SOUND_EVENT);
}
