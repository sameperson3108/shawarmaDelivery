package com.sameperson3108.shawarmadelivery.domain.repo;

import com.sameperson3108.shawarmadelivery.domain.model.MenuItem;
import com.sameperson3108.shawarmadelivery.domain.model.MenuSection;

import java.util.List;

public interface MenuItemRepo {
    MenuItem saveMenuItem(MenuItem menuItem);
    MenuItem updateMenuItem(MenuItem menuItem);
    MenuItem getMenuItemById(Long id);
    List<MenuItem> getMenuItemsBySection(MenuSection menuSection);
    void deleteMenuItem(MenuItem menuItem);
}
