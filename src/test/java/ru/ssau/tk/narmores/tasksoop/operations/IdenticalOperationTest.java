package ru.ssau.tk.narmores.tasksoop.operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private final double DOUBLE_EPSILON = 1E-12;
    IdenticalOperation identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(5), 5, DOUBLE_EPSILON);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DOUBLE_EPSILON);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DOUBLE_EPSILON);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DOUBLE_EPSILON);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(5), 5, DOUBLE_EPSILON);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DOUBLE_EPSILON);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DOUBLE_EPSILON);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, DOUBLE_EPSILON);
    }
}