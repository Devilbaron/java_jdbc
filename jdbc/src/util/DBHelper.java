package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Admin on 2017/8/9.
 */

// 工具层 体现单例模式思想
public class DBHelper {
    private static Connection conn;//数据库连接对象
    //驱动
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //数据库地址
    private static final String URL = "jdbc:mysql://localhost:3306/users";
    //用户名密码
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    //静态代码块加载驱动

    static {
        try {
            Class.forName(DRIVER);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    //单例模式应让构造方法私有化

    private DBHelper(){

    }

    public static Connection getConnection() throws Exception
    {
        if (conn ==null){
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }
        return conn;
    }

}
