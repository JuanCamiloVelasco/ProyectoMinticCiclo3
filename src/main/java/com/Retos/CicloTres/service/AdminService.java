/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Retos.CicloTres.service;

import com.Retos.CicloTres.model.Admin;
import com.Retos.CicloTres.repository.AdminRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    public List<Admin> getAll(){
        return  adminRepository.getAll();
    }
    public Optional<Admin> getAdmin(int id){
        return adminRepository.getAdmin(id);
    }

    public Admin save(Admin administrador){
        if(administrador.getIdAdmin()==null){
            return adminRepository.save(administrador);
        }else{
            Optional<Admin> paux=adminRepository.getAdmin(administrador.getIdAdmin());
            if(paux.isEmpty()){
                return adminRepository.save(administrador);
            }else{
                return administrador;
            }
        }
    }
}
