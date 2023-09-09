package com.example.jparelationships.service.impl;

import com.example.jparelationships.dao.UserRepo;
import com.example.jparelationships.entity.UserEntity;
import com.example.jparelationships.service.UserService;
import com.example.jparelationships.shared.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo repo;
    @Override
    public UserDto createUser(UserDto userDto)
    {
        ModelMapper modelMapper = new ModelMapper();
        UserDto returnValue = new UserDto();
        UserEntity userEntity = new UserEntity();
//        BeanUtils.copyProperties(userDto,userEntity);
        userEntity = modelMapper.map(userDto, UserEntity.class);

        UserEntity standardEntity = repo.save(userEntity);
//        BeanUtils.copyProperties(standardEntity,returnValue);
        returnValue = modelMapper.map(standardEntity,UserDto.class);
        return returnValue;
    }
}
