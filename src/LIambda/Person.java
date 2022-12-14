package LIambda;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public enum Sex {
        MALE, FEMALE

    }

    public Person(String nameArg, LocalDate birthdayArg,
                  Sex genderArg, String emailArg) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        emailAddress = emailArg;
    }
    /*
     *
     */
    public int getAge() {
        return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }
    /*
     *
     */
    public void printPerson() {
        System.out.println(name + ", " + this.getAge());
    }
    /*
     *
     */
    public Sex getGender() {
        return gender;
    }
    /*
     *
     */
    public String getName() {
        return name;
    }
    /*
     *
     */
    public String getEmailAddress() {
        return emailAddress;
    }
    /*
    *
     */
    public LocalDate getBirthday() {
        return birthday;
    }
    /*
    *
     */
    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }
    /*
    *
     */
    public static List<Person> createRoster() {
        List<Person> roster = new ArrayList<>();
        roster.add(
                new Person(
                        "Fred",
                        IsoChronology.INSTANCE.date(1980, 6, 20),
                        Person.Sex.MALE,
                        "fred@example.com"));
        roster.add(
                new Person(
                        "Jane",
                        IsoChronology.INSTANCE.date(1990, 7, 15),
                        Person.Sex.FEMALE, "jane@example.com"));
        roster.add(
                new Person(
                        "George",
                        IsoChronology.INSTANCE.date(1991, 8, 13),
                        Person.Sex.MALE, "george@example.com"));
        roster.add(
                new Person(
                        "Bob",
                        IsoChronology.INSTANCE.date(2000, 9, 12),
                        Person.Sex.MALE, "bob@example.com"));

        return roster;
    }
    /*
    *
     */
    public static void printPersons(List<Person> roster) {

        CheckPerson checkPerson1 = person -> person.getGender() == Sex.MALE //liambda virazzenie
                && person.getAge() >= 18
                && person.getAge() <= 25;
        for (Person p : roster) {
            if (checkPerson1.test(p)) {
                p.printPerson();
            }
        }
    }
}
