package com.sameperson3108.shawarmadelivery.data.repoImpls.collectionFrw;

import com.sameperson3108.shawarmadelivery.domain.model.MenuItem;
import com.sameperson3108.shawarmadelivery.domain.model.MenuSection;
import com.sameperson3108.shawarmadelivery.domain.repo.MenuItemRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenuItemRepoImpl implements MenuItemRepo {

    private final List<MenuItem> items = new ArrayList<>();

    @Override
    public MenuItem saveMenuItem(MenuItem menuItem) {
        items.add(menuItem);
        return menuItem;
    }

    @Override
    public MenuItem updateMenuItem(MenuItem menuItem) {
        int index = items.indexOf(menuItem);
        if (index != -1) items.set(index, menuItem);
        return menuItem;
    }

    @Override
    public MenuItem getMenuItemById(Long id) {
        return items.stream()
                .filter(menuItem -> menuItem.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<MenuItem> getMenuItemsBySection(MenuSection section) {
        return items.stream()
                .filter(items -> items.getMenuSection().name().equals(section.name()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteMenuItem(MenuItem menuItem) {
        items.remove(menuItem);
    }
}
