package com.stock.management.management.web.entities;
;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false, referencedColumnName = "id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false, referencedColumnName = "id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id", nullable = false, referencedColumnName = "id")
    private Manufacturer manufacturer;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<OrderLine> orderLines;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Stock> stockList;

}
