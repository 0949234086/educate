package com.educate.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "Functions")
public class Functions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(length = 50, nullable = true)
    private String key_word;

    @Column(length = 200, nullable = true)
    private String caption;

    @Column(nullable = true)
    private Long parent_id;

    @Column(length = 50, nullable = true)
    private String node_path;

    @Column(nullable = true)
    private String url;

    @Column(nullable = true)
    private Integer order_string;

    @Column(length = 50, nullable = true)
    private String icon;

    @Column(length = 50, nullable = true)
    private String class_string;

    @Column(nullable = false)
    private Boolean is_show;
}
