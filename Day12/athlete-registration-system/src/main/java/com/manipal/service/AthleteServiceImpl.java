package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manipal.dao.AthleteDaoImpl;
import com.manipal.dao.helper.AthleteResultSetExtractor;
import com.manipal.model.Athlete;

public class AthleteServiceImpl implements IAthleteService{
	@Autowired
	AthleteDaoImpl athleteDao;
	public static int id;
	
	public int addAthlete(Athlete athlete) {
		id = athleteDao.getId();
		if(id>1000)
			athlete.setId(++id);
		else
			athlete.setId(1001);
		athleteDao.addAthlete(athlete);
		return id;
	}
	
	public List<Athlete> getAllAthletes(){
		List<Athlete> athList = athleteDao.getAllAthletes();
		return athList;
	}
	
	public Athlete getAthlete(String id) {
		List<Athlete> athList = athleteDao.getAthlete(id);
		if (athList.size()>0)
			return athList.get(0);
		else 
			return null;
	}
	
	public String updateAthlete(Athlete athlete) {
		int status = athleteDao.updateAthlete(athlete);
		if (status != 0)
			return "Athlete with ID "+athlete.getId()+" successfully updated";
		else
			return "Athlete with ID "+athlete.getId()+" could not be updated";
	}
	
	public String deleteAthlete(Athlete athlete) {
		int status = athleteDao.deleteAthlete(athlete);
		if (status!=0) {
			return "Athlete deleted successfully";
		}
		else {
			return "Athlete ID could not be found";
		}
	}
	
	
}
