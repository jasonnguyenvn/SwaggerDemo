package com.conghau.SwaggerDemo.api;

import com.conghau.SwaggerDemo.model.Pet;

import java.math.BigDecimal;
import com.conghau.SwaggerDemo.model.StatusModel;
import com.conghau.SwaggerDemo.model.NewPet;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-06T19:35:44.435Z")

@Controller
public class PetApiController implements PetApi {

    public ResponseEntity<Pet> petDelete(@ApiParam(value = "Identify Number of the pet", required = true) @RequestParam(value = "id", required = true) BigDecimal id



) {
        // do some magic!
        return new ResponseEntity<Pet>(HttpStatus.OK);
    }

    public ResponseEntity<Pet> petGet(@ApiParam(value = "Identify Number of the pet", required = true) @RequestParam(value = "id", required = true) BigDecimal id



) {
        // do some magic!
        return new ResponseEntity<Pet>(HttpStatus.OK);
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
