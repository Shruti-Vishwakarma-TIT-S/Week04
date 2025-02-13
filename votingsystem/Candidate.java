package com.collections.votingsystem;

import java.util.Objects;

public class Candidate {
    private String name;

    // Constructor
    public Candidate(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Candidate candidate = (Candidate) obj;
        return name.equals(candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
