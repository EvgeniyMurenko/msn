package com.msn.service;

import com.msn.domain.Room;
import com.msn.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;


    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(Room messageFromDb) {
        return roomRepository.save(messageFromDb);
    }

    public void deleteRoom(Room room) {
        roomRepository.delete(room);
    }
}
