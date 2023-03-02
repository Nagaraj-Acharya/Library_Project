package com.lib;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@GetMapping(value= {"/","/getBooks"})
	public String libraryMethod()
	{
		return "Hello, Messages From Library Project";
	}

}
