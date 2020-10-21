package parts.ten.comparable;

public class ClubMember implements Comparable<ClubMember> {
    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " (" + height + " cm)";
    }

    @Override
    public int compareTo(ClubMember o) {
        if (height == o.height) return 0;
        if (height > o.height) return 1;
        return -1;
        // or just easier
        // return height - o.height;
    }
}
