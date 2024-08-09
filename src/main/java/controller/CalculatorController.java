package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@RequestMapping("/")
public class CalculatorController {
	
	@GetMapping("test")
	@ResponseBody
	public String getData() {
	    System.out.println("Inside getData method");
		return "success";
	}
}
