package io.swagger.api;

import io.swagger.model.Pet;
import io.swagger.model.StatusModel;
import io.swagger.model.NewPet;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-06T19:35:44.435Z")

@Controller
public class PetApiController implements PetApi {

    public ResponseEntity<Pet> petDelete(@ApiParam(value = "Identify Number of the pet", required = true) @RequestParam(value = "id", required = true) Long id



) {
        // do some magic!
        return new ResponseEntity<Pet>(HttpStatus.OK);
    }

    public ResponseEntity petGet(@ApiParam(value = "Identify Number of the pet", required = true) @RequestParam(value = "id", required = true) Long id



) {
        // do some magic!
        //ResponseEntity<Pet> response = new ResponseEntity<>(HttpStatus.OK);

        Pet aPet = new Pet();
        aPet.id(new Long(1));
        aPet.name("abc");
        aPet.ages(2.2);
        aPet.weights(3.2);

        if (!aPet.getId().equals(id)) {
            StatusModel error = new StatusModel();
            error.status(-1);
            error.errorCode(404);
            error.messages("Pet not found. Invalid ID.");
            return new ResponseEntity<StatusModel>(error, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Pet>(aPet, HttpStatus.OK);
    }

    public ResponseEntity<StatusModel> petPost(

@ApiParam(value = "Information of the new pet" ,required=true ) @RequestBody Pet pet

) {
        // do some magic!
        return new ResponseEntity<StatusModel>(HttpStatus.OK);
    }

    public ResponseEntity<StatusModel> petPut(

@ApiParam(value = "Information of the new pet" ,required=true ) @RequestBody NewPet pet

) {
        // do some magic!
        return new ResponseEntity<StatusModel>(HttpStatus.OK);
    }

}
