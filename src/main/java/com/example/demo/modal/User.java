package com.example.demo.modal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String email;
    private String phoneNumber;

    @ManyToMany(mappedBy = "users")
    private List<Seat> seats;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

}
