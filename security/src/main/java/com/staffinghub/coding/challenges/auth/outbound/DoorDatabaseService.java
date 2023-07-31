package com.staffinghub.coding.challenges.auth.outbound;

import com.staffinghub.coding.challenges.auth.core.entities.Door;
import com.staffinghub.coding.challenges.auth.core.entities.State;
import com.staffinghub.coding.challenges.auth.core.outbound.DoorDatabaseProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoorDatabaseService implements DoorDatabaseProvider {

    private static List<Door> doors;

    public DoorDatabaseService() {
        doors = new ArrayList<>() {
            {
                add(new Door(1, "fireproof", "Basement 5.3", State.LOCKED));
                add(new Door(2, "normal", "Office 3.1.2", State.UNLOCKED));
                add(new Door(2, "normal", "Office 3.1.3", State.LOCKED));
            }
        };
    }

    @Override
    public List<Door> readDoors() {
        return doors;
    }

    @Override
    public Door changeDoorState(Door door) {
        Optional<Door> doorToChange = doors.stream().filter(d -> d.getId() == door.getId()).findFirst();
        if (doorToChange.isEmpty()) return null;
        doorToChange.get().setState(door.getState());
        return doorToChange.get();
    }

}
