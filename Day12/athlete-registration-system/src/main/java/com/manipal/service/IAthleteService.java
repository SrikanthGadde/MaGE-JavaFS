package com.manipal.service;

import java.util.List;

import com.manipal.model.Athlete;

public interface IAthleteService {
	public int addAthlete(Athlete athlete);
	public List<Athlete> getAllAthletes();
	public Athlete getAthlete(String id);
	public String updateAthlete(Athlete athlete);
	public String deleteAthlete(Athlete athlete);
}
