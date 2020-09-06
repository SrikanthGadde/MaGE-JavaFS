package com.manipal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.manipal.dao.helper.AthleteResultSetExtractor;
import com.manipal.dao.helper.IdResultSetExtractor;
import com.manipal.model.Athlete;

public class AthleteDaoImpl implements IAthleteDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addAthlete(Athlete athlete) {
		String query = "INSERT INTO ATHLETE VALUES(?,?,?,?,?,?)";
		int status = jdbcTemplate.update(query, athlete.getId(), athlete.getName(), athlete.getGender(), athlete.getCategory(), athlete.getEmail(), athlete.getMobile());
		return status;
	}
	
	public List<Athlete> getAllAthletes(){
		String sql = "SELECT * FROM ATHLETE";
		List<Athlete> userList = jdbcTemplate.query(sql, new AthleteResultSetExtractor());
		return userList;
	}
	
	public int getId() {
		String sql="SELECT max(athlete_id) FROM athlete";
		int id = jdbcTemplate.query(sql, new IdResultSetExtractor());
		return id;
	}
	
	public List<Athlete> getAthlete(String id) {
		String sql=("SELECT * FROM athlete WHERE athlete_"+id);
		List<Athlete> userList = jdbcTemplate.query(sql, new AthleteResultSetExtractor());
		return userList;
	}
	
	public int updateAthlete(Athlete athlete) {
		String sql="UPDATE ATHLETE SET athlete_name=?, athlete_gender=?, category=?, athlete_email=?, athlete_mobile=? WHERE athlete_id=?";
		int status = jdbcTemplate.update(sql, athlete.getName(), athlete.getGender(), athlete.getCategory(), athlete.getEmail(), athlete.getMobile(),athlete.getId());
		return status;
	}
	
	public int deleteAthlete(Athlete athlete) {
		String sql = "DELETE FROM ATHLETE WHERE athlete_id=?";
		int status = jdbcTemplate.update(sql, athlete.getId());
		return status;
	}
	
}