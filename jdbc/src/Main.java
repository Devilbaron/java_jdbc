import dao.UsersDAO;
import dbentity.Users;
import util.SQLTime;

public class Main {
    public static void main(String args[])
    {
        try {

            Users s = new Users(5,"小智","451236",23,"男","北京市大兴区",new SQLTime().SQLDateTime());

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