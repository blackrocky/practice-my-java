package com.googlecode.practicemyjava.basic;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OuterClassTest {
    @Test
    public void should_return_correct_numbers() throws Exception {
    	OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        assertThat(innerClass.getMemberVarPlusStaticVarFromOuterClass(), is(3));

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        assertThat(staticNestedClass.getStaticVarFromOuterClass(), is(1));
    }
}