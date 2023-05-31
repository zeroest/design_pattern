package me.zeroest.designpattern.behavior.state.after;

import me.zeroest.designpattern.behavior.state.after.state.Off;
import me.zeroest.designpattern.behavior.state.after.state.PowerState;

public class Laptop {
    public Laptop() {
        this.powerState = new Off();
    }

    private PowerState powerState;

    private void setPowerState(PowerState powerState){
        this.powerState = powerState;
    }

    public void powerPush() {
        PowerState nextState = powerState.powerPush();
        setPowerState(nextState);
    }
}
