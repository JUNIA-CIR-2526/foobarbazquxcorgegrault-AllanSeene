package com.jad;

public class Corge {
    private Foo foo;

    public Corge(Foo foo) {
        this.foo = foo;
        foo.setCorge(this);
    }

    public Foo getFoo() {
        return foo;
    }
}
