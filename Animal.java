package com.profacilis.types;

import com.profacilis.Example;
import com.profacilis.Movable;
import com.profacilis.Type;

import java.io.Serializable;

public abstract class Animal implements Serializable, Example, Movable {

    private Type type;
    private int numberOfLegs;
    private boolean hasTail;


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    @Override
    public boolean canSwim() {
        return false;
    }




}