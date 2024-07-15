package mod.reborn.server.dinosaur;

import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.ai.util.MovementType;
import mod.reborn.server.entity.dinosaur.BeelzebufoEntity;
import mod.reborn.server.period.TimePeriod;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.ArrayList;

public class BeelzebufoDinosaur extends Dinosaur {
    public static final double SPEED = 0.38F;
    public BeelzebufoDinosaur(){
        super();
        this.setName("Beelzebufo");
        this.setDinosaurType(DinosaurType.NEUTRAL);
        this.setDinosaurClass(BeelzebufoEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0xECC35C, 0xCDC605);
        this.setEggColorFemale(0xE4CC92, 0xCEC704);
        this.setHealth(4, 10);
        this.setSpeed((SPEED -0.35), SPEED);
        this.setStrength(2, 10);
        this.setMaximumAge(fromDays(40));
        this.setEyeHeight(0.15F, 0.4F);
        this.setSizeX(0.2F, 0.5F);
        this.setSizeY(0.2F, 0.6F);
        this.setMovementType(MovementType.NEAR_SURFACE);
        this.setStorage(5);
        this.setDiet((Diet.PCARNIVORE.get()));
        this.setBones("leg_bones", "skull", "ribcage", "teeth");
        this.setHeadCubeName("Head");
        this.setMarineAnimal(true);
        this.setBreeding(false, 2, 6, 20, false, true);
        this.setScale(1.05F, 0.065F);
        this.shouldDefendOffspring();
        String[][] recipe =     {
                { "teeth"},
                { "skull"},
                { "ribcage"},
                { "leg_bones"}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<Biome> biomeList = new ArrayList<Biome>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.BEACH));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.RIVER));
        this.setSpawn(1, biomeList.toArray(new Biome[biomeList.size()]));
    }
}
