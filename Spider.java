package com.profacilis.types;

import com.profacilis.Type;

public class Spider extends Animal {


    public Spider() {

        super.setType(Type.SPIDER);
        super.setNumberOfLegs(4);
        super.setHasTail(false);
        super.canSwim();

    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
