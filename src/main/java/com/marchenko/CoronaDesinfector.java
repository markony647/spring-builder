package com.marchenko;

public class CoronaDesinfector {

    private final Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private final Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вон!!!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Можете вернутся в комнату!!!");
    }

    private void disinfect(Room room) {
        System.out.println("Зачитывается молитва: корона изыди! Вирус побежден!");
    }
}
