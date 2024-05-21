package org.engcia.model;

import org.engcia.triage.Triage;

public class Conclusion extends Fact{
    public static final String RED = "Red";
    public static final String ORANGE = "Orange";
    public static final String YELLOW = "Yellow";
    public static final String GREEN = "Green";
    public static final String BLUE = "Blue";
    public static final String UNKNOWN = "Estás com sorte";

    private String description;

    public Conclusion(String description) {
        this.description = description;
        Triage.agendaEventListener.addRhs(this);
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return ("Conclusion: " + description);
    }

}
