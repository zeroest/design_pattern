package me.zeroest.designpattern.state.before;

public class Laptop {

    private static final String ON = "on";
    private static final String OFF = "off";
    private String powerState = "";

    public Laptop(){
        setPowerState(Laptop.OFF);
    }

    private void setPowerState(String powerState){
        this.powerState = powerState;
    }

    public void powerPush(){
        if ("on".equals(this.powerState)) {
            setPowerState(Laptop.OFF);
            printState();
        }
        else {
            setPowerState(Laptop.ON);
            printState();
        }
    }

    private void printState(){
        System.out.println("전원 " + this.powerState);
    }

}
