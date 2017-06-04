package com.shenchao.controller;

import com.shenchao.dao.User;
import com.shenchao.service.UserService;

import java.io.IOException;

/**
 * Created by shenchao on 17/5/24.
 */
@javax.servlet.annotation.WebServlet(name = "HelloServlet",urlPatterns = "/hello")
public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        UserService userService = new UserService();
        userService.addUser(new User("天天超1","123456"));
        userService.addUser(new User("天天超4","123456"));
        userService.addUser(new User("天天超2","123457"));
        userService.addUser(new User("天天超3","123458"));
        request.setAttribute("users",userService.getUsers());
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
