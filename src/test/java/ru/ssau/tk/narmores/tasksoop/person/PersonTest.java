package ru.ssau.tk.narmores.tasksoop.person;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    //Task 1.10
    @Test
    public void testMethod() {
        Person firstObj = new Person();
        Person secondObj = new Person();
        firstObj.setFirstName("Anton");
        secondObj.setFirstName("Ivan");
        firstObj.setLastName("Ivanov");
        secondObj.setLastName("Antonov");
        firstObj.setPassportId(135792);
        secondObj.setPassportId(864209);
        assertEquals(firstObj.getFirstName(), "Anton");
        assertEquals(secondObj.getFirstName(), "Ivan");
        assertEquals(firstObj.getLastName(), "Ivanov");
        assertEquals(secondObj.getLastName(), "Antonov");
        assertEquals(firstObj.getPassportId(), 135792);
        assertEquals(secondObj.getPassportId(), 864209);
    }

    //Task 1.11


    Person firstObj = new Person();
    Person secondObj = new Person("Natalia", "Pavlova");
    Person omgObj = new Person(null, null, 123456);
    Person thirdObj = new Person(null, null, 123456, Gender.MALE);
    Person fourthObj = new Person(123456);
    Person femaleObj = new Person(Gender.FEMALE);

    @Test
    public void testFirstNameMethods() {
        firstObj.setFirstName("Anton");
        secondObj.setFirstName(null);
        thirdObj.setFirstName("Anna");
        femaleObj.setFirstName("Elizaveta");
        assertEquals(firstObj.getFirstName(), "Anton");
        assertNull(secondObj.getFirstName());
        assertNull(omgObj.getFirstName());
        assertEquals(thirdObj.getFirstName(), "Anna");
        assertNull(fourthObj.getFirstName());
        assertEquals(femaleObj.getFirstName(), "Elizaveta");
    }

    @Test
    public void testLastNameMethods() {
        thirdObj.setLastName("Frolova");
        fourthObj.setLastName(null);
        femaleObj.setLastName("Dolgova");
        assertNull(firstObj.getLastName());
        assertEquals(secondObj.getLastName(), "Pavlova");
        assertEquals(thirdObj.getLastName(), "Frolova");
        assertNull(fourthObj.getLastName());
        assertEquals(femaleObj.getLastName(), "Dolgova");
    }

    @Test
    public void testPassportIDMethods() {
        secondObj.setPassportId(742782);
        fourthObj.setPassportId(697583);
        assertEquals(firstObj.getPassportId(), 0);
        assertEquals(secondObj.getPassportId(), 742782);
        assertEquals(thirdObj.getPassportId(), 123456);
        assertEquals(fourthObj.getPassportId(), 697583);
    }

    @Test
    public void testSetGetGender() {
        firstObj.setGender(Gender.MALE);
        secondObj.setGender(Gender.FEMALE);
        thirdObj.setGender(Gender.FEMALE);
        assertEquals(firstObj.getGender(), Gender.MALE);
        assertEquals(secondObj.getGender(), Gender.FEMALE);
        assertNull(omgObj.getGender());
        assertEquals(thirdObj.getGender(), Gender.FEMALE);
        assertNull(fourthObj.getGender());
        assertEquals(femaleObj.getGender(), Gender.FEMALE);
    }
}