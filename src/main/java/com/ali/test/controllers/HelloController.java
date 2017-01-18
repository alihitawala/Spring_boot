package com.ali.test.controllers;

/**
 * Created by aliHitawala on 1/19/17.
 */
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/secured")
    public String secured() {
        return "Secured Greetings from Spring Boot!";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/api/{userId}", method = RequestMethod.POST,
            consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> post_first(@PathVariable String userId, @RequestBody String input) {
        return ResponseEntity.ok(userId);
    }

}
