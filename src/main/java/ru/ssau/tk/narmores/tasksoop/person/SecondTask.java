package ru.ssau.tk.narmores.tasksoop.person;

public class SecondTask {
    public static void main(String[] args) {
        Person firstObj = new Person();
        Person secondObj = new Person("Natalia", "Pavlova");
        Person thirdObj = new Person(123456);
        Person fourthObj = new Person("Natalia", "Pavlova", 123456);
        System.out.println("The first line: " + firstObj.getFirstName() + ' ' + firstObj.getLastName() + ", passport " + firstObj.getPassportId());
        System.out.println("The second line: " + secondObj.getFirstName() + ' ' + secondObj.getLastName() + ", passport " + secondObj.getPassportId());
        System.out.println("The third line: " + thirdObj.getFirstName() + ' ' + thirdObj.getLastName() + ", passport " + thirdObj.getPassportId());
        System.out.println("The fourth line: " + fourthObj.getFirstName() + ' ' + fourthObj.getLastName() + ", passport " + fourthObj.getPassportId());
    }
}
