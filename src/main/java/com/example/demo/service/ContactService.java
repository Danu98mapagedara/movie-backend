package com.example.demo.service;


import com.example.demo.modal.ContactDetails;
import com.example.demo.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
private ContactRepository contactRepository;

    public  String Contact(ContactDetails contactDetails){
        contactRepository.save(contactDetails);
        return "Contact saved";
    }


}
