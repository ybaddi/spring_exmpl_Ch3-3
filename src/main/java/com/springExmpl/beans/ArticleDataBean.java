package com.springExmpl.beans;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.springExmpl.Ibeans.IArticleData;

import java.util.Date;

import javax.annotation.PostConstruct; 
import javax.annotation.PreDestroy;

public class ArticleDataBean implements IArticleData{
	
	Logger  logger = Logger.getLogger(this.getClass().getName());
	
	private int id;
	private String name;
	private Double price;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

	public double initPrice() {
		System.out.println("init price");
		this.setPrice(6.0);
		return this.getPrice();
	}


	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}
	public ArticleDataBean(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	

}
