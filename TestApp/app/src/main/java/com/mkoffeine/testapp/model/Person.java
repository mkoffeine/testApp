package com.mkoffeine.testapp.model;

import java.io.Serializable;

/**
 * Created by mKoffeine on 04.08.2016.
 */
public class Person implements Serializable {//use implements Parcelable
    private String name;
    private String sex;
    private String portraitSrc;
    private String birthday;//Use date or something else
    private String placeOfBirthName;//use class with city, country etc
    private String placeOfBirthCoord; //use a an appropriate class
    private String death;
    private String placeOfDeathName;
    private String placeOfDeathCoord;

    public Person() {
    }

    public Person(String name, String sex, String portraitSrc, String birthday,
                  String placeOfBirthName, String placeOfBirthCoord) {
        this.name = name;
        this.sex = sex;
        this.portraitSrc = portraitSrc;
        this.birthday = birthday;
        this.placeOfBirthName = placeOfBirthName;
        this.placeOfBirthCoord = placeOfBirthCoord;
    }

    public Person(String name, String sex, String portraitSrc, String birthday,
                  String placeOfBirthName, String placeOfBirthCoord, String death,
                  String placeOfDeathName, String placeOfDeathCoord) {
        this.name = name;
        this.sex = sex;
        this.portraitSrc = portraitSrc;
        this.birthday = birthday;
        this.placeOfBirthName = placeOfBirthName;
        this.placeOfBirthCoord = placeOfBirthCoord;
        this.death = death;
        this.placeOfDeathName = placeOfDeathName;
        this.placeOfDeathCoord = placeOfDeathCoord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPortraitSrc() {
        return portraitSrc;
    }

    public void setPortraitSrc(String portraitSrc) {
        this.portraitSrc = portraitSrc;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPlaceOfBirthName() {
        return placeOfBirthName;
    }

    public void setPlaceOfBirthName(String placeOfBirthName) {
        this.placeOfBirthName = placeOfBirthName;
    }

    public String getPlaceOfBirthCoord() {
        return placeOfBirthCoord;
    }

    public void setPlaceOfBirthCoord(String placeOfBirthCoord) {
        this.placeOfBirthCoord = placeOfBirthCoord;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getPlaceOfDeathName() {
        return placeOfDeathName;
    }

    public void setPlaceOfDeathName(String placeOfDeathName) {
        this.placeOfDeathName = placeOfDeathName;
    }

    public String getPlaceOfDeathCoord() {
        return placeOfDeathCoord;
    }

    public void setPlaceOfDeathCoord(String placeOfDeathCoord) {
        this.placeOfDeathCoord = placeOfDeathCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (sex != null ? !sex.equals(person.sex) : person.sex != null) return false;
        if (portraitSrc != null ? !portraitSrc.equals(person.portraitSrc) : person.portraitSrc != null)
            return false;
        if (birthday != null ? !birthday.equals(person.birthday) : person.birthday != null)
            return false;
        if (placeOfBirthName != null ? !placeOfBirthName.equals(person.placeOfBirthName) : person.placeOfBirthName != null)
            return false;
        if (placeOfBirthCoord != null ? !placeOfBirthCoord.equals(person.placeOfBirthCoord) : person.placeOfBirthCoord != null)
            return false;
        if (death != null ? !death.equals(person.death) : person.death != null) return false;
        if (placeOfDeathName != null ? !placeOfDeathName.equals(person.placeOfDeathName) : person.placeOfDeathName != null)
            return false;
        return placeOfDeathCoord != null ? placeOfDeathCoord.equals(person.placeOfDeathCoord) : person.placeOfDeathCoord == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (portraitSrc != null ? portraitSrc.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (placeOfBirthName != null ? placeOfBirthName.hashCode() : 0);
        result = 31 * result + (placeOfBirthCoord != null ? placeOfBirthCoord.hashCode() : 0);
        result = 31 * result + (death != null ? death.hashCode() : 0);
        result = 31 * result + (placeOfDeathName != null ? placeOfDeathName.hashCode() : 0);
        result = 31 * result + (placeOfDeathCoord != null ? placeOfDeathCoord.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", portraitSrc='" + portraitSrc + '\'' +
                ", birthday='" + birthday + '\'' +
                ", placeOfBirthName='" + placeOfBirthName + '\'' +
                ", placeOfBirthCoord='" + placeOfBirthCoord + '\'' +
                ", death='" + death + '\'' +
                ", placeOfDeathName='" + placeOfDeathName + '\'' +
                ", placeOfDeathCoord='" + placeOfDeathCoord + '\'' +
                '}';
    }

}
