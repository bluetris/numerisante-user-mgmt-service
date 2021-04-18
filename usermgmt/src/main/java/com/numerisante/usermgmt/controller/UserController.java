package com.numerisante.usermgmt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.numerisante.usermgmt.dto.AppResponse;
import com.numerisante.usermgmt.entity.User;
import com.numerisante.usermgmt.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="user",produces = "application/json")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Creating User" , response = AppResponse.class )
	@ApiResponses(value = {
			@ApiResponse(code = 201 ,message = "Successfully Created User")
	})
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
    public AppResponse createUser(@RequestBody @Valid final User user) {
		AppResponse response = new AppResponse();
		response.setData(userService.createUser(user));
		return response;
	}
}