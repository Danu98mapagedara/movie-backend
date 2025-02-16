package com.example.demo.controller;

import com.example.demo.dto.BookingRequestDTO;
import com.example.demo.modal.BookingDetails;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/movies/booking")
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public String bookMovie(@RequestBody BookingDetails bookingDetails){
        String response = bookingService.bookingMovie(bookingDetails);
        return  "Booking success";
    }

    @GetMapping("/seats")
    public List<Integer> getSeats(@RequestBody String movie){

        List<Integer> seats = bookingService.getSeats(movie);
        return null;
    }

}
