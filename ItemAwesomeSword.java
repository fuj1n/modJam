package modJam;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemAwesomeSword extends ItemSword{

	public String texture;
	
	public ItemAwesomeSword(int par1, EnumToolMaterial par2EnumToolMaterial, String tex) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(ModJam.modJamCreativeTab);
		texture = tex;
	}
	
	@Override
	public void updateIcons(IconRegister par1IconRegister){
		this.iconIndex = par1IconRegister.registerIcon(texture);
	}

}
