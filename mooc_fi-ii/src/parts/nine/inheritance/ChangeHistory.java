package parts.nine.inheritance;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.size() == 0) return 0;
        double max = history.get(0);
        for (double number: history) {
            if (max < number) max = number;
        }
        return max;
    }

    public double minValue() {
        if (history.size() == 0) return 0;
        double min = history.get(0);
        for (double number: history) {
            if (min > number) min = number;
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (double number: history) {
            sum += number;
        }
        return sum / history.size();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
