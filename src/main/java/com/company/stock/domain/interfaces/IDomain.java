package com.company.stock.domain.interfaces;

import java.io.Serializable;

/**
 * @author Weverton Souza.
 * Created on 05/05/19
 */
public interface IDomain extends Serializable {
    Object setID(final Long id);
    Long getID();
}
