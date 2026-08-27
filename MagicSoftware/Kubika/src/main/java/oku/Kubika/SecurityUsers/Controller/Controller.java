package oku.Kubika.SecurityUsers.Controller;

import oku.Kubika.SecurityUsers.Model.DataTransferObjects.LoginDTO;
import oku.Kubika.SecurityUsers.Model.DataTransferObjects.RegisterDataTranferObj;
import oku.Kubika.SecurityUsers.Service.UserKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class Controller {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserKService service;

    @PostMapping("/register")
    public ResponseEntity registering(@RequestBody @Validated RegisterDataTranferObj data){

            return ResponseEntity.ok(service.register(data.name(), data.password()));
    }

    @GetMapping("/login")
    public ResponseEntity login(LoginDTO data){


        return null;
    }


}