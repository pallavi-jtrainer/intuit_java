package persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Tutorials;

public class TutorialTransactions {
	
	public static int insertNewTutorial(String name, LocalDate date, int duration ) {
		String sql = "INSERT INTO TUTORIALS (TUTORIALNAME, STARTDATE, DURATION)"
				+ " VALUES (?, ?, ?)";
		
		int res = 0;
		
		Connection connection = DbConnection.createConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			Date d = Date.valueOf(date);
			ps.setDate(2, d);
			ps.setInt(3, duration);
			
			res = ps.executeUpdate();
			
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return res;
	}
	
	public static List<Tutorials> listAllTutorials() {
		List<Tutorials> list = new ArrayList<Tutorials>();
		
		String sql = "SELECT * FROM TUTORIALS";
		
		Connection con = DbConnection.createConnection();
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Tutorials t = new Tutorials();
				t.setTutorialId(rs.getInt("TUTORIALID"));
				t.setTutorialName(rs.getString("TUTORIALNAME"));
				Date date = rs.getDate("STARTDATE");
				LocalDate d = date.toLocalDate();
				t.setStartDate(d);
				t.setDuration(rs.getInt("DURATION"));
				
				list.add(t);
			}
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
	
	public static Tutorials retrieveTutorialDetails(int id) {
		String sql = "SELECT * FROM TUTORIALS WHERE ID = ?";
		
		Tutorials tutorial = new Tutorials();
		
		Connection con = DbConnection.createConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				tutorial.setTutorialId(id);
				tutorial.setTutorialName(rs.getString("TUTORIALNAME"));
				
				Date d = rs.getDate("STARTDATE");
				LocalDate date = d.toLocalDate();
				
				tutorial.setStartDate(date);
				tutorial.setDuration(rs.getInt("DURATION"));
			}
			
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tutorial;
	}
}
