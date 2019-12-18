package com.example.spockexample.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// MockitoException
class FinalClassWithNonFinalMethodTest {

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void should_return_something() {
//        FinalClassWithNonFinalMethod method = mock(FinalClassWithNonFinalMethod.class);
//        when(method.some()).thenReturn("final class within no final method");
//        String actual = method.noFinalMethod();
//        Assertions.assertEquals("final class within no final method", actual);
    }
}
