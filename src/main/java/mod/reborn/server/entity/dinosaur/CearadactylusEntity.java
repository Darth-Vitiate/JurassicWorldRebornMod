package mod.reborn.server.entity.dinosaur;

import mod.reborn.server.entity.FlyingDinosaurEntity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CearadactylusEntity extends FlyingDinosaurEntity
{
    public CearadactylusEntity(World world)
    {
        super(world);
        this.target(AlligatorGarEntity.class, AlvarezsaurusEntity.class, BeelzebufoEntity.class, CompsognathusEntity.class, CoelacanthEntity.class, MicroceratusEntity.class, MicroraptorEntity.class, MegapiranhaEntity.class, LeptictidiumEntity.class, LudodactylusEntity.class, OthnieliaEntity.class, OviraptorEntity.class, ProtoceratopsEntity.class, SegisaurusEntity.class, TroodonEntity.class, ZhenyuanopterusEntity.class, CrassigyrinusEntity.class, DiplocaulusEntity.class, DimorphodonEntity.class, EntityPlayer.class, EntityAnimal.class, EntityVillager.class, EntityMob.class);
    }
}
