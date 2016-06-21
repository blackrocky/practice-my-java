package com.googlecode.practicemyjava.util;

import org.apache.commons.lang.builder.StandardToStringStyle;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

public class Pair<K, V> {
    private final K key;
    private final V value;

    private static final StandardToStringStyle STANDARD_TO_STRING_STYLE = new StandardToStringStyle();

    static {
        STANDARD_TO_STRING_STYLE.setUseShortClassName(true);
        STANDARD_TO_STRING_STYLE.setUseIdentityHashCode(false);
    }

    public Pair() {
        this(null, null);
    }

    public Pair(final K key, final V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> pair(final K key, final V value) {
        return new Pair<>(key, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj != null && obj instanceof Pair) {
            final Pair that = (Pair) obj;
            return reflectionEquals(this, that);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return reflectionToString(this, STANDARD_TO_STRING_STYLE);
    }
}
