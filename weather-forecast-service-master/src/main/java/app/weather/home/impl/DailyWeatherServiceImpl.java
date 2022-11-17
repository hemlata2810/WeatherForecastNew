package app.weather.home.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import app.weather.home.api.DailyWeatherInfoService;
import app.weather.home.entity.DailyWeatherInfo;
import app.weather.home.entity.LocationInfo;
import app.weather.home.filter.DailyWeatherInfoFilter;
import app.weather.home.repository.DailyWeatherInfoRepository;
import app.weather.home.repository.LocationInfoRepository;

@Service
@Transactional
@RestController
public class DailyWeatherServiceImpl implements DailyWeatherInfoService{

	@Resource
	private DailyWeatherInfoRepository dailyWeatherInfoRepository;
	
	@Resource
	private LocationInfoRepository locationInfoRepository;
	
	@Override
	public DailyWeatherInfo findAllDailyWeatherInfo(DailyWeatherInfoFilter dailyWeatherInfoFilter) {
		LocationInfo findCityByLatitude=null;
		if(dailyWeatherInfoFilter.getDate()!=null) {
			if(dailyWeatherInfoFilter.getLatitude()!=0 && dailyWeatherInfoFilter.getLongitude()!=0) {
				locationInfoRepository.findCityByLongitudeAndLatitude(dailyWeatherInfoFilter);
			}
		}
		findCityByLatitude = locationInfoRepository.findCityByLatitude(dailyWeatherInfoFilter.getLongitude());
		
		DailyWeatherInfo dailyWeatherInfo = dailyWeatherInfoRepository.findAllDailyWeatherInfo(findCityByLatitude.getCity());
		return dailyWeatherInfo;
	}

	@Override
	public DailyWeatherInfo findAllDailyWeatherInfoByLongitude(Double longitude) {
		
		return null;
	}

	@Override
	public DailyWeatherInfo findAllDailyWeatherInfoByLatitude(Double latitude) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DailyWeatherInfo> findPredictedDailyWeatherInfo(DailyWeatherInfoFilter dailyWeatherInfoFilter) {
		LocationInfo findCityByLatitude=null;
		if(dailyWeatherInfoFilter.getDate()!=null) {
			if(dailyWeatherInfoFilter.getLatitude()!=0 && dailyWeatherInfoFilter.getLongitude()!=0) {
				locationInfoRepository.findCityByLongitudeAndLatitude(dailyWeatherInfoFilter);
			}
		}
		findCityByLatitude = locationInfoRepository.findCityByLatitude(dailyWeatherInfoFilter.getLongitude());
		dailyWeatherInfoFilter.setCityName(findCityByLatitude.getCity());
		List<DailyWeatherInfo> dailyWeatherInfo = dailyWeatherInfoRepository.findPredictedDailyWeatherInfo(dailyWeatherInfoFilter);
		return dailyWeatherInfo;
	}

	@Override
	public void save(DailyWeatherInfo build) {
		dailyWeatherInfoRepository.save(build);
	}

}
