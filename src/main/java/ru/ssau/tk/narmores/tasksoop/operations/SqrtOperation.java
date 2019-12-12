package ru.ssau.tk.narmores.tasksoop.operations;

@SuppressWarnings("SpellCheckingInspection")
public class SqrtOperation extends Operation {
    @Override
    public double apply(double number) {
        return Math.sqrt(number);
    }
}
