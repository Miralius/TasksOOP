package ru.ssau.tk.narmores.tasksoop.point;

public class FirstTask {

    public static void main(String[] args) {
        Point origin = new Point(0, 0, 0);
        Point firstPoint = new Point(3, 4, 5);
        Point secondPoint = new Point(74.38, 827.88, -4827.7);

        System.out.println("Origin: " + origin.x + ' ' + origin.y + ' ' + origin.z);
        System.out.println("First point: " + firstPoint.x + ' ' + firstPoint.y + ' ' + firstPoint.z);
        System.out.println("Second point: " + secondPoint.x + ' ' + secondPoint.y + ' ' + secondPoint.z);
    }
}
