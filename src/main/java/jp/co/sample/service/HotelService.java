package jp.co.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sample.domain.Hotel;
import jp.co.sample.repository.HotelRepository;

/**
 * リポジトリのfindPriceを呼び出す
 * 
 * @author yuya.nishikiori
 *
 */
@Service
public class HotelService {

	
	@Autowired
	private HotelRepository repository;
	
	public List<Hotel> findPrice(Integer priceNum) {
		return repository.findPrice(priceNum);
	}
	
}
