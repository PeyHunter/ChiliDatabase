import Connection.DatabaseConnection;
import DAO.ChiliDAO;
import DAO.MainManager;
import DAO.PersonDAO;
import Models.Chili;
import Models.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        //CONNECTION TO DATABASE
        DatabaseConnection.getInstance().getConnection();


        MainManager menu = new MainManager();
        menu.start();
    }

}