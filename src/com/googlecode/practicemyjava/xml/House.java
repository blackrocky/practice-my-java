package com.googlecode.practicemyjava.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class House {
    private int id;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private String address;
    private long price;

    public House() {
        // required by JAXB
    }

    public House(int id, int numberOfBedrooms, int numberOfBathrooms, String address, long price) {
        this.id = id;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.address = address;
        this.price = price;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    @XmlElement
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    @XmlElement
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    @XmlElement
    public String getAddress() {
        return address;
    }

    @XmlElement
    public long getPrice() {
        return price;
    }
}
