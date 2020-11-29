package com.example.userManagementApp.Repository;

import com.example.userManagementApp.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    List<User> usersList = new ArrayList<>();
    public List<User> getAllUsers() {
        return usersList;
    }

    public User getUser(String id) {
        Optional<User> first = usersList.stream().
                filter(u -> u.getId().equals(id))
                .findFirst();
        if(first.isPresent()){
            return first.get();
        }
        else{
            return new User();
        }
    }

    public void addUser(User user) {
        usersList.add(user);
    }

    public User updateUser(User user) {
        for(User ul : usersList){
            if(ul.getId().equals(user.getId())){
                ul.setName(user.getName());
                ul.setAddress(user.getAddress());
                return ul;
            }
        }
        return new User();
    }

    public User deleteUser(String id) {
        Optional<User> first = usersList.stream().
                filter(u -> u.getId().equals(id))
                .findFirst();
        if(first.isPresent()){
            User user = first.get();
            usersList.remove(user);
            return user;
        }
        else{
            return new User();
        }
    }
}
