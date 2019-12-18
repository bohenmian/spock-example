package com.example.spockexample.mockito;

final public class FinalClassWithNonFinalMethod {

    private static final String string= "this is a final class with no final method";

    public String some() {
        return string;
    }

    public String noFinalMethod() {
        return string;
    }
}
