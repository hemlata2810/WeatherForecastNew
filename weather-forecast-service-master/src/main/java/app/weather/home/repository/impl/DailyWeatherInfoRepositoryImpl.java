package app.weather.home.repository.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import app.weather.home.entity.DailyWeatherInfo;
import app.weather.home.filter.DailyWeatherInfoFilter;
import app.weather.home.repository.DailyWeatherInfoRepository;

public class DailyWeatherInfoRepositoryImpl implements DailyWeatherInfoRepository {

	@Resource
	private EntityManager entityManager;

	@Override
	public DailyWeatherInfo findAllDailyWeatherInfo(String cityName) {
		String query = "SELECT * FROM DAILY_WEATHER_INFO d WHERE d.CITY =" + cityName;
		return entityManager.createNamedQuery(query, DailyWeatherInfo.class).getSingleResult();
	}

	@Override
	public List<DailyWeatherInfo> findPredictedDailyWeatherInfo(DailyWeatherInfoFilter dailyWeatherInfoFilter) {
		String query = "SELECT * FROM DAILY_WEATHER_INFO d WHERE d.CITY =" + dailyWeatherInfoFilter.getCityName()
				+ "GETDATE() < d.DATE";
		return entityManager.createNamedQuery(query, DailyWeatherInfo.class).getResultList();
	}

	@Override
	public <S extends DailyWeatherInfo> S save(S entity) {
		DailyWeatherInfo dailyWeatherInfo = entity;
		String qlString = "INSERT INTO DAILY_WEATHER_INFO VALUES (" + dailyWeatherInfo.getId() + ","
				+ dailyWeatherInfo.getCity() + "," + dailyWeatherInfo.getHumidity() + ","
				+ dailyWeatherInfo.getTemperature() + "," + dailyWeatherInfo.getWind() + ","
				+ dailyWeatherInfo.getDate() + "," + dailyWeatherInfo.getSunriseTime() + ","
				+ dailyWeatherInfo.getSunsetTime() + ")";
		int executeUpdate = entityManager.createQuery(qlString).executeUpdate();
		return null;
	}

	@Override
	public List<DailyWeatherInfo> findAll() {
		return findAll();
	}

	@Override
	public List<DailyWeatherInfo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DailyWeatherInfo> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DailyWeatherInfo> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends DailyWeatherInfo> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DailyWeatherInfo> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<DailyWeatherInfo> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public DailyWeatherInfo getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DailyWeatherInfo getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DailyWeatherInfo getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DailyWeatherInfo> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DailyWeatherInfo> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<DailyWeatherInfo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DailyWeatherInfo> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DailyWeatherInfo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends DailyWeatherInfo> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends DailyWeatherInfo> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends DailyWeatherInfo> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DailyWeatherInfo> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends DailyWeatherInfo> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends DailyWeatherInfo, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
