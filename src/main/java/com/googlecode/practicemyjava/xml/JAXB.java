package com.googlecode.practicemyjava.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXB {
    public static void main(String[] args) throws JAXBException {
        House house = new House(1, 4, 1, "Dubbo", 275000L);
        JAXBContext context = JAXBContext.newInstance(House.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(house, System.out);
    }
}
