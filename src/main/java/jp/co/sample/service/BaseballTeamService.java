package jp.co.sample.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sample.domain.BaseballTeam;
import jp.co.sample.repository.BaseballRepository;
import jp.co.sample.repository.HotelRepository;

/**
 * @author yuya.nishikiori
 *
 */
@Service
public class BaseballTeamService {
	
	@Autowired
	private BaseballRepository repository;
	
	/**
	 * チームすべての情報を取得
	 * 
	 * @return　チームすべての情報をリターン
	 */
	public List<BaseballTeam> findAll() {
		return repository.findAll();
	}
	
	/**
	 * クリックされた１件の情報を取ってくる
	 * 
	 * @param id
	 * @return　１件の情報をリターン
	 */
	public BaseballTeam load(Integer id) {
		return repository.load(id);
	}

	
	
}
