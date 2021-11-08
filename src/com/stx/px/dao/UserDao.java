package com.stx.px.dao;

import com.stx.px.modle.UserModle;

import java.sql.*;

public class UserDao {
    public int inu(String name, String pwd) {
        int i = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");         //加载驱动
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BEETLE", "system", "Xxq123456");
            Statement st = con.createStatement();
            i = st.executeUpdate("insert into px_stuinfo1(stuid,username,password)values(2002,'" + name + "','" + pwd + "')");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    //用户登录
    public UserModle login(String name, String pwd) {
        UserModle modle = new UserModle();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");         //加载驱动
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BEETLE", "system", "Xxq123456");
            Statement st = con.createStatement();
            String sql = "select *from  px_stuinfo1 where username='" + name + "'and password='" + pwd + "' ";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                modle.setStuid(rs.getInt("stuid"));
                modle.setUsername(rs.getString("username"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return  modle;
    }
}
