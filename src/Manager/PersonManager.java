package Manager;

import Models.Person;
import DAO.PersonDAO;

import java.util.List;
import java.util.Scanner;

public class PersonManager
{
    private PersonDAO personDAO;
    private Scanner scanner;

    public PersonManager(Scanner scanner)
    {
        this.personDAO = new PersonDAO();
        this.scanner = scanner;
    }

    public void run()
    {
        while (true)
        {
            System.out.println("\n=== Manage Persons ===");
            System.out.println("1. Add Person");
            System.out.println("2. Update Person");
            System.out.println("3. Delete Person");
            System.out.println("4. View All Persons");
            System.out.println("5. Find Person by ID");
            System.out.println("6. Go Back");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 -> addPerson();
                case 2 -> updatePerson();
                case 3 -> deletePerson();
                case 4 -> listPersons();
                case 5 -> findPersonById();
                case 6 ->
                {
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
    private void addPerson()
    {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter scale ID: ");
        int scaleId = scanner.nextInt();
        scanner.nextLine();

        personDAO.insert(new Person(name, age, scaleId));
        System.out.println("Person added succesfully");
    }

    private void updatePerson()
    {
        System.out.print("Enter Person ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        System.out.print("Enter new scale ID: ");
        int scaleId = scanner.nextInt();
        scanner.nextLine();

        personDAO.update(new Person(id, name, age, scaleId));
        System.out.println("Person updated successfully.");
    }
    private void deletePerson() {
        System.out.print("Enter Person ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        personDAO.delete(id);
        System.out.println("Person deleted successfully.");
    }

    private void listPersons() {
        List<Person> persons = personDAO.findAll();
        persons.forEach(System.out::println);
    }

    private void findPersonById() {
        System.out.print("Enter Person ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Person person = personDAO.findById(id);
        System.out.println(person != null ? person : "Person not found.");
    }

}
