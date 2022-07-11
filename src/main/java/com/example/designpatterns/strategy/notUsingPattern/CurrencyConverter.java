package com.example.designpatterns.strategy.notUsingPattern;

import java.text.DecimalFormat;

import lombok.Data;

@Data
public class CurrencyConverter {

    public static void convertBrazilianReal(String destinationCurrency, Double value) {

        if (destinationCurrency != null) {
            Double conversionResult = 0.0;
            String coin = "";

            if (destinationCurrency.equals("DólarAmericano")) {

                conversionResult = value / 5.3;
                coin = "Dólar Americano";

            } else {

                if (destinationCurrency.equals("Euro")) {

                    conversionResult = value / 5.39;
                    coin = "Euro";

                } else {

                    if (destinationCurrency.equals("Libra")) {

                        conversionResult = value / 6.36;
                        coin = "Libra";

                    } else {

                        if (destinationCurrency.equals("FrancoSuíço")) {

                            conversionResult = value / 5.46;
                            coin = "Franco Suíço";

                        } else {

                            if (destinationCurrency.equals("PesoArgentino")) {

                                conversionResult = value / 0.04;
                                coin = "Peso Argentino";

                            } else {

                                try {
                                    throw new Exception("Moeda não encontrada");
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }

                            }

                        }

                    }

                }

            }

            if (!coin.equals("")) {
                DecimalFormat df = new DecimalFormat("0.00");
                System.out.println(value.toString() + " real to " + coin + " = " + df.format(conversionResult));
            }

        } else {

            System.out.println("NullPointerException");

        }

    }

}
