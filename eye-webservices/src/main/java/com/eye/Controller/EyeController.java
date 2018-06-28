package com.eye.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import io.swagger.annotations.Api;

@Controller
@RequestMapping(value = "/eye")
@Api(value = "EyeController", tags = "EYE-API")

public class EyeController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String test() {

		return "hello";

	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String sample() {

		return "Sample in Eye is Up boy!!!!!";

	}
	
}