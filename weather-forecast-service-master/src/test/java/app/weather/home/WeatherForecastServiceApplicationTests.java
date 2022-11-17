package app.weather.home;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import app.weather.home.api.DailyWeatherInfoService;
import app.weather.home.entity.DailyWeatherInfo;
import app.weather.home.filter.DailyWeatherInfoFilter;

@SpringBootTest
class WeatherForecastServiceApplicationTests {

	@Resource
	private DailyWeatherInfoService dailyWeatherInfoService;

	@Test
	void contextLoads() {
		DailyWeatherInfo findAllDailyWeatherInfo = dailyWeatherInfoService
				.findAllDailyWeatherInfo(DailyWeatherInfoFilter.builder().longitude(53.551086).build());

	}

	@Test
	void saveData() {
		dailyWeatherInfoService.save(DailyWeatherInfo.builder().id(1l).city("Dusseldorf").date(LocalDate.now()).temperature(12).wind("12km/hr")
				.humidity(20).sunriseTime(LocalTime.of(6, 0)).sunsetTime(LocalTime.of(18, 0)).build());
	}

}
