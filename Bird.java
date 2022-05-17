package com.profacilis.types;

import com.profacilis.Type;

public class Bird extends Animal {

    public Bird() {
        super.setNumberOfLegs(2);
        super.setType(Type.BIRD);
        super.setHasTail(false);
        super.canSwim();

    }

    @Override
    public boolean canSwim() {
        return false;
    }
}