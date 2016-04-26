package COM.DIM;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by us9522 on 25.04.2016.
 */
public class dataDB  {

    private static final int TEAMS_COUNT = 6;
    private static Connection con = null;
    private static String username = "sa";
    private static String password = "Gjdybq<h'l?55";
    private static String URL = "jdbc:jtds:sqlserver://10.93.104.55:1433/bool";


    public static Team writeData() throws SQLException {
        DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());
        //Загружаем драйвер
        con = DriverManager.getConnection(URL, username, password);
        //соединяемся
        if(con!=null) System.out.println("Connection Successful !\n");
        if (con==null) System.exit(0);
        Statement st = con.createStatement();
        //Statement позволяет отправлять запросы базе данных
        ResultSet rs = st.executeQuery("select id, [name], tur, points," +
                "matches, wins, draw, lose, goals, goalsplus, goalsminus" +
                " from [bool].[dbo].[teams]");
        //ResultSet получает результирующую таблицу
        int length = rs.getMetaData().getColumnCount();
        //Resultset.getMetaData() получаем информацию
        //результирующей таблице

        List<Integer> teams = new ArrayList<Integer>();

        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();


        Team teamTemp[] = new Team[TEAMS_COUNT];

        while(rs.next()){
            for(int i = 1; i <= length; i++){
                System.out.print(rs.getString(i) + "\t");
                //teamTemp[i] = rs.getString(i);
            }
            System.out.println();

            for (int i = 0; i < TEAMS_COUNT; i++) {
                teamTemp[i] = new Team(rs.getInt("id"), rs.getString("name"), rs.getInt("id"),
                        rs.getInt("id"), rs.getInt("id"), rs.getInt("id"), rs.getInt("id"), rs.getInt("id"),
                        rs.getInt("id"), rs.getInt("id"), rs.getInt("id"));
                System.out.print(teamTemp[i].toString() + "\t" + "WHY???");
            }
        }

        System.out.println();
        if(rs!=null)rs.close();
        if(st!=null)st.close();
        if(con!=null)con.close();

        return null;

    }
}


