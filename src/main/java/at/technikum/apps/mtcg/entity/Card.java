package at.technikum.apps.mtcg.entity;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Card {

    public Card(){
    }
    public Card(String name, int damage, String type, String category, String id){
        this.name = name;
        this.damage = damage;
        this.type = type;
        this.category = category;
        this.id = id;
    }
    @JsonSetter("Id")
    private String id;
    @JsonSetter("Name")
    private String name;
    @JsonSetter("Damage")
    private int damage;
    //fire, water, regular
    private String type;
    //monster or spell
    private String category;

    @Override
    public String toString() {
        return "id: " + id + " Name: " + name + " damage: " + damage + " type: " + type + " category: " + category;
    }

}
