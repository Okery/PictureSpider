package com.pa.DAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.views.xslt.ArrayAdapter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pa.pojo.Picture;

/**
 * 
* @ClassName: PictureDAO 
* @Description:  ͼƬ��ȡ������
* @author  LiuHe
* @date  2018-1-22
 */
public class SpiderDAO {
	
	

	public SpiderDAO() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("����");
	}

	/**
	 * @Description ��ȡ��ҳԴ�룬Ĭ�ϱ����ʽΪutf-8  
	 * @param url  ��ַ
	 * @return ����ҳ��Դ��
	 * @throws IOException 
	 * @throws Exception
	 */
	private static String getHtml(String urlPram) throws IOException{
		
		InputStreamReader isr = null;
		BufferedReader bf = null;
		StringBuffer sb = new StringBuffer();
		try {
			URL url = new URL(urlPram);
			URLConnection urlConnection = url.openConnection();
			isr = new InputStreamReader(urlConnection.getInputStream());
			bf = new BufferedReader(isr);
			String temp = "";
			while((temp=bf.readLine())!=null){
				sb.append(temp+"\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		if(bf!=null)
			bf.close();
		if(isr!=null)
			isr.close();
		
		return sb.toString();
	}
	
	/**
	 * ��Ϣ��ȡ ��Ϣ��װ
	 * @param url ��ַ
	 * @return ����ͼƬ����
	 * @throws Exception 
	 */
	public List<Picture> pictures(String url) throws Exception{
		List<Picture> pictures = new ArrayList<Picture>();
		String html = getHtml(url);
//		System.out.println(html);
		Document document = Jsoup.parse(html);
		Elements elements = document.getElementsByTag("img");
		for (Element element : elements) {
			System.out.println(element.attr("src"));
			System.out.println(element.attr("title"));
			Picture picture = new Picture(element.attr("src"), element.attr("title"));
			pictures.add(picture);
		}
		return pictures;
	}
}
