package com.profacilis;

public enum Type {

    DOG(true), CAT(true),
    BIRD(true), SNAKE(false),
    SPIDER(false), WASP(false), FISH(true);

    private boolean nice;

    Type(boolean nice) {

        this.nice = nice;


    }

    public boolean isNice() {

        return nice;
    }




}
