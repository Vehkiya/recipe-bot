package io.github.vehkiya.service;

import io.github.vehkiya.data.model.domain.Item;

import java.util.Set;

public interface TextParser {

    boolean messageMatchesPattern(String text);

    Set<Item> parseItemsFromText(String text);
}
