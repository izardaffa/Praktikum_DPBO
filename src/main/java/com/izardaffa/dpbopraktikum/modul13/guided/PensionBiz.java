package com.izardaffa.dpbopraktikum.modul13.guided;

import java.util.ArrayList;
import java.util.HashMap;

public class PensionBiz implements IPensionBiz {
    private ArrayList<HashMap<String, Object>> roomData;

    public PensionBiz() {
        roomData = new ArrayList<>();
    }

    @Override
    public void initializeRoomData() {
        roomData.clear();
        roomData.add(createRoom("101", new Standard()));
        roomData.add(createRoom("102", new Standard()));
        roomData.add(createRoom("103", new Standard()));
        roomData.add(createRoom("104", new Suite()));
        roomData.add(createRoom("105", new Suite()));
    }

    private HashMap<String, Object> createRoom(String roomId, RoomType room) {
        HashMap<String, Object> roomMap = new HashMap<>();
        roomMap.put(roomId, room);
        return roomMap;
    }

    @Override
    public void checkIn(String roomId, String custName, String custPhone) throws Exception {
        for (HashMap<String, Object> room : roomData) {
            if (room.containsKey(roomId)) {
                if (room.containsKey("Guest")) {
                    throw new Exception("AlreadyReservedException: Room is already reserved.");
                }
                room.put("Guest", new Customer(custName, custPhone));
                System.out.println("Check-in successful: " + roomId);
                return;
            }
        }
        throw new Exception("RoomNotFoundException: Room ID not found.");
    }

    @Override
    public void checkOut(String roomId) throws Exception {
        for (HashMap<String, Object> room : roomData) {
            if (room.containsKey(roomId)) {
                if (!room.containsKey("Guest")) {
                    throw new Exception("AlreadyCheckoutException: Room is not reserved.");
                }
                room.remove("Guest");
                System.out.println("Check-out successful: " + roomId);
                return;
            }
        }
        throw new Exception("RoomNotFoundException: Room ID not found.");
    }

    @Override
    public void roomList() {
        for (HashMap<String, Object> room : roomData) {
            for (String key : room.keySet()) {
                if (key.equals("Guest")) continue;
                System.out.print("Kamar " + key + " : " + room.get(key));
                if (room.containsKey("Guest")) {
                    System.out.print(" " + room.get("Guest"));
                }
                System.out.println();
            }
        }
    }
}
