package com.renchao.observer;

//接口, 让WeatherData 来实现 
public interface Subject {
	
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
