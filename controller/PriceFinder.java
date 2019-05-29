package controller;

import network.WebScrape;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * This class handles obtaining the price of an item. This class also simulates
 * a prices given no URL.
 *
 * @author Isaias Leos, Leslie Gomez
 */
public class PriceFinder extends WebScrape {

    /**
     * Scrapes a web-site and obtains the price of an item, given the URL.
     *
     * @param url url of product
     */
    public double getPrice(String url) {
        return priceScrape(url);
    }

    /**
     * Generate a simulated price of an item between the given variable.
     *
     * @param medValue value to randomize within ranges
     * @return random double with the range of the given value
     */
    public double getPrice(Double medValue) {
        Random rand = new Random();
        double minValue = medValue - (medValue / 10);
        double maxValue = medValue + (medValue / 10);
        return (new BigDecimal(minValue + (maxValue - minValue) * rand.nextDouble()).setScale(2, RoundingMode.CEILING).doubleValue());
    }
}
