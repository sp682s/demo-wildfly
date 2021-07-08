package org.wildfly.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class HomeController {

	@GetMapping()
	public List<Integer> getResult() {
		List<Integer> result = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
		return result;
	}
}
