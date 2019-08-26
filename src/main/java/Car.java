class Car {
    private String color;
    String make;
    String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void honk(){
        System.out.println("Beep Beep... says "+make+" "+model);
    }

    public void start(){
        System.out.println(make+" "+model+" started");
    }


}
