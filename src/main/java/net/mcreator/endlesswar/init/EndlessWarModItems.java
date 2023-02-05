
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endlesswar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.endlesswar.item.TitanCrystalItem;
import net.mcreator.endlesswar.item.TABlogoItem;
import net.mcreator.endlesswar.EndlessWarMod;

public class EndlessWarModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EndlessWarMod.MODID);
	public static final RegistryObject<Item> TA_BLOGO = REGISTRY.register("ta_blogo", () -> new TABlogoItem());
	public static final RegistryObject<Item> TITAN_CRYSTAL = REGISTRY.register("titan_crystal", () -> new TitanCrystalItem());
}
