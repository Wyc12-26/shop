package edu.fdzc.shop.dao;

import edu.fdzc.shop.entity.Category;

public interface CategoryMapper {

    int insert(Category category);
    int update(Category category);
    Category findById(String categoryId);//根据id获取分类信息
    int deleteById(String categoryId);//根据id删除分类信息
    heelo
}
