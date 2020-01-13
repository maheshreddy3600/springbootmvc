package bootmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import mvchbn.Customer;

@Controller
public class LoginController {

//CustomerDao dao;
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String ShowLoginForm(){
		return "Login";
	}

@RequestMapping(value="login",method=RequestMethod.POST)
public ModelAndView login(@RequestParam("username") String user,@RequestParam("password") String pass){
	ModelAndView mav=new ModelAndView();
	//dao.addCustomer(cust);
	mav.setViewName("Welcome");
	mav.addObject("username",user);
	return mav;
	
}
}
