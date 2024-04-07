package com.min.project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.project.service.userService;


@Controller
@RequestMapping("/main/*")

public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Inject
	private  userService UserService;
	
	@RequestMapping(value ="/getList" , method =RequestMethod.GET)
	public String getList(Model model)  {
	    
		String list = UserService.getList();
		model.addAttribute("list",list);
	    
		return "main/list";
			
		}
	
	@ResponseBody
	@RequestMapping(value ="/searchUserList" , method =RequestMethod.GET)
	public String searchUserList(@RequestParam("userid") String userId)  {
		
		String username = "";

		username = UserService.searchUserList(userId);
	    
		return username;
			
		}
	}

