package by.Dayan.composite.parser;

import by.Dayan.composite.entity.TextComponent;
import by.Dayan.composite.entity.TextComponentType;
import by.Dayan.composite.entity.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser extends AbstractTextParser {

    private static final String SENTENCE_REGEX = "(\\p{Upper}|[А-ЯЁ]).+?(\\.|\\!|\\?|\\u2026)(\\s|$)";


    public SentenceParser() {
        this.nextParser = new LexemParser();
    }

    @Override
    public void parse(TextComponent component, String data) {

        Pattern pattern = Pattern.compile(SENTENCE_REGEX);
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            String sentence = matcher.group();
            TextComponent sentenceComponent = new TextComposite(TextComponentType.SENTENCE);
            component.add(sentenceComponent);
            nextParser.parse(sentenceComponent, sentence);
        }

    }

}
