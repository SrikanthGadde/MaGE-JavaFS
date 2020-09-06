package com.manipal.dao;

import java.util.List;

import com.manipal.dao.helper.AthleteResultSetExtractor;
import com.manipal.dao.helper.IdResultSetExtractor;
import com.manipal.model.Athlete;

public interface IAthleteDao {
	public int getId();
	public int addAthlete(Athlete athlete);
	public List<Athlete> getAllAthletes();
	public List<Athlete> getAthlete(String id);
	public int updateAthlete(Athlete athlete);
	public int deleteAthlete(Athlete athlete);
}
