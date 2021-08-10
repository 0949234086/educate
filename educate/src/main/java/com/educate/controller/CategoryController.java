package com.educate.controller;

import com.educate.business.interfaces.ICategoryServices;
import com.educate.common.constants.constant;
import com.educate.model.entities.Categories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final ICategoryServices _categoryServices;

    public CategoryController(ICategoryServices categoryServices) {
        _categoryServices = categoryServices;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/save", path = "/save")
    public ResponseEntity save(@RequestBody Categories param) {
        try {
            var result = _categoryServices.save(param);
            return ResponseEntity.ok(result);

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, constant.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/delete", path = "/delete")
    public ResponseEntity delete(@RequestParam(required = true) Long id) {
        try {
            var result = _categoryServices.delete(id);
            return ResponseEntity.ok(result);

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, constant.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/suggestion", path = "/suggestion")
    public ResponseEntity suggestion(@RequestParam(required = false) String name) {
        try {
            var result = _categoryServices.suggestion(name);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, constant.INTERNAL_SERVER_ERROR);
        }
    }
}
