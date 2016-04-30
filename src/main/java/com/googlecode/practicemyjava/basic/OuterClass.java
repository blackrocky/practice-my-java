package com.googlecode.practicemyjava.basic;

public class OuterClass {
    private static final int staticVar = 1;
    private int memberVar = 2;

    private static int getStaticVar() {
        return staticVar;
    }

    private int getMemberVar() {
        return memberVar;
    }

    class InnerClass {
        int getMemberVarPlusStaticVarFromOuterClass() {
            return getMemberVar() + getStaticVar();
        }
    }

    static class StaticNestedClass {
        int getStaticVarFromOuterClass() {
            return getStaticVar();
        }
    }
}
