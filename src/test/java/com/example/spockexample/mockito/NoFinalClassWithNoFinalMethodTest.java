package com.example.spockexample.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NoFinalClassWithNoFinalMethodTest {

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void should_return_something() {
        NoFinalClassWithNoFinalMethod method = mock(NoFinalClassWithNoFinalMethod.class);
        when(method.noFinalMethod()).thenReturn("this is no final class with no final method");
        assertEquals("this is no final class with no final method", method.noFinalMethod());
    }
}
