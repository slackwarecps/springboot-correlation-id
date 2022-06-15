package br.com.fabioalvaro.correlationid.model.character;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {
       int id ;
       String  name;
       String  description;
       String modified;

       public int getId() {
              return id;
       }

       public void setId(int id) {
              this.id = id;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public String getDescription() {
              return description;
       }

       public void setDescription(String description) {
              this.description = description;
       }

       public String getModified() {
              return modified;
       }

       public void setModified(String modified) {
              this.modified = modified;
       }


       @Override
       public String toString() {
              return "Character{" +
                      "id=" + id +
                      ", name='" + name + '\'' +
                      ", description='" + description + '\'' +
                      ", modified='" + modified + '\'' +
                      '}';
       }
}
