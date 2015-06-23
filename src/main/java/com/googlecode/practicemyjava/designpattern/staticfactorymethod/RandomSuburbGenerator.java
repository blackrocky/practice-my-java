package com.googlecode.practicemyjava.designpattern.staticfactorymethod;

/**
 * Advantage of static factory method (from Effective Java 2nd Edition by Joshua Bloch)
 * 1. Unlike constructors, they have names
 * 2. Unlike constructors, they are not required to create a new object each time they're invoked
 * 3. Unlike constructors, they can return an object of any subtype of their return type
 * 4. They reduce the verbosity of creating parameterised type instances
 *
 * Disadvantage
 * 1. Classes without public or protected constructors cannot be subclassed
 * 2. They are not readily distinguishable from other static methods
 */
public class RandomSuburbGenerator {
    public enum State {
        NSW, QLD, SA, TAS, VIC, WA, ACT, NT, RANDOM
    }

    public enum Type {
        CITY, REGIONAL, RANDOM
    }

    private State state;
    private Type type;

    private RandomSuburbGenerator(State state, Type type) {
        this.state = state;
        this.type = type;
    }

    public static RandomSuburbGenerator fromState(State state) {
        return new RandomSuburbGenerator(state, Type.RANDOM);
    }

    public static RandomSuburbGenerator fromType(Type type) {
        return new RandomSuburbGenerator(State.RANDOM, type);
    }

    public String generate() {
        return "suburb"; // implementation omitted
    }
}
