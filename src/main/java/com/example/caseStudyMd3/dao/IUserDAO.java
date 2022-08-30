package com.example.caseStudyMd3.dao;

import com.example.caseStudyMd3.model.qa.Users;

public interface IUserDAO extends dao.IDAO<Users> {
    String findPassByAccount(String account, String email);
    boolean updateByUser(String account,Users users);
    int findByUser(Users users);
}
