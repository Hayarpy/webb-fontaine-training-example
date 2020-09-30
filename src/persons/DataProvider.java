package persons;

public class DataProvider {
    public static Persons[] persons;

    static {
        persons = new Persons[10];

        Persons person1 = new Persons();
        person1.name = "John";
        person1.age = 24;
        person1.company = "Webbfontaine";
        persons[0] = person1;

        Persons person2 = new Persons();
        person2.name = "Anthony";
        person2.age = 23;
        person2.company = "Google";
        persons[1] = person2;

        Persons person3 = new Persons();
        person3.name = "Smith";
        person3.age = 35;
        person3.company = "Yandex";
        persons[2] = person3;

        Persons person4 = new Persons();
        person4.name = "Kate";
        person4.age = 19;
        person4.company = "Apple";
        persons[3] = person4;

        Persons person5 = new Persons();
        person5.name = "Ann";
        person5.age = 39;
        person5.company = "Kiwi";
        persons[4] = person5;

        Persons person6 = new Persons();
        person6.name = "Adrian";
        person6.age = 39;
        person6.company = "Sony";
        persons[5] = person6;

        Persons person7 = new Persons();
        person7.name = "Sarah";
        person7.age = 28;
        person7.company = "Renderforest";
        persons[6] = person7;

        Persons person8 = new Persons();
        person8.name = "Samantha";
        person8.age = 20;
        person8.company = "Dataowl";
        persons[7] = person8;

        Persons person9 = new Persons();
        person9.name = "Andres";
        person9.age = 55;
        person9.company = "Softconstruct";
        persons[8] = person9;

        Persons person10 = new Persons();
        person10.name = "Holly";
        person10.age = 41;
        person10.company = "Facebook";
        persons[9] = person10;
    }

    static String getPersonsBy(String company) {

        String name = null;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].company.equals(company)) {
                name = persons[i].name;
            }
        }
        return name;
    }

    static String getOldestPerson() {
        int oldest = persons[0].age;
        String oldestPerson = null;
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].age > oldest) {
                oldest = persons[i].age;
                oldestPerson = persons[i].name;
            }
        }
        return oldestPerson;
    }

    static String getYoungestPerson() {
        int youngest = persons[0].age;
        String youngestPerson = null;
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].age < youngest) {
                youngest = persons[i].age;
                youngestPerson = persons[i].name;
            }
        }
        return youngestPerson;
    }

    static int getMostRepeatedAge() {
        int temp = 0, element = 0, count = 1, mostCount = 1;

        for (int i = 0; i < persons.length; i++) {
            for (int j = 1; j < (persons.length - i); j++) {
                if (persons[j - 1].age > persons[j].age) {
                    temp = persons[j - 1].age;
                    persons[j - 1].age = persons[j].age;
                    persons[j].age = temp;
                }
            }
            for (int k = 1; k < persons.length; k++) {
                if (persons[k].age == persons[k - 1].age)
                    count++;
                else {
                    if (count > mostCount) {
                        mostCount = count;
                        element = persons[k - 1].age;
                    }
                    count = 1;
                }
            }
        }
        return element;
    }
}
