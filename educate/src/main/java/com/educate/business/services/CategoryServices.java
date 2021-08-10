package com.educate.business.services;

import com.educate.business.interfaces.ICategoryServices;
import com.educate.common.constants.constant;
import com.educate.common.helper.Response;
import com.educate.model.entities.Categories;
import com.educate.repository.categories.ICategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CategoryServices implements ICategoryServices {

    private final ICategoryRepository _categoryRepository;

    public CategoryServices(ICategoryRepository categoryRepository) {
        _categoryRepository = categoryRepository;
    }

    @Override
    public Response save(Categories param) {
        var response = new Response();
        if (param.getId() > 0) {
            Categories exits = _categoryRepository.findById(param.getId()).orElse(null);
            if (exits == null || exits.getId() <= 0) {
                response.setResponse_code(HttpStatus.NOT_FOUND.value());
                response.setResponse_message(constant.ID_NOT_FOUND);
                return response;
            }
            exits.setName(param.getName());
            exits.setIntroduce(param.getIntroduce());
            exits.setNumber_of_lectures(param.getNumber_of_lectures());
            exits.setTime(param.getTime());
            exits.setCertificate(param.getCertificate());
            exits.setNumber_of_participants(param.getNumber_of_participants());
            param.setModified_by(Long.parseLong(String.valueOf(1)));
            param.setModified_date(new Date());
            _categoryRepository.save(exits);
        } else {
            param.setName(param.getName());
            param.setIntroduce(param.getIntroduce());
            param.setNumber_of_lectures(param.getNumber_of_lectures());
            param.setTime(param.getTime());
            param.setCertificate(param.getCertificate());
            param.setNumber_of_participants(param.getNumber_of_participants());
            param.setCreated_by(Long.parseLong(String.valueOf(1)));
            param.setCreated_date(new Date());
            var insert = _categoryRepository.save(param);
            if (insert.getId() <= 0) {
                response.setResponse_code(HttpStatus.NOT_FOUND.value());
                response.setResponse_message(constant.ID_NOT_FOUND);
                return response;
            }
        }
        response.setResponse_code(HttpStatus.OK.value());
        response.setResponse_message(constant.SAVE_SUCCESSFUL);
        return response;
    }

    @Override
    public Response delete(Long id) {
        var response = new Response();
        Categories exits = _categoryRepository.findById(id).orElse(null);
        if (exits == null || id <= 0) {
            response.setResponse_code(HttpStatus.NOT_FOUND.value());
            response.setResponse_message(constant.ID_NOT_FOUND);
            return response;
        }
        exits.setDeleted(true);
        exits.setDeleted_by(Long.parseLong(String.valueOf(1)));
        exits.setDeleted_date(new Date());
        _categoryRepository.save(exits);

        response.setResponse_code(HttpStatus.OK.value());
        response.setResponse_message(constant.DELETE_SUCCESSFUL);
        return response;
    }

    @Override
    public Response suggestion(String name) {
        var response = new Response();
        var listData = _categoryRepository.suggestion(name, name == null ? true : false);
        response.setResponse_code(HttpStatus.OK.value());
        response.setResponse_message(constant.SUCCESSFULLY);
        response.setData(listData);
        response.setTotal_record(listData.size());
        return response;
    }
}
