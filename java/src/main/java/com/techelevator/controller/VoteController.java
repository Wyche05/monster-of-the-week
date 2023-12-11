package com.techelevator.controller;


import com.techelevator.dao.UserDao;
import com.techelevator.dao.VoteDao;
import com.techelevator.model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/vote")
@PreAuthorize("isAuthenticated()")
public class VoteController {

    private VoteDao voteDao;
    private UserDao userDao;

    public VoteController(VoteDao voteDao, UserDao userDao) {
        this.voteDao = voteDao;
        this.userDao = userDao;
    }

//    @RequestMapping


    


}
