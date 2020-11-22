package com.shop.fashion.Service;

import com.shop.fashion.Model.Category;
import com.shop.fashion.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repo;

    public List<Category> listCategory() {
        List<Category> listCategory = new ArrayList<>();
        if (repo.findAll() != null && repo.findAll().size() != 0) {
            listCategory.addAll(repo.findAll());
        } else {
            listCategory = getDataCategory();
            createAll(listCategory);
        }
        return listCategory;
    }

    public void create(Category category) {
        repo.save(category);
    }

    public void createAll(List<Category> category) {
        repo.saveAll(category);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Category> getDataCategory() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("All Product"));
        categoryList.add(new Category("Men"));
        categoryList.add(new Category("Women"));
        categoryList.add(new Category("Bag"));
        categoryList.add(new Category("Shoes"));
        categoryList.add(new Category("Watches"));
        return categoryList;
    }
}
