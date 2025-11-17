package Recursion;

public class Plant {
    String species;
    int height;
    int age;

    public Plant(String species, int height, int age) {
        this.species = species;
        this.height = height;
        this.age = age;
    }
    public String photosynthesize (int sunlightHours){
        if(sunlightHours > 12){
            return "Too much sunlight!";
        } else if (sunlightHours >= 8) {
            return "Healthy growth!";
            
        }else{
            return "Needs more sunlight!";
        }
    }
    String absorbWater (int waterAmount){
        if (waterAmount > 2){
            return "Overwatered!";
        } else if (waterAmount >= 1) {
            return "Perfectly watered!";ㅎ
        }else{
            return "Needs more water!";
        }
    }


}

