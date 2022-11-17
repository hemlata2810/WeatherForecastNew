package app.weather.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.weather.home.entity.LocationInfo;
import app.weather.home.filter.DailyWeatherInfoFilter;

@Repository
public interface LocationInfoRepository extends JpaRepository<LocationInfo, Long> {

	LocationInfo findCityByLatitude(Double latitude);

	LocationInfo findCityByLongitudeAndLatitude(DailyWeatherInfoFilter dailyWeatherInfoFilter);
}
