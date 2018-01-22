package com.pa.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.pa.DAO.SpiderDAO;
import com.pa.pojo.Picture;
import com.sun.net.httpserver.Authenticator.Success;

@Namespace("/spider2")
public class SpiderAction  extends ActionSupport{
	
	
	private static final long serialVersionUID = 1L;
	private String url;
	private List<Picture> pictures;
	@Action(value="search",results={
			@Result(name="success",location="/index.jsp")
	})
	public String search()throws Exception{
		SpiderDAO dao = new SpiderDAO();
		pictures = dao.pictures(url);
		return SUCCESS;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	
	
	
}
