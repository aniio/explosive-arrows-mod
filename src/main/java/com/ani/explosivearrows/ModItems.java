package com.ani.explosivearrows;

import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ExplosiveArrow.MOD_ID);

    public static final RegistryObject<Item> EXPLOSIVE_ARROW = ITEMS.register("explosive_arrow", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.COMBAT)));

}