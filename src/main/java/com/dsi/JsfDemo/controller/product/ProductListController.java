package com.dsi.JsfDemo.controller.product;

import com.dsi.JsfDemo.model.Product;
import com.dsi.JsfDemo.repository.ProductRepository;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope(value = "session")
@Component(value = "productList")
@ELBeanName(value = "productList")
@Join(path = "/product", to = "/product/product-list.jsf")
public class ProductListController {

    private final ProductRepository productRepository;
    private List<Product> products;

    public ProductListController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Deferred
    @RequestAction
    @IgnorePostback
    public void loadData() {
        products = productRepository.findAll();
    }

    public List<Product> getProducts() {
        return products;
    }
}
