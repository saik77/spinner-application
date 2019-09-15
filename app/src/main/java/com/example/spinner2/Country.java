package com.example.spinner2;

public class Country
{

    private String cid;
    private String name;
    private String flag;
    private String states;

    public Country(String cid, String name,String flag, String states)
    {
        this.cid = cid;
        this.name = name;
        this.flag=flag;
        this.states = states;
    }


    public String getName() {
        return name;
    }

    public String getCid() {
        return cid;
    }

    public String getFlag() {
        return flag;
    }

    public String getStates() {
        return states;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

