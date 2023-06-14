package me.m1chelle99.foxiemc.entity.foxie.goals;

import me.m1chelle99.foxiemc.entity.foxie.Foxie;
import me.m1chelle99.foxiemc.entity.foxie.FoxieConstants;
import net.minecraft.world.entity.ai.goal.FloatGoal;

public class FoxieFloatGoal extends FloatGoal {
    private final Foxie _foxie;

    public FoxieFloatGoal(Foxie foxie) {
        super(foxie);
        this._foxie = foxie;
    }

    @Override
    public void start() {
        this._foxie.aiControl.startActivity(FoxieConstants.ACTIVITY_NONE);
    }
}
