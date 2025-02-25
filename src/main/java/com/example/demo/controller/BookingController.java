package com.example.demo.controller;

import com.example.demo.dto.BookingRequestDTO;
import com.example.demo.modal.BookingDetails;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/movies/booking")
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public String bookMovie(@RequestBody BookingDetails bookingDetails){
       bookingService.bookingMovie(bookingDetails);
        return  "Booking  success";
    }

    @GetMapping("/seats/{movie}")
    public ResponseEntity<String> getSeats(@PathVariable String movie) {
       String seats = bookingService.getSeats(movie);

        if (seats == null || seats.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("");
        }

        return ResponseEntity.ok(seats);
    }


}
