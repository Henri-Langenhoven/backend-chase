package com.staffinghub.coding.challenges.auth.core.logic;

import com.staffinghub.coding.challenges.auth.core.entities.Door;
import com.staffinghub.coding.challenges.auth.core.inbound.DoorProvider;
import com.staffinghub.coding.challenges.auth.core.outbound.DoorDatabaseProvider;

import java.util.List;

public class DoorService implements DoorProvider {

    private final DoorDatabaseProvider doorDatabaseProvider;

    public DoorService(DoorDatabaseProvider doorDatabaseProvider) {
        this.doorDatabaseProvider = doorDatabaseProvider;
    }

    @Override
    public List<Door> triggerDoorListing() {
        return this.doorDatabaseProvider.readDoors();
    }

    @Override
    public Door triggerDoorStateChange(Door door) {
        if (door.getId() <= 0 || door.getState() == null) return null;
        return this.doorDatabaseProvider.changeDoorState(door);
    }

}
