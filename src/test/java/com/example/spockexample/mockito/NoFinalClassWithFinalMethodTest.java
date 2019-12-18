package com.example.spockexample.mockito;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.expression.spel.support.ReflectiveMethodResolver;
import org.springframework.objenesis.instantiator.util.ClassUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// MissingMethodInvocationException
class NoFinalClassWithFinalMethodTest {

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void should_return_something() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        NoFinalClassWithFinalMethod method = mock(NoFinalClassWithFinalMethod.class);
        Method finalMethod = method.getClass().getMethod("finalMethod");
        Object invoke = finalMethod.invoke(method);

        when(method.finalMethod()).thenReturn("no final class with final method");
        assertEquals("no final class with final method", method.finalMethod());
    }
}

