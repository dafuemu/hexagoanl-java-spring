package io.reflectoring.buckpal.account.adapter.in.web;


import io.reflectoring.buckpal.common.WebAdapter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
public class HealthyController {

    @GetMapping
    ResponseEntity<String> healthCheck() {

        return ResponseEntity.ok("All fine");
    }
}
