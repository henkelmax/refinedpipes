package com.refinedmods.refinedpipes;

import com.refinedmods.refinedpipes.tile.EnergyPipeTileEntity;
import com.refinedmods.refinedpipes.tile.FluidPipeTileEntity;
import com.refinedmods.refinedpipes.tile.ItemPipeTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class RefinedPipesTileEntities {
    @ObjectHolder(RefinedPipes.ID + ":basic_item_pipe")
    public static final TileEntityType<ItemPipeTileEntity> BASIC_ITEM_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":improved_item_pipe")
    public static final TileEntityType<ItemPipeTileEntity> IMPROVED_ITEM_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":advanced_item_pipe")
    public static final TileEntityType<ItemPipeTileEntity> ADVANCED_ITEM_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":basic_fluid_pipe")
    public static final TileEntityType<FluidPipeTileEntity> BASIC_FLUID_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":improved_fluid_pipe")
    public static final TileEntityType<FluidPipeTileEntity> IMPROVED_FLUID_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":advanced_fluid_pipe")
    public static final TileEntityType<FluidPipeTileEntity> ADVANCED_FLUID_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":elite_fluid_pipe")
    public static final TileEntityType<FluidPipeTileEntity> ELITE_FLUID_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":ultimate_fluid_pipe")
    public static final TileEntityType<FluidPipeTileEntity> ULTIMATE_FLUID_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":basic_energy_pipe")
    public static final TileEntityType<EnergyPipeTileEntity> BASIC_ENERGY_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":improved_energy_pipe")
    public static final TileEntityType<EnergyPipeTileEntity> IMPROVED_ENERGY_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":advanced_energy_pipe")
    public static final TileEntityType<EnergyPipeTileEntity> ADVANCED_ENERGY_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":elite_energy_pipe")
    public static final TileEntityType<EnergyPipeTileEntity> ELITE_ENERGY_PIPE = null;
    @ObjectHolder(RefinedPipes.ID + ":ultimate_energy_pipe")
    public static final TileEntityType<EnergyPipeTileEntity> ULTIMATE_ENERGY_PIPE = null;
}
