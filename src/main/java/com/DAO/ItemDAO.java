package com.DAO;

import com.exception.BadRequestException;
import com.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDAO {

    Item save(Item item);

    Item findById(Long id) throws BadRequestException;

    Item update(Item item);

    void delete(Item item);
}
