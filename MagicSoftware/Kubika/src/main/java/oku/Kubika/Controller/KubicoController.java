package oku.Kubika.Controller;

import lombok.Getter;
import oku.Kubika.Kubico.Components.*;
import oku.Kubika.Kubico.Property;
import oku.Kubika.RepoLayer.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class KubicoController {

    @Autowired
    PropertyRepo propertyRepo;

    @GetMapping("/")
    public ResponseEntity<List<Property>> getProducts(){

        Category category = new Category();
        category.setType(Category.Type.APARTMENT);
        Location location =  new Location("Geo", "1tyu", "3456782vd", "45678ghj237890");
        PaymentModality paymentModality = new PaymentModality();
        paymentModality.setModality(PaymentModality.Modality.MONTHLY);
        List<PaymentModality> paymentModalityList = new ArrayList<>();
        paymentModalityList.add(paymentModality);
        Status status = new Status();
        status.setStates(Status.States.OCUPADO);
        String image = "DanielSamba";
        List<String> images = new ArrayList<>();
        images.add(image);
        Comments comment = new Comments("Comenes");
        List<Comments> commentsList = new ArrayList<>();
        commentsList.add(comment);
        Property newProperty = new Property(
                3,
                2,
               category,
                "Jesus",
                location,
                paymentModalityList,
                Offer.RENT,
                status,
                images,
                "Apartamento T3",
                25000000.0,
                150.0,
                commentsList



        );

        propertyRepo.save(newProperty);
        return ResponseEntity.ok(propertyRepo.findAll());
    }


}
