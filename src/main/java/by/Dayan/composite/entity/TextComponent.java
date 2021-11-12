package by.Dayan.composite.entity;

import java.util.ArrayList;
import java.util.List;

public interface TextComponent {
    boolean add(TextComponent component);

    boolean remove(TextComponent component);

    List<TextComponent> getChildren();

    TextComponent getChildByIndex(int index);

    String toString();
}
