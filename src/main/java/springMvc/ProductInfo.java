/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package springMvc;


/**
 * 贷款产品类型Entity
 * @author oyp
 * @version 2016-08-02
 */
public class ProductInfo  {
	
	private static final long serialVersionUID = 1L;
	private String name;		// 名称
	private String path;		// LOGO
	private Integer type;		// 产品类型
	private Integer minDeadline;		// �?��期限
	private Integer maxDeadline;		// �?��期限
	private Integer minAumout;		// �?��额度
	private Integer maxAumout;		// �?��额度
	private Integer deadlineUnit;		// 期限单位
	private String suitPeople;		// 适合人群
	private String conditionRequire;		// 贷款条件
	
	private String typeStr;
	private String deadlineUnitStr;
	
	
	public ProductInfo() {
		super();
	}

 
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	 
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) { 
		this.type = type;
	}
	 
	public Integer getMinDeadline() {
		return minDeadline;
	}

	public void setMinDeadline(Integer minDeadline) {
		this.minDeadline = minDeadline;
	}
	 
	public Integer getMaxDeadline() {
		return maxDeadline;
	}

	public void setMaxDeadline(Integer maxDeadline) {
		this.maxDeadline = maxDeadline;
	}
	 
	public Integer getMinAumout() {
		return minAumout;
	}

	public void setMinAumout(Integer minAumout) {
		this.minAumout = minAumout;
	}
	 
	public Integer getMaxAumout() {
		return maxAumout;
	}

	public void setMaxAumout(Integer maxAumout) {
		this.maxAumout = maxAumout;
	}
	 
	public Integer getDeadlineUnit() {
		return deadlineUnit;
	}

	public void setDeadlineUnit(Integer deadlineUnit) { 
		this.deadlineUnit = deadlineUnit;
	}
	 
	public String getSuitPeople() {
		return suitPeople;
	}

	public void setSuitPeople(String suitPeople) {
		this.suitPeople = suitPeople;
	}
	 
	public String getConditionRequire() {
		return conditionRequire;
	}

	public void setConditionRequire(String conditionRequire) {
		this.conditionRequire = conditionRequire;
	}

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) { 
            this.typeStr = typeStr; 
    }

    public String getDeadlineUnitStr() {
        return deadlineUnitStr;
    }

    public void setDeadlineUnitStr(String deadlineUnitStr) { 
            this.deadlineUnitStr = deadlineUnitStr; 
    }
}