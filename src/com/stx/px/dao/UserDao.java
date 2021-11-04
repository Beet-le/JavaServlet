package com.stx.px.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
    public int inu(String name,String pwd){
        int i=0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");         //加载驱动
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BEETLE", "system","Xxq123456");
            Statement st = con.createStatement();
            i =st.executeUpdate("insert into px_stuinfo1(stuid,username,password)values(2002,'"+name+"','"+pwd+"')");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
