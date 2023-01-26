package com.duboomom.spring.ex.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@GetMapping("/ajax/test")
	public String ajaxTest() {
		return "/ajax/ajax";
	}
	
	@ResponseBody
	@GetMapping("/ajax/request")
	public Map<String, String> testRequest() {
		// json 데이터를 response에 담는다.
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "안미정");
		map.put("age", "28");
		map.put("result", "success");
		
		return map;
		
	}
	
}
