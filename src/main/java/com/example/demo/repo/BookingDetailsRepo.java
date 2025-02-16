package com.example.demo.repo;

import com.example.demo.modal.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailsRepo extends JpaRepository<BookingDetails,Long> {

    @Query(value = "SELECT GROUP_CONCAT(seat_numbers) FROM booking_details WHERE movie_name = ?1", nativeQuery = true)
    String getSeats(String movieName);
}
