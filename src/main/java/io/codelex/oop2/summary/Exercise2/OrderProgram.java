//package io.codelex.oop2.summary.Exercise2;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class OrderProgram {
//    public static void main(String[] args) {
//        Order order = new Order();
//
//        FoodItem firstFoodItem = new FoodItem("Bananas", BigDecimal.valueOf(5.00), LocalDate.of(2022, 4, 1));
//        ElectronicsItem firstElectronicsItem = new ElectronicsItem("Laptop", BigDecimal.valueOf(300.00), "300W");
//        HouseholdItem newHouseholdItem = new HouseholdItem("saw", BigDecimal.valueOf(10.50), "Red");
//
//        order.addItem(firstFoodItem);
//        order.addItem(firstElectronicsItem);
//        order.addItem(newHouseholdItem);
//
//        Invoice newInvoice = new Invoice("INV213", order);
//
//        System.out.println(firstElectronicsItem.fullInfo());
//
//    }
//}
