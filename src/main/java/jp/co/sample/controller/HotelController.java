package jp.co.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Hotel;
import jp.co.sample.service.HotelService;

/**
 * 検索された金額で検索をかけ、結果を返す.
 * 
 * @author yuya.nishikiori
 *
 */
@Controller
@RequestMapping("/Hotel")
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	@RequestMapping("/search")
	public String search() {
		return "/Q10/search";
	}
	
	@RequestMapping("/searchAnswer")
	public String searchAnswer(String price,Model model) {
		
		Integer priceNum = Integer.parseInt(price);//searchから金額を受け取り、Integerに変換
		
		//model.addAttribute("priceNum", priceNum); // リクエストスコープに price を格納
		
		List<Hotel> hotels =  service.findPrice(priceNum);
		
		model.addAttribute("hotels", hotels);
		
		return "/Q10/search";
		
		
		
	}
	
}
