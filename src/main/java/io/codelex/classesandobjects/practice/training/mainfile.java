package io.codelex.classesandobjects.practice.training;//package io.codelex.training.main;
//
//import org.json.JSONObject;
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.BigDecimal;
//import java.net.URL;
//import java.util.Map;
//import java.util.Scanner;
//
//public class mainfile {
//    public static void main(String[] args) throws IOException {
//        String exchangeRateRawData = getExchangeRates();
//        JSONObject exchangeRateObject = new JSONObject(exchangeRateRawData);
//        JSONObject rates = (JSONObject) exchangeRateObject.get("rates");
//        Map <String,Object > rateValues = rates.toMap();
//
//        CurrencyRate[] allRates = new CurrencyRate[rateValues.size()];
//        int i=0;
//        for (Map.Entry<String, Object>valuePair: rateValues.entrySet()){
//            allRates[i] = new CurrencyRate(valuePair.getKey(),(BigDecimal) valuePair.getValue());
//            i++;
//        }
//        System.out.println("Please enter currency to convert to:");
//        Scanner input = new Scanner(System.in);
//        String currency = input.nextLine();
//
//
//        System.out.println(exchangeRateRawData);
//    }
//
//    public static String getExchangeRates() throws IOException {
//
//        String theURL = "https://api.exchangerate.host/latest";
//        URL url = new URL(theURL);
//        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
//        StringBuilder inputData = new StringBuilder();
//        String inputLine;
//        while ((inputLine = in.readline()) != null) {
//            inputData.append(inputLine);
//        }
//
//        return inputData.toString();
//
//
//    }
//}
