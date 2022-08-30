class Entertainment{  
void play(){System.out.println("For ENTERTAINMENT");}  
}  
class Tv extends Entertainment{  
void play(){System.out.println("Live Video Playing!");}  
}  
class Dvd extends Entertainment{  
void play(){System.out.println("Recorded Video Playing!");}  
}  
class Radio extends Entertainment{  
void play(){System.out.println("Audio Playing!");}  
}  
class DynamicPoly2{  
public static void main(String[] args){  
Entertainment a;  
a=new Tv();  
a.play();  
a=new Dvd();  
a.play();  
a=new Radio();  
a.play();  
}}
