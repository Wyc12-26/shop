package edu.fdzc.shop.dao;

import edu.fdzc.shop.entity.Product;

import java.util.List;

public interface ProductMapper {
//    插入商品
    int insert(Product product);
//    查询商品
    List<Product> filter(Product product);
//    根据id查询商品
    Product findById(String productId);
//    更新商品
    int update(Product product);
//    删除商品
    int delete(String productId);

}
