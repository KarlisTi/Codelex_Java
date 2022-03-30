//package io.codelex.oop2.summary.LazyBox;
//
//import java.util.InputMismatchException;
//
//public class mainClass {
//    public static void main(String[] args) {
//
//        LazyBox<Integer> box = new LazyBox<>(mainClass::doLargeCalculation);
//        LazyBox<String> textBox = box.map(Object::toString);
//        LazyBox<String> upperTextBox = textBox.map(String::toUpperCase);
//
//
//        String result = fullTextBox.get();
//        System.out.println(result);
//
//        LazyBox <String> textBox = box.map();
//    }
//
//
//    public static Integer doLargeCalculation() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//        return 153;
//    }
//
//    public static <A> void printOutBoxContents(LazyBox<A> box) {
//        System.out.println(box.get());
//    }
//
//}
