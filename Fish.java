package com.profacilis.types;

import com.profacilis.Type;

public class Fish extends Animal {

    public Fish() {

        super.setType(Type.FISH);
        super.setNumberOfLegs(0);
        super.setHasTail(false);
        super.canSwim();
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
