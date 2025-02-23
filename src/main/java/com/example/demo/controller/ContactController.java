package com.example.demo.controller;

import com.example.demo.modal.ContactDetails;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/movies/contact")
@CrossOrigin("*")

public class ContactController {
    @Autowired
    private ContactService contactService;
    @PostMapping
    public String Contact(@RequestBody ContactDetails contactDetails){
        String response;
        response = contactService.Contact(contactDetails);
        return response;

    }
    @GetMapping
    public List<ContactDetails> getAllContacts(){
       return contactService.getAllContacts();
    }
}
