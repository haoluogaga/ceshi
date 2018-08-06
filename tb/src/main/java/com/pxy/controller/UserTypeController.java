package com.pxy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.pxy.pojo.UserType;
import com.pxy.service.UserTypeService;

@Controller
@RequestMapping("/usertype")
@SessionAttributes({ "typeList"})
public class UserTypeController {  
	@Autowired
	private UserTypeService userTypeService;

	@RequestMapping(value = "/get")
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("/usertype/list");
		List<UserType> list = userTypeService.getUserType();
		model.addObject("typeList", list);
		return model;
	}

	@RequestMapping(value = "/get2")
	public ModelAndView get2(Map<String,Object> session) {
		ModelAndView model = new ModelAndView("usertype/list");
		List<UserType> list = userTypeService.getUserType();
		session.put("typeList", list);
		
		return model;
	}

	@RequestMapping(value = "/get3")
	public ModelAndView get3(Map<String,Object> session) {
		ModelAndView model = new ModelAndView("usertype/list");
		List<UserType> list = userTypeService.getUserType();
		session.put("typeList", list);
		
		return model;
	}
}
