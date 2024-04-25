package com.sathya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class studentcontroler {

	
	@RequestMapping("/")
	public String studentform() {
		return "student";
		
	}
	@RequestMapping("/req1")
    public  String emp(@RequestParam int sno,@RequestParam String sname,@RequestParam String course,@RequestParam int hibernate,@RequestParam int spring,@RequestParam int sboot, ModelMap model) {
		model.put("sno",sno);
		model.put("sname",sname);
	    model.put("course",course);
	    model.put("hibernate",hibernate);
	    model.put("spring",spring);
	    model.put("sboot",sboot);
	    int totalmarks=hibernate+spring+sboot;
	    model.put("totalmarks", totalmarks);
	    double percentage=totalmarks/3 ;
	    model.put("percentage", percentage);
	    String grade=null,Result = null;
	    if (percentage>=70) {
                 grade="A grade";
	             Result="pass";
	    }
	    else if (percentage>=60 ) {
	    	grade="B grade";
	    	Result="pass";
	    } 
	    else if (percentage>=50) {
	    	grade="C grade";
	    	Result="pass";
	    	}
		else if (percentage>=35) {
			grade="pass";
		}
	    else {
	    	grade="Fail";
		}
	    model.put("grade", grade);
	    model.put("Result", Result);
		return "result";
		
	}
	
}

















