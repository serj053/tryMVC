package org.example.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*для того чтобы контейнер инверсии контроля распознал этот класс как бин(bean) используем @Controller*/
@Controller
public class HomeController {
    private Logger logger = Logger.getLogger(HomeController.class);
    /*по этому пути value="/home" из браузера будем делать запрос на наш сервер*/
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        logger.info("GET /home returns index.html");
        /*метод будет возвращать объект ModelAndView*/
        return new ModelAndView("home");
    }
}

