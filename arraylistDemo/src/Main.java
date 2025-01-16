import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ArrayList arrayList = new ArrayList();
//        arrayList.add("İstanbul");
//        arrayList.add("Ankara");
//        arrayList.add("İzmir");
//        arrayList.add(10);
//
//        System.out.println(arrayList.get(2)); //indexteki değeri getirir
//        arrayList.remove(1);
//
//        arrayList.set(0 , "Adana"); // indexteki değeri değiştirir
//        System.out.println(arrayList);
//
//        for(Object i : arrayList) {
//            System.out.println(i);
//        }

        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer Irem = new Customer("İrem" , "Taştepe" , 1);
        customers.add(Irem);
        //customers.add(new Customer("İrem" , "Taştepe" , 1));
        customers.add(new Customer("Eray" , "Taştepe" , 2));
        customers.add(new Customer("Meryem" , "Taştepe" , 3));


        customers.remove(Irem);


       for (Customer customer : customers) {
           System.out.println(customer.isim);
        }




    }
}