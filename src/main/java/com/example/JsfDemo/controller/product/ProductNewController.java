package com.example.JsfDemo.controller.product;

import com.example.JsfDemo.model.Product;
import com.example.JsfDemo.repository.ProductRepository;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "productController")
@ELBeanName(value = "productController")
@Join(path = "/product/new", to = "/product/product-form.jsf")
public class ProductNewController {

    private final ProductRepository productRepository;
    private Product product;

    public ProductNewController(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.product = new Product();
    }

    public String save() {
        productRepository.save(product);
        product = new Product();
        return "/product/product-list.xhtml?faces-redirect=true";
    }

    public Product getProduct() {
        return product;
    }
}
