package com.garrafielo.lucasmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class ModBlock extends Block {
  private BlockItem blockItem;

  public ModBlock(int hardnessAndResistance, Material material, ItemGroup itemGroup, ToolType tool, int harvestLevel) {
    // [func_235861_h_ = setRequiresTool]. Importante para fazer com que picareta de ferro ou mais seja necessário para minerar.
    super(Properties.create(material).hardnessAndResistance(hardnessAndResistance).harvestTool(tool).harvestLevel(harvestLevel)
        .func_235861_h_());
    blockItem = new BlockItem(this, new Item.Properties().group(itemGroup));
  }

  public BlockItem getBlockItem() {
    return blockItem;
  }
}
