package com.msn.controller;

import com.msn.domain.Room;
import com.msn.domain.User;
import com.msn.service.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
@Slf4j
public class RoomController {

    @Autowired
    private RoomService roomService;


    @GetMapping
    public List<Room> getRooms(){
        return roomService.getAllRooms();
    }

    @GetMapping("/user/{id}")
    public List<Room> getRooms(@PathVariable("id") User user){
        return roomService.getAllUserRooms(user);
    }

    @GetMapping("/{id}")
    public Room getRoom(@PathVariable("id") Room room){
        return room;
    }

    @PostMapping
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    @PutMapping("{id}")
    public Room updateRoom(@PathVariable("id") Room messageFromDb,
                          @RequestBody Room message) {
        BeanUtils.copyProperties(message, messageFromDb, "id");
        return roomService.updateRoom(messageFromDb);
    }

    @DeleteMapping("{id}")
    public void deleteRoom(@PathVariable("id") Room room) {
        roomService.deleteRoom(room);
    }
}
