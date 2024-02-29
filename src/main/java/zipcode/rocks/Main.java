package main.java.zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    /*private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<Person>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }*/

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person newPerson = new Person(
                "Abukar",
                "Abukar",
                "yellow",
                "April",
                "abukarabukar",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Adams",
                "Chaz",
                "blue",
                "February",
                "chaz_adams",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Ahmadli",
                "Asan",
                "dark blue",
                "December",
                "asanahamdli",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Azer",
                "Jenn",
                "purple",
                "November",
                "cupofjavajenny",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Bangash",
                "Ali",
                "green",
                "March",
                "ali-b14,",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Brennan",
                "Jake",
                "purple",
                "April",
                "jake-brennan714,",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Bruton",
                "Trey",
                "orange",
                "September",
                "tb0902_,",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Burton",
                "Asia",
                "pink",
                "March",
                "asiaburton,",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Cao",
                "Danny",
                "blue",
                "September",
                "dannycao1997,",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Eckel",
                "Nathan",
                "green",
                "February",
                "nathaneckle,",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Ekoloko",
                "Jorris",
                "black",
                "August",
                "reeseyverse,",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Gonzalez Plaza",
                "Alice",
                "dark",
                "May",
                "AliceGonzalez",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Kakade",
                "Deepa",
                "pink",
                "June",
                "NEEDGITHUB",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Katzarova",
                "Mariyana",
                "green",
                "December",
                "mariyana-katz",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Konstanski",
                "Lydia",
                "mushroom",
                "October",
                "LydiaStoneKonstanski",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Kramer",
                "Matt",
                "green",
                "January",
                "NEEDGITHUB",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Mathew",
                "Angelina",
                "dark blue",
                "May",
                "angelinamathew",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "McCall",
                "Chris",
                "blue",
                "May",
                "christopher_mccall",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "McNamara",
                "Nick",
                "green",
                "January",
                "nicholasmacnamara",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Modi",
                "Shaily",
                "purple",
                "January",
                "ShailyGH",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Moffett-Conaway",
                "Dan",
                "blue",
                "June",
                "moffd234",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Palanikumar",
                "Lavanya",
                "blue",
                "October",
                "lavanyapalanikumar93",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Pearson",
                "Anthony",
                "red",
                "July",
                "anthonyp365",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Rieger",
                "Ethan",
                "blue",
                "May",
                "erieger11",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Ross",
                "Jorden",
                "green",
                "December",
                "jross911",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Scott",
                "Michael",
                "orange",
                "May",
                "michaelscott44",
                true);
        students.add(newPerson);

        newPerson = new Person(
                "Sharma",
                "Diksha",
                "blue",
                "March",
                "dikshasharmaa",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Zeng",
                "Shijin",
                "yellow",
                "July",
                "szeng89",
                false);
        students.add(newPerson);

        newPerson = new Person(
                "Zheng",
                "Andy",
                "red",
                "December",
                "andyzheng679",
                false);
        students.add(newPerson);
        // and so on for EACH person in the cohort.

        return students;
    }

    /*private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1]);
        return newPerson;
    }*/

}
