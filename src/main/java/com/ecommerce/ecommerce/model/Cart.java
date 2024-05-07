package com.ecommerce.ecommerce.model;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cart_items")
public class Cart {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "cart_id")
    private UUID cartId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private User userId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_id")
    private Product prodId;

    private String prodName;

    private long prodCost;

}