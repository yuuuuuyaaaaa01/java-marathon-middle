package jp.co.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sample.domain.Shop;
import jp.co.sample.repository.ShopRepository;

/**
 * 検索を実施する repository の Searchメソッドを呼ぶ.
 * 
 * @author yuya.nishikiori
 *
 */
@Service
public class ShopService {
	@Autowired
	private ShopRepository repository;
	
	public List<Shop> findAll() {
		return repository.findAll();
	}
	public List<Shop> Search(Integer gender,String color) {
		return repository.Search(gender, color);
	}
	
}
