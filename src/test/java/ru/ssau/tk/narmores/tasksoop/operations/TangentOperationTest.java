package ru.ssau.tk.narmores.tasksoop.operations;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    private final double DOUBLE_EPSILON = 1E-12;
    TangentOperation identical = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(5), Math.tan(5), DOUBLE_EPSILON);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NaN, DOUBLE_EPSILON);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.NaN, DOUBLE_EPSILON);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DOUBLE_EPSILON);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(5), Math.tan(Math.tan(Math.tan(5))), DOUBLE_EPSILON);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DOUBLE_EPSILON);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, DOUBLE_EPSILON);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, DOUBLE_EPSILON);
    }
}