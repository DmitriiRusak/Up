package com.company;

public class Therd extends Second{


    public Therd(int a,Type type) {

        super(a,type);
    }
    /*
    *
    *
    *
    */
    @Override
    public void doMethod() {
        System.out.println("doing therd`s method");
    }
}
