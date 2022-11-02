package threads.atmExample;

import java.util.Objects;

public class Benificiary {
    public String name;
    public int requiredAmount;

    public Benificiary(){

    }
    public Benificiary(String name, int requiredAmount) {
        this.name = name;
        this.requiredAmount = requiredAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benificiary that = (Benificiary) o;
        return requiredAmount == that.requiredAmount && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, requiredAmount);
    }

    @Override
    public String toString() {
        return "Benificiary{" +
                "name='" + name + '\'' +
                ", requiredAmount=" + requiredAmount +
                '}';
    }
}
