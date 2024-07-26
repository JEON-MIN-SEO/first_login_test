package Login.controller;

import Login.test.dto.UserDTO;
import Login.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}

