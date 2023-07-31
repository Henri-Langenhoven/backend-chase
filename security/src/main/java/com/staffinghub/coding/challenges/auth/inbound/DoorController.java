package com.staffinghub.coding.challenges.auth.inbound;

import com.staffinghub.coding.challenges.auth.core.entities.Door;
import com.staffinghub.coding.challenges.auth.core.inbound.DoorProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/door")
public class DoorController {

    private final DoorProvider doorProvider;

    public DoorController(DoorProvider doorProvider) {
        this.doorProvider = doorProvider;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Door>> listDoors() {
        return ResponseEntity.ok(this.doorProvider.triggerDoorListing());
    }

    @PostMapping
    public ResponseEntity changeDoorState(@RequestBody Door door) {
        Door newDoor = this.doorProvider.triggerDoorStateChange(door);
        return newDoor == null ? ResponseEntity.badRequest().build() : ResponseEntity.ok(newDoor);
    }

}
