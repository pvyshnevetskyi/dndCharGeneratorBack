package com.example.dndCharCreator.entity.enums;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = RaceDeserializer.class)
public enum Race {
    ELF,
    GNOME,
    DRAGONBORN,
    DWARF,
    HALFELF,
    HUMAN,
    HALFORC,
    HALFLING,
    TIEFLING,
    EMPTY;


    public static Race fromString(String raceString) {
        if (raceString == null || raceString.isEmpty()) {
            return EMPTY;
        }
        return Race.valueOf(raceString.toUpperCase());
    }
}
