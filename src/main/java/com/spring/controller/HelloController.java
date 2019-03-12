package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		System.out.println("welcome called");
		ModelAndView model = new ModelAndView();
		model.setViewName("welcomePage");
		return model;
	}

	@RequestMapping(value = { "/homePage"}, method = RequestMethod.GET)
	public ModelAndView homePage() {
		System.out.println("home called");
		ModelAndView model = new ModelAndView();
		model.setViewName("homePage");
		return model;
	}
	
	@RequestMapping(value = { "/xyz"}, method = RequestMethod.GET)
	public ModelAndView xyz() {
		System.out.println("xyz called");
		ModelAndView model = new ModelAndView();
		model.setViewName("xyz");
		return model;
	}
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
	@RequestParam(value = "logout",	required = false) String logout) {
		System.out.println("login called");
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addObject("message", "Logged out from JournalDEV successfully.");
		}

		model.setViewName("loginPage");
		return model;
	}
	
//	@Autowired
//	//@Qualifier("newUserService")
//	UserServiceInterface userService;
//	
//	@RequestMapping("hi")
//	@ResponseBody
//	public String hi(){
//		return "Hi Kapil" + userService.findNumberOfUser();
//	}
//	
//	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
//	public ModelAndView welcomePage() {
//		ModelAndView model = new ModelAndView();
//		model.setViewName("list");
//		return model;
//	}
//	
//	
//	@RequestMapping("user/list")
//	@ResponseBody
//	public String getUserList(Model model){
//		model.addAttribute("user",50);
//		return "list";
//	}

}
