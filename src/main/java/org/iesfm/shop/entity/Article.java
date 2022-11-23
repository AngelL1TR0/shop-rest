package org.iesfm.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private int id;
    private String name;
    private double price;
    private Set<String> tags;

}
