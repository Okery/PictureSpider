package com.pa.pojo;

/**
 * 
* @ClassName: Picture 
* @Description: ͼƬpojo��  ������·�� ��������   
* @author  LiuHe
* @date  2018-1-22
 */
public class Picture {
	
	private String src;
	private String title ;
	
	
	
	public Picture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Picture(String src, String title) {
		super();
		this.src = src;
		this.title = title;
	}
	
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
