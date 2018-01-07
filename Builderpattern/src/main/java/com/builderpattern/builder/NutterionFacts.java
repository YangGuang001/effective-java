package com.builderpattern.builder;

/**
 * Created by yz on 2018/1/7.
 */
public class NutterionFacts {
    private final int servingSize;
    private final int serings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int serings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int serings) {
            this.servingSize = servingSize;
            this.serings = serings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutterionFacts build() {
            return new NutterionFacts(this);
        }
    }

    private NutterionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.serings = builder.serings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutterionFacts{" +
                "servingSize=" + servingSize +
                ", serings=" + serings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {
        NutterionFacts facts = new NutterionFacts.Builder(240, 8)
                .calories(100).sodium(35).calories(100).build();
        System.out.println(facts.toString());
    }
}
