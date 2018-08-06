package com.qoobico.controller;

import com.qoobico.entity.Remind;
import com.qoobico.service.RemindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Ctrl+Alt+O-удаляет все ненужные импорты
 * Аннотация @RestController говорит нам о том,
 * что этот контроллер будет возвращать только json объекты
 */
@RestController
/**
 * RequestMapping можно и не указывать.Он будет по умолчанию.
 */
public class RemindController {
    /**Юзать доступ к jpa прямо с контроллера не есть хорошо,поэтому все помещают в папку service*/
    @Autowired
    private RemindService repository;
    /**
     * Как обратиться к методу
     * ResponseBody-то,что ты вернешь
     */
    /**Этот получает всех*/
    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public  List<Remind> getAllReminders(ModelMap modelMap){
        return repository.findAll();
    }
    /**Этот получает один*/
    @RequestMapping(value = "/reminders/{id}",method = RequestMethod.GET)
    @ResponseBody
    public  Remind getReminder(@PathVariable("id") long remindId){
        return repository.findOne(remindId);
    }
    /**Этот сохраняет объект*/
    @RequestMapping(value = "/reminders",method = RequestMethod.POST)
    @ResponseBody
    public  Remind saveReminder(@RequestBody Remind remind){
        return repository.saveAndFlush(remind);
    }
    /**Этот удаляет объект*/
    @RequestMapping(value = "/reminders/{id}",method = RequestMethod.POST)
    @ResponseBody
    public  void delete(@PathVariable("id") long Id){
        repository.delete(Id);
    }
}
