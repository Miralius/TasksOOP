package ru.ssau.tk.narmores.tasksoop;

import org.testng.annotations.Test;
import ru.ssau.tk.narmores.tasksoop.person.Person;

public class GetNameOfClassOrPrimitiveTest {

    @Test
    public void testPrintType() {
        GetNameOfClassOrPrimitive.printType((byte) 255);
        GetNameOfClassOrPrimitive.printType('z');
        GetNameOfClassOrPrimitive.printType((short) 65535);
        GetNameOfClassOrPrimitive.printType(125);
        GetNameOfClassOrPrimitive.printType(125L);
        GetNameOfClassOrPrimitive.printType(0.1f);
        GetNameOfClassOrPrimitive.printType(0.1d);
        GetNameOfClassOrPrimitive.printType(false);
        GetNameOfClassOrPrimitive.printType(new Person());
        GetNameOfClassOrPrimitive.printType(null);
    }

}