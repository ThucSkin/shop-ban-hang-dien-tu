package poly.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityController {
//	@RequestMapping("/secutiry/login/form")
//	public String loginPage(Model model) {
//		model.addAttribute("message", "Vui long dang nhap!");
//		return "security/login";
//	}
	@RequestMapping(value="/security/login/form",method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("message", "Vui long dang nhap!");
		return "security/login";
	}
	
	@RequestMapping("/security/login/success")
	public String loginSuccess(Model model) {
		model.addAttribute("message", "Dang nhap thanh cong!");
		return "security/login";
	}
	
	@RequestMapping("/security/login/error")
	public String loginError(Model model) {
		model.addAttribute("message", "Sai thong tin dang nhap!");
		return "security/login";
	}
	
	@RequestMapping("/security/unauthoried")
	public String unauthoried(Model model) {
		model.addAttribute("message", "Khong co quyen truy xuat!");
		return "security/login";
	}
	
	
	@RequestMapping("/security/logoff/success")
	public String logoff(Model model) {
		model.addAttribute("message", "Ban da dang xuat!");
		return "security/login";
	}
	
	
	
	
}
