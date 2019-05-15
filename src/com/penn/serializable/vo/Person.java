package com.penn.serializable.vo;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 2964422947528724597L;

    private Long personId;

    private String personName;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                '}';
    }
}
