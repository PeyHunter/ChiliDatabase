package DAO;


import Manager.ChiliManager;
import Manager.DishManager;
import Manager.EatingRecordManager;
import Manager.PersonManager;

import java.util.Scanner;


public class MainManager
{
//    private ChiliDAO chiliDAO;
//    private DishDAO dishDAO;
//    private HeatScale heatScale;
//    private EatingRecordDAO eatingRecordDAO;

    private PersonManager personMenu;
    private DishManager dishMenu;
    private ChiliManager chiliMenu;
    private EatingRecordManager eatingRecordMenu;
    private Scanner scanner;

    public MainManager()
    {
       this.scanner = new Scanner(System.in);
       this.personMenu = new PersonManager(scanner);
//       this.chiliMenu = new ChiliMenu(scanner);
//       this.dishMenu = new DishMenu(scanner);
//       eatingRecordMenu = new EatingRecordMenu(scanner);
    }

    public void start()
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
                case 1 -> personMenu.run();
//                case 2 -> chiliMenu.run();
//                case 3 -> dishMenu.run();
//                case 4 -> eatingRecordMenu.run();
                case 5 -> {
                    System.out.println("Exiting");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }

        }
    }




}
