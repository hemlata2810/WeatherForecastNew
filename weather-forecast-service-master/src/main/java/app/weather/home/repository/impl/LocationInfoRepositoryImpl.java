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

import app.weather.home.entity.LocationInfo;
import app.weather.home.filter.DailyWeatherInfoFilter;
import app.weather.home.repository.DailyWeatherInfoRepository;
import app.weather.home.repository.LocationInfoRepository;

public class LocationInfoRepositoryImpl implements LocationInfoRepository {

	@Resource
	private EntityManager entityManager;

	@Override
	public LocationInfo findCityByLatitude(Double latitude) {
		String query = "SELECT l.CITY FROM LOCATION_INFO l WHERE l.LATITUDE =" + latitude;
		return entityManager.createNamedQuery(query, LocationInfo.class).getSingleResult();
	}

	@Override
	public LocationInfo findCityByLongitudeAndLatitude(DailyWeatherInfoFilter dailyWeatherInfoFilter) {
		String query = "SELECT l.CITY FROM LOCATION_INFO l WHERE l.LATITUDE =" + dailyWeatherInfoFilter.getLatitude()
				+ " && l.LONGITUDE= " + dailyWeatherInfoFilter.getLongitude();
		return entityManager.createNamedQuery(query, LocationInfo.class).getSingleResult();
	}

	@Override
	public List<LocationInfo> findAll() {
		return null;
	}

	@Override
	public List<LocationInfo> findAll(Sort sort) {
		return null;
	}

	@Override
	public List<LocationInfo> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public <S extends LocationInfo> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public void flush() {
	}

	@Override
	public <S extends LocationInfo> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public <S extends LocationInfo> List<S> saveAllAndFlush(Iterable<S> entities) {
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<LocationInfo> entities) {
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
	}

	@Override
	public void deleteAllInBatch() {
	}

	@Override
	public LocationInfo getOne(Long id) {
		return null;
	}

	@Override
	public LocationInfo getById(Long id) {
		return null;
	}

	@Override
	public LocationInfo getReferenceById(Long id) {
		return null;
	}

	@Override
	public <S extends LocationInfo> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends LocationInfo> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<LocationInfo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends LocationInfo> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<LocationInfo> findById(Long id) {
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
	public void delete(LocationInfo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends LocationInfo> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends LocationInfo> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends LocationInfo> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends LocationInfo> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends LocationInfo> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends LocationInfo, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
