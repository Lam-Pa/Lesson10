public class CarModel {
    private String name;
    private String country;
    private int horsepower;

    public static  class Builder {
        private CarModel newCarModel;

        public Builder() {
            newCarModel = new CarModel();
        }
        public Builder withName(String name){
            newCarModel.name = name;
            return this;
        }
        public  Builder withCountry(String country){
            newCarModel.country = country;
            return this;
        }
        public  Builder withHorsePower(int horsePower){
            newCarModel.horsepower = horsePower;
            return this;
        }

        public CarModel build(){
            return newCarModel;
        }
    }

}
