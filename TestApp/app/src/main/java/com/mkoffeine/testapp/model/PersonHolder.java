package com.mkoffeine.testapp.model;

import java.util.ArrayList;
import java.util.List;

//very fast way to hold people, need to use db
public class PersonHolder {

    private static PersonHolder instance = new PersonHolder();

    private List<Person> personList = new ArrayList<>();

    private PersonHolder() {
        init();
    }

    public static PersonHolder getInstance() {
        return instance;
    }

    private void init() {
        Person person = new Person("John Lennon", "Male",
                "http://cdn.riffraf.net/wp-content/uploads/2013/10/John-Lennon.jpg", "1940-10-09",
                "Liverpool, England, UK",
                "53.4167° N, 3.0000° W",
                "1980-12-08",
                "New York City, New York, US",
                "40.7142° N, 74.0064° W");
        personList.add(person);
        person = new Person("Paul McCartney", "Male",
                "http://wttsfm.com/wp-content/uploads/2011/12/paul-mccartney.jpg",
                "1942-06-18",
                "Liverpool, England, UK",
                "Latitude, Longitude: 53.4167° N, 3.0000° W");
        personList.add(person);
        person = new Person("George Harrison", "Male",
                "http://swotti.starmedia.com/tmp/swotti/cacheZ2VVCMDLIGHHCNJPC29URW50ZXJ0YWLUBWVUDC1NDXNPY0JHBMRZ/imggeorge%20harrison1.jpg",
                "1943-02-25",
                "Liverpool, England, UK",
                "Latitude, Longitude: 53.4167° N, 3.0000° W",
                "Death - 2001-11-29",
                "Los Angeles, California, US",
                "Latitude, Longitude: 34.0522° N, 118.2428° W"
        );
        personList.add(person);

        person = new Person("Ringo Starr", "Male",
                "http://www.examiner.com/images/blog/EXID13613/images/ringo-starr.jpg",
                "1940-07-07",
                "Liverpool, England, UK",
                "Latitude, Longitude: 53.4167° N, 3.0000° W");
        personList.add(person);
        person = new Person("Yoko Ono", "Female",
                "http://userserve-ak.last.fm/serve/252/124580.jpg",
                "1933-02-18",
                "Tokyo, Japan",
                "Latitude, Longitude: 35.6833° N, 139.7667° E");
        personList.add(person);
        person = new Person("Cynthia Powell", "Female",
                "http://www.rollingstonesnet.com/images/Faithfull_1966.jpg",
                "1939-09-10",
                "Blackpool, Lancashire, England, UK",
                "Latitude, Longitude: 53.8245° N, 3.0222° W");
        personList.add(person);
        person = new Person("Pattie Boyd", "Female",
                "http://thepastisunwritten.files.wordpress.com/2010/12/pattieboyd1.jpg",
                "1944-03-17",
                "Taunton, Somerset, England, UK",
                "Latitude, Longitude: 51.0167° N, 3.1000° W");
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
