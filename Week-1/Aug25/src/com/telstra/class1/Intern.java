package com.telstra.class1;

public class Intern extends Employee{
		private String skillSet;
		private int noOfProjects;
		private int duration;
		
		public Intern(int empId, String empName, int bSal, int grade, String skillSet, int noOfProjects, int duration) {
			super(empId, empName, bSal, grade);
			this.skillSet = skillSet;
			this.noOfProjects = noOfProjects;
			this.duration = duration;
		}

		@Override
		public String getDetails() {
			return (super.getDetails()+" "+skillSet+" "+noOfProjects+" "+duration);
		}

		public int getDuration() {
			return duration;
		}
	/*
		@Override
		protected double calcSal() {
			// TODO Auto-generated method stub
			return 0;
		}
		*/

		@Override
		protected double calcSal() {
			// TODO Auto-generated method stub
			double skillHike = 0;
			if (skillSet=="ML") {
				skillHike = 15000;
			}
			else if (skillSet=="IoT") {
				skillHike = 10000;
			}
			else if (skillSet=="Full Stack") {
				skillHike = 7500;
			}
			
			return (bSal*(1+(grade*0.1)+(noOfProjects*0.05))+skillHike);
		}

		
}
