package com.conghau.SwaggerDemo.api;

import com.conghau.SwaggerDemo.model.Pet;

import java.math.BigDecimal;
import com.conghau.SwaggerDemo.model.StatusModel;
import com.conghau.SwaggerDemo.model.NewPet;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-06T19:35:44.435Z")

@Api(value = "pet", description = "the pet API")
public interface PetApi {

    @ApiOperation(value = "", notes = "Remove a \"pet\" from database  Provide parameter ***id** to remove the pet's record. ", response = Pet.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Pet.class),
        @ApiResponse(code = 404, message = "Could not find the pet in our database", response = Pet.class) })
    @RequestMapping(value = "/pet",
        method = RequestMethod.DELETE)
    ResponseEntity<Pet> petDelete(@ApiParam(value = "Identify Number of the pet", required = true) @RequestParam(value = "id", required = true) BigDecimal id



);


    @ApiOperation(value = "", notes = "Gets `Pet` object. Provide parameter ***id** to get the Pet information. ", response = Pet.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Pet.class),
        @ApiResponse(code = 404, message = "Could not find the pet in our database", response = Pet.class) })
    @RequestMapping(value = "/pet",
        method = RequestMethod.GET)
    ResponseEntity<Pet> petGet(@ApiParam(value = "Identify Number of the pet", required = true) @RequestParam(value = "id", required = true) BigDecimal id



);


    @ApiOperation(value = "", notes = "Update a pet information ", response = StatusModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = StatusModel.class),
        @ApiResponse(code = 400, message = "Input Data is invalid.", response = StatusModel.class),
        @ApiResponse(code = 500, message = "Server Error", response = StatusModel.class) })
    @RequestMapping(value = "/pet",
        method = RequestMethod.POST)
    ResponseEntity<StatusModel> petPost(

@ApiParam(value = "Information of the new pet" ,required=true ) @RequestBody Pet pet

);


    @ApiOperation(value = "", notes = "Add a new pet ", response = StatusModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = StatusModel.class),
        @ApiResponse(code = 400, message = "Input Data is invalid.", response = StatusModel.class),
        @ApiResponse(code = 500, message = "Server Error", response = StatusModel.class) })
    @RequestMapping(value = "/pet",
        method = RequestMethod.PUT)
    ResponseEntity<StatusModel> petPut(

@ApiParam(value = "Information of the new pet" ,required=true ) @RequestBody NewPet pet

);

}
