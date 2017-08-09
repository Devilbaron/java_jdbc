
import java.sql.Connection;

import dao.StudentDAO;
import dbentity.Students;
import util.DBHelper;
import java.util.Date;

public class Main {
    public static void main(String args[])
    {
//        Date time = new Date();
//        System.out.println(time.getTime());
        try {
            Connection conn1 = DBHelper.getConnection();
            Connection conn2 = DBHelper.getConnection();

            System.out.println(conn1==conn2);

            Students s = new Students(3,"devil","123",22,"男","北京市海淀区","2017-08-09 10:22:22");

            StudentDAO udao = new StudentDAO();
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