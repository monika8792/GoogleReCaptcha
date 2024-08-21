//package com.email;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import cn.apiclub.captcha.Captcha;
//
//@RestController
//@RequestMapping("/app")
//public class CaptchaControlller {
//	  private CapchaSetting  gencaptcha() {
//		CapchaSetting captchasetting =new CapchaSetting();
//		Captcha captcha=CaptchaGenerated.generatedCaptcha(260, 80);
//		captchasetting.setHiddencaptcha(captcha.getAnswer());
//		captchasetting.setCaptcha("");
//		captchasetting.setRealcaptcha(CaptchaGenerated.encodCptchaBinary(captcha));
//		return captchasetting;
//	}
//	  @GetMapping("/verify")
//	  public String register(Model model) {
//		  model.addAttribute("captcha",gencaptcha());
//		  return" verifycaptcha";
//	  }
//	  @PostMapping("/verify")
//	  public String verify(@ModelAttribute CapchaSetting captchasetting,Model model) {
//		 if(captchasetting.getCaptcha().equals(captchasetting.getHiddencaptcha())) {
//			 
//			 model.addAttribute("message"," Captca verify succefullt ");
//			 return "success";
//			 
//		 }
//		 else {
//			 model.addAttribute("message","captcha Invalid");
//			 model.addAttribute("captcha",gencaptcha());
//		 }
//		 return"verifyCaptcha";
//		   
//		  
//		  
//		    
//		 
//	  }
//
//}
