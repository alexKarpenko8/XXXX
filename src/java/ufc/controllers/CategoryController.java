/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufc.controllers;

import java.util.List;
import ufc.DAL.CategoryDal;
import ufc.model.Category;
/**
 *
 
 */
public class CategoryController {
    protected CategoryDal categoryDal;
    public CategoryController() 
    {
        categoryDal = new CategoryDal();
    }
    
    public List<Category> getAllCategory()
    {
        return categoryDal.selectAll();
    }
    
    public Category getCategory(int id)
    {
        return categoryDal.selectById(id);
    }
     
    public int insertCategory(Category category)
    {
        return categoryDal.insert(category);
    }
      
    public int updateCategory(Category category)
    {
        return categoryDal.update(category);
    }
    
    public int deleteCategoryById(int id)
    {
        return categoryDal.delete(id);
    }
}
