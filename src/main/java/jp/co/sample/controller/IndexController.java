package jp.co.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.BaseballTeam;
import jp.co.sample.service.BaseballTeamService;

/**
 * スタート画面.
 * 
 * @author yuya.nishikiori
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired
	private BaseballTeamService service;
	
	
	/**
	 * DBの一覧を取得し、初期画面へ.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		List<BaseballTeam> baseballTeams = service.findAll();
		
		model.addAttribute("baseballTeams",baseballTeams);
		return "/Q5/input";
	}
	
	/**
	 * クリックされたら、id を受け取り、そのid の情報を表示.
	 * 
	 * @param id
	 * @param model　チームの１件の情報をリクエストスコープに格納
	 * @return
	 */
	@RequestMapping("/output")
	public String output(Integer id, Model model) {
		
		BaseballTeam baseballTeam = service.load(id);
		
		model.addAttribute("baseballTeam", baseballTeam);
		
		return "/Q5/output";
	}
	
	
	
}
