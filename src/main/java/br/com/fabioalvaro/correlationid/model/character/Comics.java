package br.com.fabioalvaro.correlationid.model.character;


import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Comics{
    public int available;
    public String collectionURI;
    public ArrayList<Item> items;
    public int returned;
}



