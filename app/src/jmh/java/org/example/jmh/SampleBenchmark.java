package org.example.jmh;

import org.example.Hofstadter;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 1)
@Warmup(iterations = 1, time = 7)
@Measurement(iterations = 2, time = 7)
public class SampleBenchmark {
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive10(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(10);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive20(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(20);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive50(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(50);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive75(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(75);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive100(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(100);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive125(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(125);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive150(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(150);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive200(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(200);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void naive220(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequence(220);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem10(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(10);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem20(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(20);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem50(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(50);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem75(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(75);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem100(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(100);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem125(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(125);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem150(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(150);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem200(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(200);
        bh.consume(output);
    }
    @Benchmark
    @Timeout(time = 7, timeUnit = TimeUnit.SECONDS)
    public void mem220(Blackhole bh) {
        Hofstadter hofstadter = new Hofstadter();
        Integer output = hofstadter.gSequenceMem(220);
        bh.consume(output);
    }
}
