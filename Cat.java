package com.profacilis.types;

import com.profacilis.Type;

public class Cat extends Animal {

    public Cat() {
        super.setType(Type.CAT);
        super.setNumberOfLegs(4);
        super.setHasTail(true);
        super.canSwim();

    }

    @Override
    public boolean canSwim() {
        return false;
    }
}