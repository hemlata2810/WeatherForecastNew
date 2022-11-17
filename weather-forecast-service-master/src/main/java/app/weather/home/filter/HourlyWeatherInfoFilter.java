package app.weather.home.filter;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class HourlyWeatherInfoFilter {
	private LocalDate date;
	
	private double longitude;
	
	private double altitude;
	
}
