package com.service;

import com.DAO.ItemDAO;
import com.exception.BadRequestException;
import com.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemDAO itemDAO;

    @Autowired
    public ItemServiceImpl(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    public Item save(Item item) {
        return itemDAO.save(item);
    }

    public Item findById(Long id) throws BadRequestException {
        return itemDAO.findById(id);
    }

    public Item update(Item item) throws BadRequestException {
        findById(item.getId());
        return itemDAO.update(item);
    }

    public void delete(Long id) throws BadRequestException {
        itemDAO.delete(findById(id));
    }
}
