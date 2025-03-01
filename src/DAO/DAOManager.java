package DAO;

import DAO.PersonDAO;
import DAO.ChiliDAO;
import DAO.DishDAO;
import DAO.EatingRecordDAO;

import Models.Chili;
import Models.Person;
import Models.Dish;
import Models.HeatScale;
import Models.EatingRecord;

import java.util.Scanner;


public class DAOManager
{
    private ChiliDAO chiliDAO;
    private PersonDAO personDAO;
    private DishDAO dishDAO;
    private HeatScale heatScale;
    private EatingRecordDAO eatingRecordDAO;
    private Scanner scanner;

    public DAOManager()
    {
        chiliDAO = new ChiliDAO();
        personDAO = new PersonDAO();
        dishDAO = new DishDAO();
        heatScale = new HeatScale();
        eatingRecordDAO = new EatingRecordDAO();
    }

    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        while (running)
        {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Manage Persons");
            System.out.println("2. Manage Chilies");
            System.out.println("3. Manage Dishes");
            System.out.println("4. Manage Eating Records");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int entityChoice = scanner.nextInt();
            scanner.nextLine();

            switch (entityChoice)
            {
                case 1 -> managePersons();
            }

        }
    }

    private void managePersons()
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
        }
    }


}
