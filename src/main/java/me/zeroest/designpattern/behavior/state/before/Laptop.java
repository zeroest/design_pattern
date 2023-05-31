package me.zeroest.designpattern.behavior.state.before;

/*
간단하게 켜고, 끄는 노트북에 절전모드를 추가
상태에 따른 동작은 다음과 같다고 가정
- 노트북 전원이 켜져 있는 상태에서 전원 버튼을 누르면, 전원을 끌 수 있습니다.
- 노트북 전원이 꺼져 있는 상태에서 전원 버튼을 누르면, 절전모드가 됩니다.
- 노트북 절전모드 상태에서 전원 버튼을 누르면, 전원을 켤 수 있습니다.
*/
public class Laptop {

    private static final String ON = "on";
    private static final String OFF = "off";
    private static final String SAVING = "saving";
    private String powerState = "";

    public Laptop(){
        setPowerState(Laptop.OFF);
    }

    private void setPowerState(String powerState){
        this.powerState = powerState;
    }

    // 추가된 상태 조건으로 인해 코드가 복잡해짐
    public void powerPush(){
        if (ON.equals(this.powerState)) {
            setPowerState(Laptop.OFF);
            printState();
        }
        else if (SAVING.equals(this.powerState)) {
            setPowerState(Laptop.ON);
            printState();
        }
        else {
            setPowerState(Laptop.SAVING);
            printState();
        }
    }

    private void printState(){
        System.out.println("전원 " + this.powerState);
    }

}
