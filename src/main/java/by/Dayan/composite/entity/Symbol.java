package by.Dayan.composite.entity;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Symbol {
    static Logger logger = LogManager.getLogger();

    private char symbol;

    public Symbol (char symbol) {
        this.symbol = symbol;
    }

    public boolean add(TextComponent component) {
        logger.info("Not available operation to this component");
        throw new UnsupportedOperationException("Not available operation to this component");
    }

    public boolean remove(TextComponent component) {
        logger.info("Not available operation to this component");
        throw new UnsupportedOperationException("Not available operation to this component");
    }

    @Override
    public List<TextComponent> getChildren() {
        logger.info("Not available operation to this component");
        throw new UnsupportedOperationException("Not available operation to this component");
    }

    @Override
    public String toString () {
        return String.valueOf(symbol);
    }

    @Override
    public TextComponent getChildByIndex(int index) {
        return null;
    }



}
