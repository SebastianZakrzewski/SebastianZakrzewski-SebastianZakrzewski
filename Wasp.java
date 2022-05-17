package com.profacilis.types;

import com.profacilis.Type;

public class Wasp extends Animal {


    public Wasp() {

        super.setType(Type.WASP);
        super.setNumberOfLegs(4);
        super.setHasTail(false);
        super.canSwim();
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
