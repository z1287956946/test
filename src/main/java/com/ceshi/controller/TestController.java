package com.ceshi.controller;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceshi.mapper.MembersDao;

@Controller
public class TestController {

@Autowired
private MembersDao membersDao;

@RequestMapping("Hello")
	public String Hello(){
		System.out.println("11111111");
		return "成功"+membersDao.findMemberBalance().get(0).getMid();
	}
@RequestMapping("test")  
public String  test(Model model){
	System.out.println("222222");
	Map<String, String> map =new HashMap<String, String>();
	map.put("name", "chengong");
	model.addAttribute("num",map);
	return "test";
}
}
