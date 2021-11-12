package by.Dayan.composite.parser;

import by.Dayan.composite.entity.Symbol;
import by.Dayan.composite.entity.TextComponent;

public class SymbolParser extends AbstractTextParser {

    @Override
    public void parse(TextComponent component, String data) {

        char[] symbols = data.toCharArray();

        for (char symbol : symbols) {
            component.add(new Symbol(symbol));
        }
    }

}
