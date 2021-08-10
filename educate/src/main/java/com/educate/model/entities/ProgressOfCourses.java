package com.educate.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "ProgressOfCourses")
public class ProgressOfCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long category_id; //Khóa học

    @Column(nullable = false)
    private Long process; //Tiến trình

    @Column(nullable = false)
    private Long user_id; //Người dùng

    @Column(nullable = false)
    private Date created_date;

    @Column(nullable = true)
    private Date modified_date;
}
