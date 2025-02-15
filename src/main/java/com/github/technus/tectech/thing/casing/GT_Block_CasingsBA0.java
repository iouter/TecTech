package com.github.technus.tectech.thing.casing;

import static com.github.technus.tectech.thing.casing.GT_Block_CasingsTT.texturePage;

import com.github.technus.tectech.thing.CustomItemList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.enums.Textures;
import gregtech.api.objects.GT_CopiedBlockTexture;
import gregtech.api.util.GT_LanguageManager;
import gregtech.common.blocks.GT_Block_Casings_Abstract;
import gregtech.common.blocks.GT_Material_Casings;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

/**
 * Created by danie_000 on 03.10.2016.
 */
public class GT_Block_CasingsBA0 extends GT_Block_Casings_Abstract {
    private static IIcon[] tM0 = new IIcon[2];
    private static IIcon[] tM1 = new IIcon[2];
    private static IIcon[] tM2 = new IIcon[2];
    private static IIcon[] tM3 = new IIcon[2];
    private static IIcon[] tM4 = new IIcon[2];
    private static IIcon[] tM5 = new IIcon[2];
    private static IIcon[] tM6 = new IIcon[2];
    private static IIcon tM7;
    private static IIcon[] tM8 = new IIcon[2];
    private static IIcon[] tM9 = new IIcon[2];

    private static final byte START_INDEX = 16;

    public GT_Block_CasingsBA0() {
        super(GT_Item_CasingsBA0.class, "gt.blockcasingsBA0", GT_Material_Casings.INSTANCE);
        for (byte b = 0; b < 16; b = (byte) (b + 1)) {
            Textures.BlockIcons.casingTexturePages[texturePage][b + START_INDEX] =
                    new GT_CopiedBlockTexture(this, 6, b);
            /*IMPORTANT for block recoloring**/
        }

        GT_LanguageManager.addStringLocalization(
                getUnlocalizedName() + ".0.name", "Redstone Alloy Primary Tesla Windings");
        GT_LanguageManager.addStringLocalization(
                getUnlocalizedName() + ".1.name", "MV Superconductor Primary Tesla Windings");
        GT_LanguageManager.addStringLocalization(
                getUnlocalizedName() + ".2.name", "HV Superconductor Primary Tesla Windings");
        GT_LanguageManager.addStringLocalization(
                getUnlocalizedName() + ".3.name", "EV Superconductor Primary Tesla Windings");
        GT_LanguageManager.addStringLocalization(
                getUnlocalizedName() + ".4.name", "IV Superconductor Primary Tesla Windings");
        GT_LanguageManager.addStringLocalization(
                getUnlocalizedName() + ".5.name", "LuV Superconductor Primary Tesla Windings");
        GT_LanguageManager.addStringLocalization(
                getUnlocalizedName() + ".9.name", "ZPM Superconductor Primary Tesla Windings");

        GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".6.name", "Tesla Base Casing");
        GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".7.name", "Tesla Toroid Casing");
        GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".8.name", "Tesla Secondary Windings");

        CustomItemList.tM_TeslaPrimary_0.set(new ItemStack(this, 1, 0));
        CustomItemList.tM_TeslaPrimary_1.set(new ItemStack(this, 1, 1));
        CustomItemList.tM_TeslaPrimary_2.set(new ItemStack(this, 1, 2));
        CustomItemList.tM_TeslaPrimary_3.set(new ItemStack(this, 1, 3));
        CustomItemList.tM_TeslaPrimary_4.set(new ItemStack(this, 1, 4));
        CustomItemList.tM_TeslaPrimary_5.set(new ItemStack(this, 1, 5));
        CustomItemList.tM_TeslaPrimary_6.set(new ItemStack(this, 1, 9));

        CustomItemList.tM_TeslaBase.set(new ItemStack(this, 1, 6));
        CustomItemList.tM_TeslaToroid.set(new ItemStack(this, 1, 7));
        CustomItemList.tM_TeslaSecondary.set(new ItemStack(this, 1, 8));
    }

    @Override
    public void registerBlockIcons(IIconRegister aIconRegister) {
        tM0[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_TOP_BOTTOM_0");
        tM0[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_SIDES_0");
        tM1[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_TOP_BOTTOM_1");
        tM1[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_SIDES_1");
        tM2[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_TOP_BOTTOM_2");
        tM2[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_SIDES_2");
        tM3[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_TOP_BOTTOM_3");
        tM3[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_SIDES_3");
        tM4[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_TOP_BOTTOM_4");
        tM4[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_SIDES_4");
        tM5[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_TOP_BOTTOM_5");
        tM5[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_SIDES_5");
        tM9[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_TOP_BOTTOM_6");
        tM9[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_PRIMARY_SIDES_6");

        tM6[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_BASE_TOP_BOTTOM");
        tM6[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_BASE_SIDES");
        tM7 = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_TOROID");
        tM8[0] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_SECONDARY_TOP_BOTTOM");
        tM8[1] = aIconRegister.registerIcon("gregtech:iconsets/TM_TESLA_WINDING_SECONDARY_SIDES");
    }

    @Override
    public IIcon getIcon(int aSide, int aMeta) {
        switch (aMeta) {
            case 0:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM0[0];
                    default:
                        return tM0[1];
                }
            case 1:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM1[0];
                    default:
                        return tM1[1];
                }
            case 2:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM2[0];
                    default:
                        return tM2[1];
                }
            case 3:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM3[0];
                    default:
                        return tM3[1];
                }
            case 4:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM4[0];
                    default:
                        return tM4[1];
                }
            case 5:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM5[0];
                    default:
                        return tM5[1];
                }
            case 6:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM6[0];
                    default:
                        return tM6[1];
                }
            case 7:
                return tM7;
            case 8:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM8[0];
                    default:
                        return tM8[1];
                }
            case 9:
                switch (aSide) {
                    case 0:
                    case 1:
                        return tM9[0];
                    default:
                        return tM9[1];
                }
            default:
                return Textures.BlockIcons.MACHINE_CASING_SOLID_STEEL.getIcon();
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess aWorld, int xCoord, int yCoord, int zCoord, int aSide) {
        int tMeta = aWorld.getBlockMetadata(xCoord, yCoord, zCoord);
        return getIcon(aSide, tMeta);
    }

    @Override
    public void getSubBlocks(Item aItem, CreativeTabs par2CreativeTabs, List aList) {
        for (int i = 0; i <= 9; i++) {
            aList.add(new ItemStack(aItem, 1, i));
        }
    }
}
