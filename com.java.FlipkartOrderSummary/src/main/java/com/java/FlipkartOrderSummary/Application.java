package com.java.FlipkartOrderSummary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.Services.FlipkartOrderServices;
import com.java.order.Entity.OrderSummary;


@SpringBootApplication
@EntityScan(basePackages = "com.java.order.Entity")
@EnableJpaRepositories(basePackages = "com.java.order.Repo")
@ComponentScan(basePackages = {"com.java.Services"})
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=SpringApplication.run(Application.class, args);
	
	FlipkartOrderServices order=container.getBean(FlipkartOrderServices.class);
	//String sts=order.addProductInfo(new OrderSummary(1,"MenSection","MenShirts","available",34243.98, 123.32f, 3523527L));

	//List<OrderSummary> st=order.("liba");
		//System.out.println(st);
		//List<OrderSummary> liba= new ArrayList<OrderSummary>();
		//.add(new OrderSummary(2,"MenSection","MenShirts","available",34243.98, 123.32f, 3523527L));
		//liba.add(new OrderSummary(3,"MenSection","MenTrouser","available",3424.98,323.23f,424324L));
		//liba.add(new OrderSummary(4,"WomenSection","WomenSuit","available",3313.98,32332.22f,42432434L));
		//liba.add(new OrderSummary(5,"WomenSection","WomenSuit","Available",3313.98,32332.25f,42432434L));
		//liba.add(new OrderSummary(6,"ChildSection","ChildSuit","Not available",34313.98,32782.26f,432434L));
		//liba.add(new OrderSummary(7,"ChildSection","ChildCoat","Available",2313.01,3212.21f,4323434L));
		//order.registerMultipleProductInfo(liba).forEach(v->System.out.println(v));
		//System.out.println(sts);
		
		//order.findByorderId(1).forEach(v->System.out.println(v));
		//order.findByitemCode("MenShirts").forEach(v->System.out.println(v));
		//order.findByitemName("Not available").forEach(v->System.out.println(v));
		//order.findByitemPrice(34243.98).forEach(v->System.out.println(v));
		//order.findByitemCount(32332.2f).forEach(v->System.out.println(v));
		//order.findByorderDetails(3523527l).forEach(v->System.out.println(v));
		//order.findByitemPriceLessThanEqual(34243.98).forEach(v->System.out.println(v));
	   // order.findByitemPriceBetween(3313.98,34243.98).forEach(v->System.out.println(v));
	   	//order.findByorderDetailsEquals(3523527l).forEach(v->System.out.println(v));
   		 // order.findByitemPriceanditemCode(34243.98,"MenShirts").forEach(v->System.out.println(v));
		System.out.println("Updating the price");
		order.updateitemPriceByitemName(34243.98, "MenShirts");
	

	}

}
