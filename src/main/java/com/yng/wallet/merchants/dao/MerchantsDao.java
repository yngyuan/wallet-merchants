package com.yng.wallet.merchants.dao;

import com.yng.wallet.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Merchants Dao Interface
 */

public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
    /**
     * get merchant object based on id
     * @param id merchant id
     * @return {@link Merchants}
     */

    Merchants findById(Integer id);

    Merchants findByName(String name);
}
