package com.educate.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "AttachmentFile")
public class AttachmentFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = true)
    private Long category_id;

    @Column(length = 255, nullable = true)
    private String file_name;

    @Column(length = 255, nullable = true)
    private String file_type;

    @Column(nullable = true)
    private Long file_size;

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
