package com.izardaffa.dpbopraktikum.modul13.guided;

public interface IPensionBiz {
    void initializeRoomData();
    void checkIn(String roomId, String custName, String custPhone) throws Exception;
    void checkOut(String roomId) throws Exception;
    void roomList();
}
