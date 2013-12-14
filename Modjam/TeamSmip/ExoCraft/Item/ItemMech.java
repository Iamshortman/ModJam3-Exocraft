package Modjam.TeamSmip.ExoCraft.Item;

import Modjam.TeamSmip.ExoCraft.Entity.EntityMech;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemMech extends Item
{

	public ItemMech(int par1)
	{
		super(par1);
	}

	ResourceLocation chip = new ResourceLocation("Resources/Textures/items/mech.png");
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer)
	{
		if (par2World.isRemote)
		{
			return par1ItemStack;
		}
		else
		{
			MovingObjectPosition movingobjectposition = this
					.getMovingObjectPositionFromPlayer(par2World,
							par3EntityPlayer, true);

			if (movingobjectposition == null)
			{
				return par1ItemStack;
			}
			else
			{
				if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
				{
					int i = movingobjectposition.blockX;
					int j = movingobjectposition.blockY;
					int k = movingobjectposition.blockZ;

					if (!par2World.canMineBlock(par3EntityPlayer, i, j, k))
					{
						return par1ItemStack;
					}

					if (!par3EntityPlayer.canPlayerEdit(i, j, k,
							movingobjectposition.sideHit, par1ItemStack))
					{
						return par1ItemStack;
					}

					EntityMech mech = new EntityMech(par2World);
					mech.setPosition(i, j + 1, k);
					par2World.spawnEntityInWorld(mech);
				}
			}
		}
		return par1ItemStack;
	}

}
