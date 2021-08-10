package com.educate.model.viewmodel;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoriesViewModel {
    private Long id;

    private String name; //Tên khóa học

    private String introduce; //Giới thiệu

    private Integer number_of_lectures; //Số lượng bài giảng

    private String time; //Thời lượng

    private Boolean certificate; //Chứng chỉ

    private Long number_of_participants; //Số người tham gia
}
