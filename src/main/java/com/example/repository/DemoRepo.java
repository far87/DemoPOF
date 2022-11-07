package com.example.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DemoRepo {
    Connection con=null;

    public List<String> getNomi() {
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DemoPOF", "postgres", "password");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM pof1.\"Persona\"");
            List<String> nomi=new ArrayList<>();
            while (rs.next()) {
                nomi.add(rs.getString(2));
            }
            rs.close();
            stm.close();
            return nomi;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
