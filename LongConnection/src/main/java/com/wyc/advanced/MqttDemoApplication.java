package com.wyc.advanced;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqttDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqttDemoApplication.class, args);

        test();
    }


    private static void test(){
        MqttPushClient.MQTT_HOST = "tcp://172.19.1.230:1883";
        MqttPushClient.MQTT_CLIENTID = "client";
        MqttPushClient.MQTT_USERNAME = "username";
        MqttPushClient.MQTT_PASSWORD = "password";
        MqttPushClient client = MqttPushClient.getInstance();
//        client.publish("123","hello ,world!!");
        client.subscribe("123");
    }
}