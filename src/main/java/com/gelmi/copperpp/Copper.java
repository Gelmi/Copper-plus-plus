package com.gelmi.copperpp;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.tools.Tool;

public class Copper implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("copperpp");

	public static ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4F, new FabricItemSettings());
	public static ToolItem COPPER_PICKAXE = new PickaxeItem(CopperToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registries.ITEM, new Identifier("copperpp", "copper_sword"), COPPER_SWORD);
		Registry.register(Registries.ITEM, new Identifier("copperpp", "copper_pickaxe"), COPPER_PICKAXE);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.addAfter(Items.STONE_SWORD, COPPER_SWORD);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.addAfter(Items.STONE_HOE, COPPER_PICKAXE);
		});

		LOGGER.info("Hello Fabric world!");
	}
}