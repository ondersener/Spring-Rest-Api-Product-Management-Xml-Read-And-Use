package com.works.restcontrollers;


import com.works.entities.Admin;
import com.works.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminRestController {

    final AdminService adminService;
    final HttpServletRequest req;

    @PostMapping("/login")
    public boolean login(@RequestBody Admin admin){


        req.getSession().setAttribute("admin",admin);

        return adminService.login(admin.getEmail(),admin.getPassword());
    }

}
