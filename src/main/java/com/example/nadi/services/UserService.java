package com.example.nadi.services;

import com.example.nadi.entities.User;

interface UserService {
    //POST /user/signuo
    User registerUser(String email, String password, String role);
    //POST /user/signin
    User loginUser(String email, String password);
    //PUT /user/role/{ROLE} donde ROLE puede ser admin, consumidor..etc
    void assignRole(User user, String role);
    //PUT /user/block/{user_id}
    void blockUser(User user);
    //PUT /user/unblock/{user_id}
    void unblockUser(User user);
    //GET /user/block/{user_id}
    boolean isUserBlocked(User user);
}
