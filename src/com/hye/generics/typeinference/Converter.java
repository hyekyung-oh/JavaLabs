package com.hye.generics.typeinference;

@FunctionalInterface
public interface Converter<U, T> {
    T convert(U input);
}
