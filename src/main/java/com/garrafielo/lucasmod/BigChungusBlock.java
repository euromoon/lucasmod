package com.garrafielo.lucasmod;

import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion.Mode;
import net.minecraftforge.common.ToolType;
import net.minecraft.world.World;

public class BigChungusBlock extends ModBlock {

  public BigChungusBlock(int hardnessAndResistance, Material material, ItemGroup itemGroup, ToolType tool,
      int harvestLevel) {
    super(hardnessAndResistance, material, itemGroup, tool, harvestLevel);
  }

  @Override
  public void harvestBlock(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te,
      ItemStack stack) {
    if (!world.isRemote()) {
      // Desculpe a grosseria ao pegar o XYZ.
      world.createExplosion(player, pos.getX(), pos.getY(), pos.getZ(), 8f, Mode.DESTROY);
    }
    world.playSound(null, pos, SoundRegistry.AMOGUS_SOUND_EVENT, SoundCategory.BLOCKS, 1f, 1f);
    super.harvestBlock(world, player, pos, state, te, stack);
  }
}
