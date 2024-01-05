package com.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappController {
	@GetMapping(value = "getJenMsg")
	public String getJenMsg() {
		return "this is jenkins";
	}
}
