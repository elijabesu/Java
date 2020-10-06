package com.saurichable;

public class Archive {
    private String id;
    private String name;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals(Object object) {
        if (this == object) { return true; }
        if (!(object instanceof Archive)) { return false; }
        Archive archive = (Archive) object;
        if (this.id.equals(archive.id)) { return true; }
        return false;
    }
    public String toString() {
        return this.id + ": " + this.name;
    }
}
