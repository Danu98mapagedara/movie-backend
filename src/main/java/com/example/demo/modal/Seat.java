package com.example.demo.modal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "seats")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long seatId;
    private String seatNumber;

    @ManyToMany
    private List<User> users;

    @ManyToMany
    private List<Movie> movies;
}

