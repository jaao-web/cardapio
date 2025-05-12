package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food() {
    }

    public Food(Long id, String image, Integer price, String title) {
        this.id = id;
        this.image = image;
        this.price = price;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(id, food.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
