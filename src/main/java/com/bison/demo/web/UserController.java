package com.bison.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bison.demo.ennity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	 
	
	    @RequestMapping("list")
	    public String   listUser(Model model) {
	        List<User> userList = new ArrayList<User>();
	        for (int i = 0; i <10; i++) {
	            userList.add(new User(i,"zhamhsan"+i,20+i,"liss"));
	        }
	        
	        model.addAttribute("users", userList);
	        return "/user/list";
	    }
}
