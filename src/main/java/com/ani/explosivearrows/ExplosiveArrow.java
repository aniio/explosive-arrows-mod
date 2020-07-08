package com.ani.explosivearrows;

import net.minecraft.tags.ItemTags;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExplosiveArrow.MOD_ID)
public class ExplosiveArrow {


    public static final String MOD_ID = "eamod";

    public ExplosiveArrow() {
        //Register the ITEMS deferred register to the mod event bus.
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
}