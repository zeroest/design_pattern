package me.zeroest.designpattern.behavior.state.after.state;

public class Saving implements PowerState {
    @Override
    public PowerState powerPush() {
        System.out.println("전원 on");
        return new On();
    }
}
