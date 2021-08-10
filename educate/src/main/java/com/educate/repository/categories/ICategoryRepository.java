package com.educate.repository.categories;

import com.educate.model.ItemModel;
import com.educate.model.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryRepository extends JpaRepository<Categories, Long> {
    @Query(nativeQuery = true, value = "SELECT id, name AS value FROM Categories WHERE (:isNameNull = true OR name LIKE %:name%) AND deleted = false ORDER BY id DESC")
    List<ItemModel> suggestion(@Param("name") String name, @Param("isNameNull") boolean isNameNull);
}
