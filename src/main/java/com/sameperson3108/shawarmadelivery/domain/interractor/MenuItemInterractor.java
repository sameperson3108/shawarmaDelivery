package com.sameperson3108.shawarmadelivery.domain.interractor;

import com.sameperson3108.shawarmadelivery.domain.model.MenuItem;
import com.sameperson3108.shawarmadelivery.domain.model.MenuSection;
import com.sameperson3108.shawarmadelivery.domain.repo.MenuItemRepo;

import java.util.List;

public class MenuItemInterractor {
    private final MenuItemRepo repo;

    public MenuItemInterractor(MenuItemRepo repo) {
        this.repo = repo;
    }

    public MenuItem saveMenuItem(MenuItem menuItem) {
        return repo.saveMenuItem(menuItem);
    }

    public MenuItem updateMenuItem(MenuItem menuItem) {
        return repo.updateMenuItem(menuItem);
    }

    public List<MenuItem> getMenuItemsBySection(MenuSection menuSection) {
        return repo.getMenuItemsBySection(menuSection);
    }

    public MenuItem getMenuItemById(Long id) {
        return repo.getMenuItemById(id);
    }
}
