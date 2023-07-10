package com.works.services;


import com.works.entities.Admin;
import com.works.repositories.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {

    final HttpServletRequest req;
    private final AdminRepository adminRepository;

    public boolean login(String email,String password){
        /*if(admin.getEmail().equals("ali@mail.com") && admin.getPassword().equals("12345")){
            req.getSession().setAttribute("user",admin.getEmail());
            return true;
        }
         */

        Optional<Admin> optionalAdmin = adminRepository.findByEmailEqualsIgnoreCaseAndPasswordEquals(email,password);
        if(optionalAdmin.isPresent()){
            return true;
        }
        return false;
    }


}
