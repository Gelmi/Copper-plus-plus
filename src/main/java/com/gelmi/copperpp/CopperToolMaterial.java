package com.gelmi.copperpp;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {

    public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();

    @Override
    public int getDurability(){
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public float getAttackDamage(){
        return 2;
    }

    @Override
    public int getMiningLevel(){
        return 2;
    }

    @Override
    public int getEnchantability(){
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient(){
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }


}
