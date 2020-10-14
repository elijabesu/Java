package parts.eight;

import java.util.Objects;

public class LicensePlate {
    private final String country;
    private final String number;

    public LicensePlate(String country, String number) {
        this.country = country;
        this.number = number;
    }

    @Override
    public String toString() {
        return country + " " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LicensePlate that = (LicensePlate) o;
        return country.equals(that.country) &&
                number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, number);
    }
}
