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
	//�û��������ַ
	private String url;
	//���ص�ͼƬ����
	private List<Picture> pictures;
	//�쳣��־λ
	private String flag;
	
	
	
	@Action(value="search",results={
			@Result(name="success",location="/index.jsp"),
			@Result(name="error",type="json")
	})
	public String search()throws Exception{
		try{
			//����dao�������ȡ
			SpiderDAO dao = new SpiderDAO();
			pictures = dao.pictures(url);
			//ִ�гɹ�֮�󷵻�success
			return SUCCESS;
		}catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			//�쳣����
			//��Ӧǰ̨   
			//��Ϊ����Ŀǰ�������쳣��������ַ�ܷ���ʵ�  ���Գ����쳣�ͷ���  �������쳣�����ж�
			flag="1";
			//����error
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
