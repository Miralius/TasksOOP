package ru.ssau.tk.narmores.tasksoop.exam;

import java.util.Objects;

public class StudentPOJO {
    private String name;
    private int studentsRecordBookNumber;
    private int yearOfBirth;
    private String cityOfBirth;

    public StudentPOJO(String name, int studentsRecordBookNumber, int yearOfBirth, String cityOfBirth) {
        this.name = name;
        this.studentsRecordBookNumber = studentsRecordBookNumber;
        this.yearOfBirth = yearOfBirth;
        this.cityOfBirth = cityOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentPOJO that = (StudentPOJO) o;
        return studentsRecordBookNumber == that.studentsRecordBookNumber &&
                yearOfBirth == that.yearOfBirth &&
                name.equals(that.name) &&
                cityOfBirth.equals(that.cityOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentsRecordBookNumber, yearOfBirth, cityOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsRecordBookNumber() {
        return studentsRecordBookNumber;
    }

    public void setStudentsRecordBookNumber(int studentsRecordBookNumber) {
        this.studentsRecordBookNumber = studentsRecordBookNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }
}
