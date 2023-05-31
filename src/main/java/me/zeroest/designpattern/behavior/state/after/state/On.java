package me.zeroest.designpattern.behavior.state.after.state;

public class On implements PowerState {
    @Override
    public PowerState powerPush() {
        System.out.println("전원 off");
        return new Off();
    }
}
