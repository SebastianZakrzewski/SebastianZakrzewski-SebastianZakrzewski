package com.profacilis.types;

import com.profacilis.Type;

public class Snake extends Animal {


    public Snake() {

        super.setType(Type.SNAKE);
        super.setNumberOfLegs(0);
        super.setHasTail(true);

    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
