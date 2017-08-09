package dao;

import dbentity.Students;
import util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by Admin on 2017/8/9.
 */
//业务逻辑类
public class StudentDAO {

    //添加用户信息
    public boolean addStudent(Students u){
        String sql = "insert into students values (?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DBHelper.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,u.getSage());
            stmt.setString(2,u.getSname());
            stmt.setString(3,u.getNamekey());
            stmt.setInt(4,u.getSage());
            stmt.setString(5,u.getSgender());
            stmt.setString(6,u.getSress());
            stmt.setString(7,u.getScreatetime());

            int result = stmt.executeUpdate();
            if (result > 0)
            {
                return true;
            }else
            {
                return false;
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }finally {
            try {
                stmt.close();
                conn.close();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
