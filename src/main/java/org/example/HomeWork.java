package org.example;

public class HomeWork {
    public static void main(String[] args) {
        //Манипуяций с математическими операторами
        // 3x^2-18x+28=0
         int a=3,b=-18,c=28;
         double D;
         D = Math.pow(b,2) - 4*a*c;

        System.out.println("Дискриминант равен = "+D);
        System.out.println("D/3 = "+D/3);
        System.out.println("D%5 = "+D%5);

        //Манипуляций с логическими операторами
        if(D==-12 && D < 0){
            System.out.println("Дискриминант равен = -12 и меньше нуля");
        } else {
            System.out.println("Дискриминант не равен = -12");
        }

        String name = "Anuar";
        String lastName = "Omar";

        if (name.length() >= 5 || lastName.length() == name.length()){
            System.out.println(name + " <- больше на одну букву чем -> " + lastName);
        } else if(name.length() <5 || lastName.length() == 4){
            System.out.println(lastName + "меньше на одну букву чем ->" + name);
        }

        if(name !=null && lastName == "Omar"){
            System.out.println("name = "+ name +"\nlastname = "+ lastName);
        }
    }
}
