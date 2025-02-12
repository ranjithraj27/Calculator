
	package com.example.demo;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class CalculatorController {
		@GetMapping("/")
		public String show_calculator() {
			 return "calculator";
		}
		
		
		@PostMapping ("calculate")
		public String calculate (@RequestParam double num1,@RequestParam double num2,
				@RequestParam String operations,Model model )
		{
			double result=0;
			
			switch(operations) {
			
			case "+" : result = num1+num2; break;
			
			case "-" : result = num1-num2; break;
			
			
			case "*" : result = num1*num2; break;
			
			
			case "/" : result = num1/num2; break;
			
			
			}
			model.addAttribute("num1", num1);
			model.addAttribute("num2", num2);
			model.addAttribute("operations ", operations);
			model.addAttribute("result", result);
			return "calculator";
			
		}
		

	}


