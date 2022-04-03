package io.codelex.streams.practice;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CharacterToStringCollector implements Collector<Character, StringBuilder, String> {
    @Override
    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuilder, Character> accumulator() {
        return (StringBuilder builder, Character symbol) -> builder.append(symbol);
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return (StringBuilder operatorsOne, StringBuilder operatorTwo) -> operatorsOne.append(operatorTwo);
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return (StringBuilder builder) -> builder.toString();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return new HashSet<>();
    }
}
