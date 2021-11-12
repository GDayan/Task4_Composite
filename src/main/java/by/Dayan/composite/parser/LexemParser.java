package by.Dayan.composite.parser;

import by.Dayan.composite.entity.TextComponent;
import by.Dayan.composite.entity.TextComponentType;
import by.Dayan.composite.entity.TextComposite;

public class LexemParser extends AbstractTextParser {

    private static final String LEXEME_SPLITTER_REGEX = "\\s";

    public LexemParser() {
        this.nextParser = new WordAndPunctuationParser();
    }

    @Override
    public void parse(TextComponent component, String data) {
        String[] lexemes = data.split(LEXEME_SPLITTER_REGEX);

        for (String lexeme : lexemes) {
            TextComponent lexemeComponent = new TextComposite(TextComponentType.LEXSEM);
            component.add(lexemeComponent);
            nextParser.parse(lexemeComponent, lexeme);
        }

    }
}
