package com.example.kontrolna_tacka1.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.kontrolna_tacka1.entity.*;
public interface AdministratorRepository extends JpaRepository<Administrator,Long>{
	
	Administrator findByUserNameAndPassword(String userName,String password);

}
