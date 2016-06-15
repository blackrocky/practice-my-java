package com.googlecode.practicemyjava.designpattern.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SingletonStaticTest {
    private SingletonStatic singletonStatic;
    @Mock private Logger logger;

    @Test
    public void should() throws NoSuchFieldException, IllegalAccessException {
        setStaticFinalField(SingletonStatic.class, "LOGGER", logger);
        singletonStatic = SingletonStatic.getInstance();
        verify(logger).info("returning static instance");

        singletonStatic = SingletonStatic.getInstance();
        singletonStatic = SingletonStatic.getInstance();
        singletonStatic = SingletonStatic.getInstance();
        verify(logger, times(0)).info("inside singleton static constructor");
    }

    public static void setStaticFinalField(final Class clazz, final String fieldName, final Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        final Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        final Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, fieldValue);
    }

}