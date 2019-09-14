package ru.ssau.tk.narmores.tasksoop.person;

public class FirstTask {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.setFirstName("Oleg");
        firstPerson.setLastName("Ivanov");
        firstPerson.setPassportId(378183);

        secondPerson.setFirstName("Ekaterina");
        secondPerson.setLastName("Ivanova");
        secondPerson.setPassportId(381873);

        System.out.println(firstPerson.getLastName() + ' ' + firstPerson.getFirstName() + "; passport: " + firstPerson.getPassportId());
        System.out.println(secondPerson.getLastName() + ' ' + secondPerson.getFirstName() + "; passport: " + secondPerson.getPassportId());
    }
}
