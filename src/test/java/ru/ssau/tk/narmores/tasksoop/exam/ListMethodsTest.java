package ru.ssau.tk.narmores.tasksoop.exam;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ListMethodsTest {

    @Test
    public void testGetMethods() {
        Object object = new Object();
        String[] objectMethods = new String[]{"public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException",
                "public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException",
                "public final void java.lang.Object.wait() throws java.lang.InterruptedException",
                "public boolean java.lang.Object.equals(java.lang.Object)",
                "public java.lang.String java.lang.Object.toString()",
                "public native int java.lang.Object.hashCode()",
                "public final native java.lang.Class java.lang.Object.getClass()",
                "public final native void java.lang.Object.notify()",
                "public final native void java.lang.Object.notifyAll()"};
        assertEquals(ListMethods.getMethods(object), objectMethods);
    }
}