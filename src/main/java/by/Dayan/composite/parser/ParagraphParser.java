package by.Dayan.composite.parser;

import by.Dayan.composite.entity.TextComponent;
import by.Dayan.composite.entity.TextComponentType;
import by.Dayan.composite.entity.TextComposite;

public class ParagraphParser extends AbstractTextParser {

    private static final String PARAGRAPH_SPLITTER_REGEX = "(?m)(?=^((\\t)|(\\s{4})))";

    public ParagraphParser() {
        this.nextParser = new SentenceParser();
    }

    @Override
    public void parse(TextComponent component, String data) {
        String[] paragraphs = data.split(PARAGRAPH_SPLITTER_REGEX);

        for (String paragraph : paragraphs) {
            TextComponent paragraphComponent = new TextComposite(TextComponentType.PARAGRAPH);
            component.add(paragraphComponent);
            nextParser.parse(paragraphComponent, paragraph);
        }
    }
}
