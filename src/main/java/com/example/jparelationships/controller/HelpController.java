package com.example.jparelationships.controller;

import com.example.jparelationships.request.UserReq;
import com.example.jparelationships.response.UserResponse;
import com.example.jparelationships.service.UserService;
import com.example.jparelationships.shared.dto.UserDto;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpController {
    @Autowired
    UserService userService;
    @PostMapping("/users")
    public UserResponse addUsers(@RequestBody UserReq userRequest)
    {
        UserResponse returnValue = new UserResponse();
//        UserDto userDto = new UserDto();
//        BeanUtils.copyProperties(userRequest,userDto);
        ModelMapper modelMapper = new ModelMapper();
        UserDto userDto = modelMapper.map(userRequest, UserDto.class);
        UserDto addedUser = userService.createUser(userDto);
//        BeanUtils.copyProperties(addedUser,returnValue);
        returnValue = modelMapper.map(addedUser,UserResponse.class);
        return returnValue;
    }
    public ResponseEntity<String> getUsers()
    {
        return null;
    }


}
