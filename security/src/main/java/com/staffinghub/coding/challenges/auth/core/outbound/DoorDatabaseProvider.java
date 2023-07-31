package com.staffinghub.coding.challenges.auth.core.outbound;

import com.staffinghub.coding.challenges.auth.core.entities.Door;

import java.util.List;

public interface DoorDatabaseProvider {

    List<Door> readDoors();

    Door changeDoorState(Door door);

}
