package spring.boot.web.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@PostMapping("/user/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password,Map<String,Object> map,HttpSession session) {
		if(StringUtils.hasLength(username)  && "1223".equals(password) ) {
			session.setAttribute("loginUser", username);
			return "redirect:/main.html";	
		}else {
			map.put("msg", "用户名或密码错误");
			return "index";
		}
		
	}

}
