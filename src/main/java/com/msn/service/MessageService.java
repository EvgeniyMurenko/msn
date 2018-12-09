package com.msn.service;


import com.msn.domain.Message;
import com.msn.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;


    public List<Message> getAllMessage() {
        return messageRepository.findAll();
    }

    public Message createMessage(Message message){
        return messageRepository.save(message);
    }

    public Message getOneMessage(Long id) {
        return messageRepository.findById(id).get();
    }

    public Message updateMessage(Message messageFromDb) {
        return messageRepository.save(messageFromDb);
    }

    public void deleteMessage(Message message) {
        messageRepository.delete(message);
    }
}
