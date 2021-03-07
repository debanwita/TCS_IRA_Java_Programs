import java.util.*;
import java.lang.*;
class Phone{
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phone_id,String os,String brand,int price){
        this.phoneId = phone_id;
        this.os = os;
        this.brand= brand;
        this.price = price;
    }
    public void setPhoneId(int id){
        phoneId = id;
    }
    public void setPhoneOs(String os){
        this.os = os;
    }
    public void setPhoneBrand(String brand){
        this.brand = brand;
    }
    public void setPhonePrice(int price){
        this.price = price;
    }

    public int getPhoneId(){
        return this.phoneId;
    }
    public String getOs(){
        return this.os;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getPrice(){
        return this.price;
    }
}
public class Solution6 {
    private static int findPriceForGivenBrand(Phone[] phones, String brand){
        int price=0;
        for(int i=0;i<phones.length;i++){
            if(phones[i].getBrand().equalsIgnoreCase(brand)){
                price += phones[i].getPrice();
            }
        }
        return price;
    }

    private static Phone getPhoneIdBasedOnOs(String os,Phone[] phones){
        Phone ph = null;
        for(int i=0;i<4;i++){
            if(phones[i].getOs().equalsIgnoreCase(os) && phones[i].getPrice()>=50000){
                ph = phones[i];
                break;
            }
        }
        return ph;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Phone phones[] = new Phone[4];
        for(int i=0;i<4;i++){
            phones[i] = new Phone(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        }
        String brand = sc.next();
        String os = sc.next();

        int p = findPriceForGivenBrand(phones,brand);
        if(p>0){
            System.out.println(p);
        }
        else{
            System.out.println("The given Brand is not available");
        }

        Phone ph = getPhoneIdBasedOnOs(os,phones);
        if(ph!=null){
            System.out.println(ph.getPhoneId());
        }
        else{
            System.out.println("No phones are available with specified os and price range");
        }
    }
}
