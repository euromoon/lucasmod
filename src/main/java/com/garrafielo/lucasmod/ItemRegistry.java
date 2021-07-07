package com.garrafielo.lucasmod;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
        public static final Food AMONG_US_FOOD = (new Food.Builder()).saturation(10).hunger(10).setAlwaysEdible()
                        .effect(() -> new EffectInstance(Effects.SPEED, 30 * 120, 1), 1)
                        .effect(() -> new EffectInstance(Effects.JUMP_BOOST, 30 * 120, 5), 1).build();

        public static final Food AMONG_US_SUS_FOOD = (new Food.Builder()).saturation(10).hunger(10).setAlwaysEdible()
                        .effect(() -> new EffectInstance(Effects.SPEED, 30 * 120, 1), 1)
                        .effect(() -> new EffectInstance(Effects.INVISIBILITY, 30 * 120, 5), 1)
                        .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 30 * 120, 5), 1).build();

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        LucasMod.MOD_ID);

        public static final RegistryObject<Item> amongUsItem = ITEMS.register("among_us",
                        () -> new AmongUsItem(new Item.Properties().group(ItemGroup.FOOD).food(AMONG_US_FOOD)));

        public static final RegistryObject<Item> amongUsSusItem = ITEMS.register("among_us_sus",
                        () -> new AmongUsItem(new Item.Properties().group(ItemGroup.FOOD).food(AMONG_US_SUS_FOOD)));

        public static final RegistryObject<Item> whatsappIngot = ITEMS.register("whatsapp_ingot",
                        () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

        public static final RegistryObject<Item> bigChungusBlockItem = ITEMS.register("big_chungus_block_item",
                        () -> BlockRegistry.bigChungusBlock.get().getBlockItem());

        public static final RegistryObject<Item> whatsappBlockItem = ITEMS.register("whatsapp_ore_item",
                        () -> BlockRegistry.whatsappOre.get().getBlockItem());
}
