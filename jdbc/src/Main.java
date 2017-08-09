
import java.sql.Connection;

import dao.UsersDAO;
import dbentity.Users;
import util.DBHelper;

public class Main {
    public static void main(String args[])
    {
//        Date time = new Date();
//        System.out.println(time.getTime());
        try {
            Connection conn1 = DBHelper.getConnection();
            Connection conn2 = DBHelper.getConnection();

            System.out.println(conn1==conn2);

            Users s = new Users(4,"baron","456",21,"男","北京市朝阳区","2017-08-07 09:22:22");

            UsersDAO udao = new UsersDAO();
            if (udao.addStudent(s)){
                System.out.println("添加成功");
            }else
            {
                System.out.println("添加失败");
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}