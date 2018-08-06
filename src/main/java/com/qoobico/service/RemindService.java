package com.qoobico.service;

import com.qoobico.entity.Remind;

import java.util.List;

public interface RemindService {
    List<Remind> findAll();
    Remind findOne( long remindId);
    Remind saveAndFlush(Remind remind);
    void delete(long id);
}
