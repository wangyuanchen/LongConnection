package com.wyc.advanced;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping(value = "/inform")
    public void inform(){
        MqttPushClient client = MqttPushClient.getInstance();
        client.publish("123","hello ,world!!");
    }
}
