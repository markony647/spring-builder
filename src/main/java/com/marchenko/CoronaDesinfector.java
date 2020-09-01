package com.marchenko;

public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;

    @InjectByType
    private Policeman policeman;

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
