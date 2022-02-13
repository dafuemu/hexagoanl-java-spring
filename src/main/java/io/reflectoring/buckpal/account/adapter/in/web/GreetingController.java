package io.reflectoring.buckpal.account.adapter.in.web;

import io.reflectoring.buckpal.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
@Slf4j
class GreetingController {

	@GetMapping(path = "/greeting")
	ResponseEntity<String> greeting() {
		 return new ResponseEntity<>("Hello v2", HttpStatus.OK);
	}
}
