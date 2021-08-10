package com.educate.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "Categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(length = 255, nullable = true)
    private String name; //Tên khóa học

    @Column(length = 1000, nullable = true)
    private String introduce; //Giới thiệu

    @Column(nullable = true)
    private Integer number_of_lectures; //Số lượng bài giảng

    @Column(length = 200, nullable = true)
    private String time; //Thời lượng

    @Column(nullable = false)
    private Boolean certificate; //Chứng chỉ

    @Column(nullable = true)
    private Long number_of_participants; //Số người tham gia

    @Column(nullable = false)
    private Long created_by;

    @Column(nullable = false)
    private Date created_date;

    @Column(nullable = true)
    private Long modified_by;

    @Column(nullable = true)
    private Date modified_date;

    @Column(nullable = true)
    private Long deleted_by;

    @Column(nullable = true)
    private Date deleted_date;

    @Column(nullable = false)
    private Boolean deleted;
}
