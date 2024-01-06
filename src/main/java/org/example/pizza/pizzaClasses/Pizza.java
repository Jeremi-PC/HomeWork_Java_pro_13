package org.example.pizza.pizzaClasses;

public class Pizza {
    private boolean isThin;
    private boolean isTomato;
    private boolean isSalami;
    private boolean isPineapple;
    private boolean isOnion;

    public Pizza(boolean isThin, boolean isTomato, boolean isSalami, boolean isPineapple, boolean isOnion) {
        this.isThin = isThin;
        this.isTomato = isTomato;
        this.isSalami = isSalami;
        this.isPineapple = isPineapple;
        this.isOnion = isOnion;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "isThin = " + isThin +
                ", isTomato = " + isTomato +
                ", isSalami = " + isSalami +
                ", isPineapple = " + isPineapple +
                ", isOnion = " + isOnion +
                '}';
    }

    public static class Builder {
        private boolean isThin;
        private boolean isTomato;
        private boolean isSalami;
        private boolean isPineapple;
        private boolean isOnion;

        public Builder isThin(boolean isThin) {
            this.isThin = isThin;
            return this;
        }

        public Builder isTomato(boolean isTomato) {
            this.isTomato = isTomato;
            return this;
        }

        public Builder isSalami(boolean isSalami) {
            this.isSalami = isSalami;
            return this;
        }

        public Builder isPineapple(boolean isPineapple) {
            this.isPineapple = isPineapple;
            return this;
        }

        public Builder isOnion(boolean isOnion) {
            this.isOnion = isOnion;
            return this;
        }

        public Pizza build() {
            return new Pizza(isThin, isTomato, isSalami, isPineapple, isOnion);
        }

    }
}
