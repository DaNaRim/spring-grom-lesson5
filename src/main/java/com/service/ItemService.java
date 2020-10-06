package com.service;

import com.exception.BadRequestException;
import com.model.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    Item save(Item item);

    Item findById(Long id) throws BadRequestException;

    Item update(Item item) throws BadRequestException;

    void delete(Long id) throws BadRequestException;
}
