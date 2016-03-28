package pl.effectivesolutions.core.arm.impl;

/**
 * Request setting servo in max position.
 * Created by Tomasz Sokół on 2016-03-27.
 */
public class MaxRequest implements Request {

    private static MaxRequest instance;

    private MaxRequest(){

    }

    public static MaxRequest instance(){
        if(instance == null){
            instance = new MaxRequest();
        }
        return instance;
    }

    @Override
    public int target() {
        return PositionLimits.MAX.getValue();
    }
}
