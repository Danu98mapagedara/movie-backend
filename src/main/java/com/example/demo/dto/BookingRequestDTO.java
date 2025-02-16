package com.example.demo.dto;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class BookingRequestDTO {
    private Long movieId;
    private String movieName;
    private String watchDate;
    private String showTime;
    private String username;
    private String userEmail;
    private String mobileNumber;
    private String seatNumber;
}
