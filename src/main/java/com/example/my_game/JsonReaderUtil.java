package com.example.my_game;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class JsonReaderUtil {

    public static Map<String, Object> getMapFromJson(String filePath) throws FileNotFoundException, ParseException {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<Map<String, Object>> typeReference = new TypeReference<Map<String, Object>>() {
        };
        FileReader reader = new FileReader(filePath);
        JSONParser obj = new JSONParser(reader);
        return objectMapper.convertValue(obj.parseObject(), typeReference);
    }
}