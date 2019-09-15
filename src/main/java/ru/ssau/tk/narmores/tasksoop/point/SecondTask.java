package ru.ssau.tk.narmores.tasksoop.point;

public class SecondTask {
    public static void main(String[] args) {
        Point firstPoint = new Point(3, 4, 5);
        Point secondPoint = new Point(74.38, 827.88, -4827.7);
        System.out.println("First point: " + firstPoint.x + ' ' + firstPoint.y + ' ' + firstPoint.z);
        System.out.println("Second point: " + secondPoint.x + ' ' + secondPoint.y + ' ' + secondPoint.z);
        System.out.println("Sum: " + Points.sum(firstPoint, secondPoint).x + ' ' + Points.sum(firstPoint, secondPoint).y + ' ' + Points.sum(firstPoint, secondPoint).z);
        System.out.println("Subtract: " + Points.subtract(firstPoint, secondPoint).x + ' ' + Points.subtract(firstPoint, secondPoint).y + ' ' + Points.subtract(firstPoint, secondPoint).z);
        System.out.println("Multiply: " + Points.multiply(firstPoint, secondPoint).x + ' ' + Points.multiply(firstPoint, secondPoint).y + ' ' + Points.multiply(firstPoint, secondPoint).z);
        System.out.println("Divide: " + Points.divide(firstPoint, secondPoint).x + ' ' + Points.divide(firstPoint, secondPoint).y + ' ' + Points.divide(firstPoint, secondPoint).z);
    }
}