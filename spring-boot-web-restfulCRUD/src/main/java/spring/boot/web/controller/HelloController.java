package spring.boot.web.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//	@RequestMapping({"/","/index.html"})
//	public String index() {
//		return "index";
//		
//	}
	
	
	@RequestMapping("/success")
	public String success(Map<String,Object> map) {
		map.put("hello", "<h1>zhangsan<h1/>");
		map.put("users",Arrays.asList("zhangsan","lisi","wangwu"));
		return "success";
	}

}
