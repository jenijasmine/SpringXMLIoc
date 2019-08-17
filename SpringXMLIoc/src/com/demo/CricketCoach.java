package com.demo;

public class CricketCoach implements Coach {
	
	private WeatherService weatherService;
	private FortuneService fortuneService;
	private int gamesPlayed;
	
	
	public CricketCoach() {
		super();
		System.out.println("cricketcoach default constructor...");
	} 
	
	
	void init() {
		System.out.println("started....");
	}
	public CricketCoach(WeatherService weatherService) {
		super();
		
		this.weatherService = weatherService;
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("fortune service setter...");
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
   public int gamesPlayed() {
	   return this.gamesPlayed;
   }
	
  public void destroy(){
	  System.out.println("destroyed....");
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
	

}
