package com.example.my_game.controller;

import com.example.my_game.JsonReaderUtil;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.Map;

@RestController
public class MyController {

    @RequestMapping("/api/game/{gameid}")
    public Map<String, Object> test(@PathVariable("gameid") Integer gameid) throws FileNotFoundException, ParseException {
        String fileName = String.format("E:\\spring_projects\\my_game\\src\\main\\resources\\gamedata%d.json", gameid);
        return JsonReaderUtil.getMapFromJson(fileName);
    }


}
