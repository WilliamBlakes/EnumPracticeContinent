package org.example;

public enum Continent {
    AFRICA(1340598000, 30370000),
    ASIA(4600000000L, 44579000),
    EUROPE(747600000, 10180000),
    NORTH_AMERICA(592072000, 24709000),
    SOUTH_AMERICA(431000000, 17840000),
    ANTARCTICA(1106, 14000000),
    AUSTRALIA(42678000, 8600000);

    private final double  population;
    private final double  area;

    Continent(double  population, double  area){
        this.area = area;
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public double getPopulation() {
        return population;
    }

    public double getPopulationDensity(){
        return population / area;
    }
}
