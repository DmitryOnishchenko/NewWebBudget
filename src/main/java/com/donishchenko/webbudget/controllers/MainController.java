package com.donishchenko.webbudget.controllers;

import com.donishchenko.webbudget.model.TestObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@Controller
// мапим наш REST на /myservice
@RequestMapping(value = "/myservice")
public class MainController {

    // этот метод будет принимать время методом GET и на его основе
    // отвечать клиенту
    @RequestMapping(value = "/{time}", method = RequestMethod.GET)
    @ResponseBody
    public TestObject getTestObject(@PathVariable long time) {
        return new TestObject(Calendar.getInstance(), "Это ответ медота GET!");
    }

    // этот метод будет принимать Объект MyDataObject и отдавать его клиенту
    // обычно метод PUT используют для сохранения либо для обновления объекта
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public TestObject putTestObject(@RequestBody TestObject obj) {
        return obj;
    }

    // этот метод будет методом POST отдавать объект MyDataObject
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public TestObject postTestObject() {
        return new TestObject(Calendar.getInstance(), "Это ответ метода POST!");
    }

    // этот метод будет принимать время методом DELETE
    // и на его основе можно удалит объект
    @RequestMapping(value = "/{time}", method = RequestMethod.DELETE)
    @ResponseBody
    public TestObject deleteTestObject(@PathVariable long time) {
        return new TestObject(Calendar.getInstance(), "Это ответ метода DELETE!");
    }
}
