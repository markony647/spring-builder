package com.marchenko;

import com.marchenko.model.Room;
import com.marchenko.service.CoronaDesinfector;
import com.marchenko.service.Policeman;
import com.marchenko.service.PolicemanImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.marchenko", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector coronaDesinfector = context.getObject(CoronaDesinfector.class);
        coronaDesinfector.start(new Room());


    }
}
