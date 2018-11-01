package jp.co.sample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sample.domain.Shop;

/**
 * 性別と色に応じた検索結果を、DBから取得する.
 * 
 * @author yuya.nishikiori
 *
 */
@Repository
public class ShopRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	
	private static final RowMapper<Shop> Shop_ROW_MAPPER=(rs,i)->{
		
		Shop shop = new Shop();
		shop.setId(rs.getInt("id"));
		shop.setCategory(rs.getString("category"));
		shop.setGenre(rs.getString("genre"));
		shop.setGender(rs.getInt("gender"));
		shop.setColor(rs.getString("color"));
		shop.setPrice(rs.getInt("price"));
		shop.setSize(rs.getString("size"));
		
		return shop;
		
	};
	
	
	public List<Shop> findAll() {
		String sql = "select * from shops;";
		List<Shop> shops = template.query(sql, Shop_ROW_MAPPER);
		
		return shops;
	}
	
	
	
	
	/**
	 * 
	 * @param gender 性別
	 * @param color　色
	 * @return　性別と色で検索をかけ、対象の商品を返却する.
	 */
	public List<Shop> Search(Integer gender,String color){
		String sql = "select * from shops where gender=:gender AND color=:color;";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("gender",gender).addValue("color", color);
		
		List<Shop> shops = template.query(sql, param,Shop_ROW_MAPPER);
			
		//System.out.println("gender = " + gender);
		//System.out.println("color = " + color);
		for(Shop shop : shops) {
			System.out.println(shop);
		}
		return shops;
	}

	


	


}
