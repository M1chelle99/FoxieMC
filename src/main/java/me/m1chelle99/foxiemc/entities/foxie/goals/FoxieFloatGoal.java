package me.m1chelle99.foxiemc.entities.foxie.goals;

import me.m1chelle99.foxiemc.entities.foxie.Foxie;
import net.minecraft.world.entity.ai.goal.FloatGoal;

public class FoxieFloatGoal extends FloatGoal  {
    private final Foxie foxie;

    public FoxieFloatGoal(Foxie foxie) {
        super(foxie);
        this.foxie = foxie;
    }
    
    @Override
    public void start() {
        this.foxie.activityControl.stopActivity();
    }
}
