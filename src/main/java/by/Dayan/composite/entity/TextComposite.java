package by.Dayan.composite.entity;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextComposite implements TextComponent{

    static Logger logger = LogManager.getLogger();

    private TextComponentType type;
    private List<TextComponent> components = new ArrayList<TextComponent>();

    public TextComposite(TextComponentType type) {
        this.type = type;
    }

    @Override
    public boolean add(TextComponent component) {
        return components.add(component);
    }

    @Override
    public boolean remove(TextComponent component) {
        return components.remove(component);
    }

    @Override
    public List<TextComponent> getChildren() {
        return new ArrayList<TextComponent>(components);
    }

    @Override
    public TextComponent getChildByIndex(int index) {
        return components.get(index);
    }

    public TextComponentType getType() {
        return type;
    }

    @Override
    public String toString() {

        StringBuilder demonstrativeForm = new StringBuilder();

        demonstrativeForm.append(type.getPrefix());

        // it is permissible to remove method toString(), it will be called automatically
        // components.forEach(c -> demonstrativeForm.append(c)) - it is the same
        components.forEach(c -> demonstrativeForm.append(c.toString()));

        demonstrativeForm.append(type.getPostfix());

        /*
         * if (type == TextComponentType.LEXSEM) { logger.info("LEXSEM");
         * logger.info(viewForm); }
         */

        /*
         * if (type == TextComponentType.PARAGRAPH) { logger.info("PARAGRAPH");
         * logger.info(demonstrativeForm); }
         */

        /*
         * if (type == TextComponentType.SENTENCE) { logger.info("SENTENCE");
         * logger.info(demonstrativeForm); }
         */
        return demonstrativeForm.toString();
    }
}
