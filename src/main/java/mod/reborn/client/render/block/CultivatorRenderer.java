package mod.reborn.client.render.block;

import mod.reborn.client.model.animation.EntityAnimation;
import mod.reborn.server.entity.DinosaurEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import javax.vecmath.Vector3f;
import mod.reborn.server.block.entity.CultivatorBlockEntity;
import org.lwjgl.opengl.GL11;

public class CultivatorRenderer extends TileEntitySpecialRenderer<CultivatorBlockEntity> {
    private Minecraft mc = Minecraft.getMinecraft();

    @Override
    public void render(CultivatorBlockEntity tileEntity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.pushMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.translate(x + 0.5, y + 1, z + 0.5);

        if (tileEntity.isProcessing(0) && tileEntity.getField(1) != 0) {
            long timer = tileEntity.getWorld().getTotalWorldTime(); // Assuming getWorld() is a valid method
            DinosaurEntity entity = tileEntity.getDinosaurEntity();
            if (entity != null) {
                float percentageDone = tileEntity.getField(0) / (float) tileEntity.getField(1);
                Vector3f vec = entity.getDinosaurCultivatorRotation();

                GlStateManager.rotate(90F, -1, 0, 0);
                GlStateManager.rotate(vec.y, 0, 1, 0); // Adjust the rotation axis if needed
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F); // Note: GlStateManager.rotate takes angle and rotation axis parameters
                GlStateManager.rotate(vec.z, 0, 0, 1); // Adjust the rotation axis if needed
                GlStateManager.scale(percentageDone, percentageDone, percentageDone);
                GlStateManager.enableLight(2);
                GlStateManager.scale(0.04, 0.04, 0.04);

                this.mc.getRenderManager().renderEntity(entity, 0, 0, 0, 0, 0, false);
            }
        }

        GlStateManager.popMatrix();
    }
}

