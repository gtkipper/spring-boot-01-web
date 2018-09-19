package com.timer.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.timer.bean.Car;
import com.timer.bean.Person;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "欢迎来到spingboot，Welcome to Beijing";
	}
	@RequestMapping("/success")
	public String success(Map<String,Object> map) throws Exception {
		Car car = new Car("张三的车", 1000000.00, "宝马", 4);
		Person person = new Person("张三", 32, new SimpleDateFormat("yyyy_MM_dd").parse("1987_08_28"), 
				"山东省东营市", car);
		map.put("name", "你没有见过吧");
		map.put("users", Arrays.asList("张大三","李四","王五","赵六"));
		map.put("person",person);
		return "cf/success";
	}
}
