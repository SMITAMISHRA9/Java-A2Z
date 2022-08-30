class DomesticAnimal{  
void say(){System.out.println("Sound of Animal");}  
}  
class Cow extends DomesticAnimal{  
void say(){System.out.println("Moo");}  
}  
class Monkey extends DomesticAnimal{  
void say(){System.out.println("Screech");}  
}  
class Elephant extends DomesticAnimal{  
void say(){System.out.println("Trumpet");}  
}  
class DynamicPoly1{  
public static void main(String[] args){  
DomesticAnimal a;  
a=new Cow();  
a.say();  
a=new Monkey();  
a.say();  
a=new Elephant();  
a.say();  
}}
