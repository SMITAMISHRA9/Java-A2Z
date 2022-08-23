class Encapsulation {
    private String name;
    public String setName(){
        return name;
    }
    public String getName(String n){
        this.name=n;
        System.out.println(this.name);
        return n;
    }
    public static void main(String[] args) {
        Encapsulation hw=new Encapsulation();
        hw.getName("Smita");
    }
}