package com.stx.px.dao;

import com.stx.px.modle.UserModle;

import java.sql.*;
import java.util.ArrayList;

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
        return modle;
    }

    ArrayList list = new ArrayList();

    //遍历输出
    public ArrayList selecttall() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BEETLE", "system", "Xxq123456");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from px_stuinfo1");
            while (rs.next()) {
                UserModle modle = new UserModle();
                modle.setStuid(rs.getInt("stuid"));
                modle.setUsername(rs.getString("username"));
                modle.setPassword(rs.getString("password"));
                list.add(modle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //s删除用户
    public int del_user(int newid) {
        int i = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BEETLE", "system", "Xxq123456");
            Statement st = con.createStatement();
            i = st.executeUpdate("delete from  px_stuinfo1 where stuid=" + newid + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
    //修改
    public int update(String name ,String pwd,int id){
        int i=0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:BEETLE", "system", "Xxq123456");
            Statement st = con.createStatement();
            i=st.executeUpdate("update  px_stuinfo1 set username='"+name+"', password='"+pwd+"'where stuid="+id+"");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
