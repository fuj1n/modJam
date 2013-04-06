package modJam;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockTable extends BlockGlobalFurniturePlacementHandler{

	private Icon[] blockColors = new Icon[16];
	
	public Block belowBlock;
	
	public BlockTable(int par1, Block belowBlock) {
		super(par1, Material.circuits);
		this.setStepSound(belowBlock.stepSound);
		this.belowBlock = belowBlock;
	}
	public boolean isBlockInLocalPlacementWhiteList(World par1World, int par2, int par3, int par4){
		return false;
	}
	
    /**
     * Determines if a torch can be placed on the top surface of this block.
     * Useful for creating your own block that torches can be on, such as fences.
     *
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z Position
     * @return True to allow the torch to be placed
     */
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
    {
        return true;
    }
	
	@Override
	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2){
		return blockColors[par2];
	}
	
	@Override
	public boolean renderAsNormalBlock(){	
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public int getRenderType(){
		return ClientProxyModJam.tableRenderType;
	}
	
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
	@Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
        par3List.add(new ItemStack(par1, 1, 4));
        par3List.add(new ItemStack(par1, 1, 5));
        par3List.add(new ItemStack(par1, 1, 6));
        par3List.add(new ItemStack(par1, 1, 7));
        par3List.add(new ItemStack(par1, 1, 8));
        par3List.add(new ItemStack(par1, 1, 9));
        par3List.add(new ItemStack(par1, 1, 10));
        par3List.add(new ItemStack(par1, 1, 11));
        par3List.add(new ItemStack(par1, 1, 12));
        par3List.add(new ItemStack(par1, 1, 13));
        par3List.add(new ItemStack(par1, 1, 14));
        par3List.add(new ItemStack(par1, 1, 15));
    }
	
	@Override
	public int damageDropped(int par1){
		return par1;
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5){
		return true;
	}
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockColors[0] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreWhite");
    	this.blockColors[1] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreOrange");
    	this.blockColors[2] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreMagenta");
    	this.blockColors[3] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreLBlue");
    	this.blockColors[4] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreYellow");
    	this.blockColors[5] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreLime");
    	this.blockColors[6] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOrePink");
    	this.blockColors[7] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreGray");
    	this.blockColors[8] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreLGray");
    	this.blockColors[9] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreCyan");
    	this.blockColors[10] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOrePurple");
    	this.blockColors[11] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreBlue");
    	this.blockColors[12] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreBrown");
    	this.blockColors[13] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreGreen");
    	this.blockColors[14] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreRed");
    	this.blockColors[15] = par1IconRegister.registerIcon("awesomeMod:fuj1n.AwesomeMod.awesomeOreBlack");
    }
}
