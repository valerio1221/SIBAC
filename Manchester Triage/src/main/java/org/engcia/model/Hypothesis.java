package org.engcia.model;

import org.engcia.triage.Triage;

public class Hypothesis extends Fact{
    private String description;
    private String value;

    public Hypothesis(String description, String value) {
        this.description = description;
        this.value = value;
        Triage.agendaEventListener.addRhs(this);
    }

    public String getDescription() {
        return description;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return (description + " = " + value);
    }
}