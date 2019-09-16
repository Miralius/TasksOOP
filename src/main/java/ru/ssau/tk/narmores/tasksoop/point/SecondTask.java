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

        //#1.5 task
        System.out.println("Multiplication firstPoint by number=5: " + Points.enlarge(firstPoint, 5).x + ' ' + Points.enlarge(firstPoint, 5).y + ' ' + Points.enlarge(firstPoint, 5).z);

        //#1.6 task
        System.out.println("Length of radius vector #1: " + Points.length(firstPoint));
        System.out.println("Length of radius vector #2: " + Points.length(secondPoint));

        //#1.7 task
        System.out.println("Opposite of #1 point: " + Points.opposite(firstPoint).x + ' ' + Points.opposite(firstPoint).y + ' ' + Points.opposite(firstPoint).z);
        System.out.println("Inverse of #1 point: " + Points.inverse(firstPoint).x + ' ' + Points.inverse(firstPoint).y + ' ' + Points.inverse(firstPoint).z);

        //#.18 task
        System.out.println("Vector product: " + Points.vectorProduct(firstPoint, secondPoint).x + ' ' + Points.vectorProduct(firstPoint, secondPoint).y + ' ' + Points.vectorProduct(firstPoint, secondPoint).z);
        System.out.println("Scalar product: " + Points.scalarProduct(firstPoint, secondPoint));
    }
}
