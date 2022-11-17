package app.weather.home.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;

import app.weather.home.entity.DailyWeatherInfo;
import app.weather.home.filter.DailyWeatherInfoFilter;

@Path("dailyWeatherInfoService")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface DailyWeatherInfoService {

	@GET
	@Path("/findAllDailyWeatherInfo")
	@RequestMapping("/findAllDailyWeatherInfo")
	DailyWeatherInfo findAllDailyWeatherInfo(DailyWeatherInfoFilter dailyWeatherInfoFilter);

	@GET
	@Path("/findAllDailyWeatherInfoByLongitude")
	@RequestMapping("/findAllDailyWeatherInfoByLongitude")
	DailyWeatherInfo findAllDailyWeatherInfoByLongitude(@PathParam(value = "LONGITUDE") Double longitude);

	@GET
	@Path("/findAllDailyWeatherInfoByLatitude")
	@RequestMapping("/findAllDailyWeatherInfoByLatitude")
	DailyWeatherInfo findAllDailyWeatherInfoByLatitude(@PathParam(value = "LATITUDE") Double latitude);
	
	@GET
	@Path("/findPredictedDailyWeatherInfo")
	@RequestMapping("/findPredictedDailyWeatherInfo")
	List<DailyWeatherInfo> findPredictedDailyWeatherInfo(DailyWeatherInfoFilter dailyWeatherInfoFilter);

	@POST
	@Path("/save")
	void save(DailyWeatherInfo build);
}
