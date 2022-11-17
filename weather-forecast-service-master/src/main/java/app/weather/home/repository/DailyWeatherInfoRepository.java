package app.weather.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.weather.home.entity.DailyWeatherInfo;
import app.weather.home.filter.DailyWeatherInfoFilter;

@Repository
public interface DailyWeatherInfoRepository extends JpaRepository<DailyWeatherInfo, Long> {
	
	DailyWeatherInfo findAllDailyWeatherInfo(String cityName);
	
	List<DailyWeatherInfo> findPredictedDailyWeatherInfo(DailyWeatherInfoFilter dailyWeatherInfoFilter);

}
