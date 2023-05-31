package me.zeroest.designpattern.behavior.state.after.state;

public class Off implements PowerState {
    @Override
    public PowerState powerPush() {
        System.out.println("절전모드");
        return new Saving();
    }
}
