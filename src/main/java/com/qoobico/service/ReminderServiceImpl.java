package com.qoobico.service;

import com.qoobico.entity.Remind;
import com.qoobico.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements RemindService{

    @Autowired
    RemindRepository repository;
    public List<Remind> findAll() {
        return repository.findAll();
    }

    public Remind findOne(long remindId) {
        return repository.findOne(remindId);
    }

    public Remind saveAndFlush(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void delete(long id) {
         repository.delete(id);
    }
}
