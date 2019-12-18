package com.example.spockexample.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// MockitoException
class FinalClassWithFinalMethodTest {

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void should_return_something() {
        FinalClassWithFinalMethod method = mock(FinalClassWithFinalMethod.class);
        when(method.finalMethod()).thenReturn("this is final class with final method");
        assertEquals("this is final class with final method", method.finalMethod());
    }
}
