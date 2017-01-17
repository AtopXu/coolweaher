package model;



public class County {
	private int id;
	private String countyName;
	private String countyCode;
	private int cityId;
	
	public int  getId(int id){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getCountyName(){
		return countyName;
	}
	
	public void setCountyName(String CountyName){
		this.countyName=countyName;
	}
	
	public String getCountyCode(){
		return countyCode;
	}
	
	public void setCountyCode(String countyCode){
		this.countyCode=countyCode;
		
	}
	
	public int getCityId(){
		return cityId;
	}
	
	public void setProvinceId(int provinceId){
		this.cityId=provinceId;
}



}












