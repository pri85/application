package com.example.project;

public class ChildModel {
        private  int hero_image;
        private String movieName;
        private String director;
        private String genre, language, ageLimit;

        public ChildModel(int hero_image, String movieName, String director, String  genre,String language, String ageLimit){
            this.hero_image = hero_image;
            this.movieName = movieName;
            this.director = director;
            this.genre = genre;
            this.language= language;
            this.ageLimit=ageLimit;
        }
        public int getHeroImage() {
            return hero_image;
        }
        public String getMovieName() {
            return movieName;
        }

    public int getHero_image() {
        return hero_image;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getAgeLimit() {
        return ageLimit;
    }
}
