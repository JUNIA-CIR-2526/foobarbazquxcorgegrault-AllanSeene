package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> baz;
    private Qux qux;
    private Corge corge;
    private List<Grault> grault;


    public Foo(Bar bar) {
        this.bar = bar;
        this.baz = new ArrayList<>();
        this.qux = new Qux();
        this.grault = new ArrayList<>();
    }


    public void addBaz(Baz baz) {
        this.baz.add(baz);
    }


    public void addGrault() {
        Grault grault = new Grault(this);
        this.grault.add(grault);
    }

    public Bar getBar() {
        return bar;
    }

    public List<Baz> getBazs() {
        return baz;
    }

    public Qux getQux() {
        return qux;
    }

    public Corge getCorge() {
        return corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public List<Grault> getGraults() {
        return grault;
    }
}

