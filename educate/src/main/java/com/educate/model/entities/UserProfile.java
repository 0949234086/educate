package com.educate.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "UserProfile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(length = 256, nullable = true)
    private String user_name;

    @Column(length = 256, nullable = false)
    private String password_hash;

    @Column(length = 256, nullable = true)
    private String full_name;

    @Column(length = 50, nullable = true)
    private String avatar;

    @Column(length = 50, nullable = true)
    private String email;

    @Column(length = 20, nullable = true)
    private String phone;

    @Column(length = 256, nullable = true)
    private String address;

    @Column(length = 10, nullable = true)
    private String gender;

    @Column(nullable = true)
    private Date date_of_birth;

    @Column(length = 50, nullable = true)
    private String facebook;

    @Column(length = 20, nullable = true)
    private String zalo_number;

    @Column(nullable = false)
    private Boolean active;

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
