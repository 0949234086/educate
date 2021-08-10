package com.educate.business.interfaces;

import com.educate.common.helper.Response;
import com.educate.model.entities.Categories;

public interface ICategoryServices {
    Response save(Categories param);

    Response delete(Long id);

    Response suggestion(String name);
}
