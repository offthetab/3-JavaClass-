package ru.mirea.lab4;

public class _4_task1 {
    public enum Seasons {
        FALL(7.67),
        WINTER(-10.1),
        SPRING(13.23),
        SUMMER(25.7){
            @Override
            public String getDescription(Seasons season){
                return "Теплое время года";
            }
        };

        private final double tempetature;
        private Seasons(double tempetature){
            this.tempetature = tempetature;
        }


        public void season_i_like(Seasons season){
            switch (season){
                case FALL: System.out.println("Я люблю осень"); break;
                case WINTER: System.out.println("Я люблю зиму"); break;
                case SPRING: System.out.println("Я люблю весну"); break;
                case SUMMER: System.out.println("Я люблю лето"); break;

            }
        }
        public String getDescription(Seasons season){
            return "Холодное время года";
        }

    }

    public static void main(String[] args){
        Seasons fav_season = Seasons.FALL;
        System.out.println("My fav season is: " + fav_season + "\n" +
                "Season descripton: " + fav_season.getDescription(fav_season) + "\n" +
                "Average tempetature in " + fav_season + " is: " + fav_season.tempetature);

        System.out.println("\n" + "Output all the values: ");
        for(Seasons seasons : Seasons.values()){
            System.out.println("season: " + seasons + "\n" + seasons + " description: " +
                    seasons.getDescription(seasons) + "\n" + seasons + " average temperature: "
                    + seasons.tempetature + "\n");


        }
    }
}
