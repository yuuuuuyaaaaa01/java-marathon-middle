package jp.co.sample.domain;



/**
 * ベースボールチームを表すドメイン.
 * 
 * @author yuya.nishikiori
 *
 */


public class BaseballTeam {
	/**
	 * 　id 
	 */
	private Integer id;
	/**
	 * リーグネーム
	 */
	private String leagueName;
	/**
	 * チームネーム
	 */
	private String teamName;
	/**
	 * 本拠地
	 */
	private String headquarters;
	/**
	 * 発足
	 */
	private String inauguration;
	/**
	 * 歴史
	 */
	private String history;
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "BaseballTeam [leagueName=" + leagueName + ", teamName=" + teamName + ", headquarters=" + headquarters
				+ ", inauguration=" + inauguration + ", history=" + history + "]";
	}


	public String getLeagueName() {
		return leagueName;
	}


	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getHeadquarters() {
		return headquarters;
	}


	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}


	public String getInauguration() {
		return inauguration;
	}


	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}


	public String getHistory() {
		return history;
	}


	public void setHistory(String history) {
		this.history = history;
	}
	
	
	
	
	
	
}
