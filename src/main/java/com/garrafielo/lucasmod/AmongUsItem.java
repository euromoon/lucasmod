package com.garrafielo.lucasmod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AmongUsItem extends Item {

  public AmongUsItem(Properties properties) {
    super(properties);
  }

  @Override
  public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
    if (worldIn.isRemote()) {
      entityLiving.playSound(SoundRegistry.AMONG_US_ROLE_SOUND_EVENT, 1, 1);
    }
    return super.onItemUseFinish(stack, worldIn, entityLiving);
  }
}
