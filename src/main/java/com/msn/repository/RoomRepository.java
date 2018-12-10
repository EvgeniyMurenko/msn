package com.msn.repository;

import com.msn.domain.Room;
import com.msn.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findAllByUsers(User user);
}
