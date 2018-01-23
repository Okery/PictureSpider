package com.pa.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.pa.DAO.SpiderDAO;
import com.pa.pojo.Picture;
import com.sun.net.httpserver.Authenticator.Success;

@ParentPackage("json-default")
@Namespace("/spider2")
public class SpiderAction  extends ActionSupport{
	
	
	private static final long serialVersionUID = 1L;
	//用户输入的网址
	private String url;
	//返回的图片集合
	private List<Picture> pictures;
	//异常标志位
	private String flag;
	
	
	
	@Action(value="search",results={
			@Result(name="success",location="/index.jsp"),
			@Result(name="error",type="json")
	})
	public String search()throws Exception{
		try{
			//调用dao层进行爬取
			SpiderDAO dao = new SpiderDAO();
			pictures = dao.pictures(url);
			//执行成功之后返回success
			return SUCCESS;
		}catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			//异常处理
			//响应前台   
			//因为这里目前遇到的异常仅仅是网址能否访问到  所以出现异常就返回  不进行异常类型判断
			flag="1";
			//返回error
			return ERROR;
		}
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
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
	
}
