package jp.co.sample.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Shop;
import jp.co.sample.service.ShopService;

/**
 * 性別と色を選択して、その選択に応じた結果を検索し返却する.
 * 
 * @author yuya.nishikiori
 *
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
	
	
	@Autowired
	private ShopService service;
		
		/**
		 * shopの初期画面を表示する.
		 * 
		 * @return
		 */
		@RequestMapping("/shop")
		public String shop() {
			return "/Q15/shop";
		}
		
		/**
		 * 性別と色を選択した結果を返却する.
		 * 
		 * @param gender　性別選択
		 * @param color　　色を選択
		 * @param model　リクエストスコープ
		 * @return
		 */
		@RequestMapping("/answer")
		public String answer(Integer gender,String color,Model model) {
			
			//model.addAttribute("genderNum", genderNum);
			//model.addAttribute("color", color);
			
			List<Shop> shops =  service.Search(gender, color);
			
			model.addAttribute("shops", shops);
			
			return "/Q15/shop";
		}
		
}
