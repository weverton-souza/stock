package com.company.stock.repository;

import com.company.stock.domain.Supplier;
import org.springframework.stereotype.Repository;

/**
 * @author Weverton Souza.
 * Created on 05/05/19
 */
@Repository
public interface ISupplierRepository extends IGenericRepository<Supplier, Long> { }
