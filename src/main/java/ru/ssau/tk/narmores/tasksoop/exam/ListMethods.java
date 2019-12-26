package ru.ssau.tk.narmores.tasksoop.exam;

import java.lang.reflect.Method;

public class ListMethods {
    public static String[] getMethods(Object object) {
        Method[] methods = object.getClass().getMethods();
        String[] strings = new String[methods.length];
        for(int i = 0; i < methods.length; i++) {
            strings[i] = methods[i].toString();
        }
        return strings;
    }
}
