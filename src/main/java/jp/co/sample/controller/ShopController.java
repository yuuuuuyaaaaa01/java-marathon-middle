package jp.co.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Shop;
import jp.co.sample.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ShopService service;
		
		@RequestMapping("/shop")
		public String shop() {
			return "/Q15/shop";
		}
		
		@RequestMapping("/answer")
		public String answer(Integer gender,String color,Model model) {
			
			//model.addAttribute("genderNum", genderNum);
			//model.addAttribute("color", color);
			
			List<Shop> shops =  service.Search(gender, color);
			
			model.addAttribute("shops", shops);
			
			return "/Q15/shop";
		}
		
}
