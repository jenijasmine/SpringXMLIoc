package com.demo;

public class AtheleticCoach implements Coach {

  WeatherService weatherService;
  private FortuneService fortuneService;
  private int gamesPlayed;
  
  

public AtheleticCoach() {
	  super();
  }
	
	public AtheleticCoach(WeatherService weatherService) {
		super();
		this.weatherService = weatherService;
	}
  
   public void setFortuneService(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
   }
   public int gamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	
	@Override
	public String giveMyWorkout() {
		// TODO Auto-generated method stub
		return "Run a 500km lap";
	}
	
	 public String howsTheWeather() {
	    	return this.weatherService.getWeather();
	    }

	@Override
	public String whatsMyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.tellMyFortune();
	}
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}

}
