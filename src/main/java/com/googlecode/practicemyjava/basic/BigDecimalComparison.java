package com.googlecode.practicemyjava.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class BigDecimalComparison {
    private static final Logger LOGGER = LoggerFactory.getLogger(BigDecimalComparison.class);

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("1.7");
        BigDecimal bd2 = new BigDecimal("-2");
        BigDecimal bd3 = new BigDecimal("1.700");

        LOGGER.info("bd1.equals(bd3) = {}", bd1.equals(bd3));
        LOGGER.info("bd1.compareTo(bd3) = {}", bd1.compareTo(bd3));
        LOGGER.info("bd2.signum() = {}", bd2.signum());
        LOGGER.info("bd3.signum() = {}", bd3.signum());
    }
}
