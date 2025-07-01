package in.co.serviceregistry.test2controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Test 2
@RestController
@RequestMapping("/test2")
public class Test2Controller {
	@GetMapping("/check")
	public String testcheck() {
		return "Test2 check successful";
	}
}


