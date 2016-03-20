package com.hospital.service;

import com.hospital.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by morland on 2016/3/19.
 */

public interface IUserService {
    User login(User user);
    User getbyname(String username);
}
