package com.example.gsonprogramexample.controller;

import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class GsonController {

    @GetMapping(value = "/hello")
    public String hello() {
        JsonObject jdata = new JsonObject();

        jdata.addProperty("nickname","magic");
        jdata.addProperty("rank", "1");

        return jdata.toString();
    }
}
