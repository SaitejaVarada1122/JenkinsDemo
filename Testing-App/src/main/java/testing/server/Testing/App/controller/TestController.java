package testing.server.Testing.App.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TestController {
	
	@GetMapping("/greet")
	public ResponseEntity<?> getStudents(@RequestParam String name) {
		return new ResponseEntity<>("Hello " + name + ", Welcome to KK Supermarket", HttpStatus.OK);
	}
}
