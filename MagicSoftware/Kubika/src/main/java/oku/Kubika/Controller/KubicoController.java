package oku.Kubika.Controller;

import lombok.Getter;
import oku.Kubika.Kubico.Property;
import oku.Kubika.RepoLayer.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authorization.method.AuthorizeReturnObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class KubicoController {

    @Autowired
    PropertyRepo propertyRepo;

    @GetMapping("/")
    public ResponseEntity<List<Property>> getProducts(){

        return ResponseEntity.ok(propertyRepo.findAll());
    }


}
