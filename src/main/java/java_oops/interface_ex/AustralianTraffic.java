package java_oops.interface_ex;

import java_basics.utils.base;

public class AustralianTraffic extends base implements CentralTraffic,ContinentalTraffic {
    public static void main(String[] args) {
        CentralTraffic a = new AustralianTraffic();
        AustralianTraffic at = new AustralianTraffic();
        ContinentalTraffic c = new AustralianTraffic();
        a.redStop();
        a.greenGo();
        a.flashYellow();
        at.walkOnSymbol();
        c.TrainSymbol();
    }
    @Override
    public void greenGo() {
        printMe("green go");
    }

    @Override
    public void redStop() {
        printMe("red stop ");
    }

    @Override
    public void flashYellow() {
        printMe("yellow flash");
    }

    public void walkOnSymbol(){
        printMe("walking on symbol");
    }

    @Override
    public void TrainSymbol() {
        printMe("train symbols");
    }
}
