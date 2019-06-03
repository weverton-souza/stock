package com.company.stock.repository;

import com.company.stock.domain.Product;
import org.springframework.stereotype.Repository;

/**
 * @author Weverton Souza.
 * Created on 05/05/19
 */
@Repository
public interface IProductRepository extends IGenericRepository<Product, Long> { }
