package edu.fdzc.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product extends AbstractEntity{
//    分类id
    private String categoryId;
//    产品名称
    private String productName;
//    描述
    private String description;
//    详细
    private String detail;
//    价格
    private Double price;
    //private BigDecimal price;
//    仓库库存
    private Long stockCount;

}