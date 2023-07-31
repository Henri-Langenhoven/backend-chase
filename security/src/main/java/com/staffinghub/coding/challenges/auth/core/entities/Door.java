package com.staffinghub.coding.challenges.auth.core.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Door {

    private long id;
    private String type;
    private String location;
    private State state;

    public Door(long id, String type, String location, State state) {
        this.id = id;
        this.type = type;
        this.location = location;
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Door)) return false;
        Door d = (Door) o;
        return d.getId() == this.id
                && d.getType() != null
                && d.getType().equals(this.getType())
                && d.getLocation() != null
                && d.getLocation().equals(this.location)
                && d.getState() == this.state;
    }

}
