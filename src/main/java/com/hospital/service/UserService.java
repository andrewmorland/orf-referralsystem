package com.hospital.service;

import com.hospital.dao.IUserDao;
import com.hospital.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by morland on 2016/3/20.
 */
@Service("UserService")
public class UserService implements IUserService{
    @Autowired
    private IUserDao userdao;
    public User login(User user){
        try {
            User u = userdao.getUser(user.getUsername(), user.getPassword());
            if (u.getUsername() != null) {
                return u;
            }else return null;
        }
        catch (NullPointerException e) {
            return null;
        }
    }
    @Override
    public User getbyname(String username)
    {
        try{
            User u=userdao.getByUserName(username);
            return u;
        }
        catch (NullPointerException e) {
            return null;
        }
    }

}
