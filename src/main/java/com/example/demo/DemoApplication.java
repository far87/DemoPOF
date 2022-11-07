package com.example.demo;

import com.example.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

@SpringBootApplication
//@RequestMapping("api")
public class DemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



/*	@GetMapping(value = "/nomi", produces = "application/json")
	public ResponseEntity<?> getNomi(){

		return new ResponseEntity<>("ciao", HttpStatus.OK);
	}*/

	/*@GetMapping("/insnome")
	public void ins(){
		Connection con=null;

		try{
			con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/DemoPOF", "postgres","password");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("SELECT * FROM pof1.\"Persona\"");
			while(rs.next()){
				System.out.println(rs.getString(2));}

			rs.close();
			stm.close();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}*/

}
