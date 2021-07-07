package com.garrafielo.lucasmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        LucasMod.MOD_ID);

        public static final RegistryObject<ModBlock> bigChungusBlock = BLOCKS.register("big_chungus_block",
                        () -> new BigChungusBlock(4, Material.ROCK, ItemGroup.MATERIALS, ToolType.PICKAXE, 2));

        public static final RegistryObject<ModBlock> whatsappOre = BLOCKS.register("whatsapp_ore",
                        () -> new WhatsappOreBlock(7, Material.ROCK, ItemGroup.MISC, ToolType.PICKAXE, 2));
}
