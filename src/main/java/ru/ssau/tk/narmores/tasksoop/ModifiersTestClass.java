package ru.ssau.tk.narmores.tasksoop;

strictfp abstract class ModifiersTestClass {
    volatile transient int testField = 1;

    native synchronized int testMethod(); /*{
        return 1;
    }*/
    //see tables in .jpg files → src\main\resources
}
