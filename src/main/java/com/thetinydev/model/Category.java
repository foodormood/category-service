package com.thetinydev.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Table(name = "category")
@Entity
@Getter
@Setter
public class Category implements Serializable {

    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "name_en")
    private String nameEn;

    @Column(name = "sort_order")
    private int order;

    @Column(name = "store_id")
    private UUID storeId;

}
