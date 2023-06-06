package me.m1chelle99.foxiemc.entities.foxie.goals;

import me.m1chelle99.foxiemc.entities.foxie.Foxie;
import me.m1chelle99.foxiemc.entities.foxie.controls.FoxieAIControl;
import net.minecraft.world.entity.ai.goal.Goal;

import java.util.EnumSet;

public class FoxieFaceplantGoal extends Goal {
    private final Foxie foxie;
    private int countdown;

    public FoxieFaceplantGoal(Foxie foxie) {
        this.foxie = foxie;
        this.setFlags(EnumSet.of(
                Goal.Flag.LOOK,
                Goal.Flag.JUMP,
                Goal.Flag.MOVE));
    }

    public boolean canUse() {
        return foxie.getFlag(FoxieAIControl.FACEPLANTED) && !foxie.getFlag(FoxieAIControl.SLEEPING);
    }

    public boolean canContinueToUse() {
        return this.canUse() && this.countdown > 0;
    }

    public void start() {
        this.countdown = this.adjustedTickDelay(40);
    }

    public void stop() {
        foxie.setFlag(FoxieAIControl.FACEPLANTED, false);
    }

    public void tick() {
        --this.countdown;
    }
}
