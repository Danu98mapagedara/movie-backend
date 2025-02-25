package com.example.demo.service;

import com.example.demo.dto.BookingRequestDTO;
import com.example.demo.modal.BookingDetails;
import com.example.demo.repo.BookingDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingDetailsRepo bookingDetailsRepo;
    public String bookingMovie(BookingDetails bookingDetails){
        System.out.println(bookingDetails.getSeatNumbers());
        bookingDetailsRepo.save(bookingDetails);
        return "Boook done";
    }

    public String getSeats(String movie) {
        return  bookingDetailsRepo.getSeats(movie);

    }
}
