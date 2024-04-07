package com.min.project;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
	
		@RequestMapping(value ="/index" , method =RequestMethod.GET)
		public String mainIndex(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
	Connection conn = null;
	
		try {
			Class<?> dbDriver = Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql 드라이버(" + dbDriver.toString() + ")가 로딩됨");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
				System.out.println("mysql 드라이버가 로딩되지 않음");
		}
		
			List<String> list = new ArrayList<String>();
			list.add("testid1");
			list.add("testid2");
			list.add("testid3");
			list.add("testid4");
			list.add("testid5");
			model.addAttribute("list", list);
			
			return "main/main";
		}
		

		
		
	}


