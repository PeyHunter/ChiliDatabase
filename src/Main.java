import Connection.DatabaseConnection;
import DAO.ChiliDAO;
import Models.Chili;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {



        DatabaseConnection.getInstance().getConnection();

        ChiliDAO chiliDAO = new ChiliDAO();

        Chili chili1 = new Chili("tester", 000000, 1 , 10, "Whatever");

        //chiliDAO.insert(chili1);


        chiliDAO.findAll();


    }

}