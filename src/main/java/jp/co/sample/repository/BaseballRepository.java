package jp.co.sample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sample.domain.BaseballTeam;

/**
 * @author yuya.nishikiori
 *
 */
@Repository
public class BaseballRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<BaseballTeam> BaseballTeam_ROW_MAPPER=(rs,i)->{
		
		BaseballTeam baseballteam = new BaseballTeam();
		baseballteam.setId(rs.getInt("id"));
		baseballteam.setLeagueName(rs.getString("league_name"));
		baseballteam.setTeamName(rs.getString("team_name"));
		baseballteam.setHeadquarters(rs.getString("headquarters"));
		baseballteam.setInauguration(rs.getString("inauguration"));
		baseballteam.setHistory(rs.getString("history"));
		
		return baseballteam;
		
	};
	
	
	
	
	/**
	 * 全て取得して、返却する
	 * 
	 * @return ベースボールチーム全件の　list
	 */
	public List<BaseballTeam> findAll() {
		String sql = "select * from baseball_teams;";
		List<BaseballTeam> baseballteam = template.query(sql, BaseballTeam_ROW_MAPPER);
		
		return baseballteam;
	}
	
	/**
	 * クリックされた１件のデータを全てとってくる
	 * 
	 * @param id
	 * @return baseballTeam 1件のすべてのデータを返却する
	 */
	public BaseballTeam load(Integer id) {
		String sql = "select * from baseball_teams where id=:id;";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("id",id);
		
		BaseballTeam baseballTeam = template.queryForObject(sql, param,BaseballTeam_ROW_MAPPER);
			
		return baseballTeam;
		
	}
	
	
	
	
	
	
}
