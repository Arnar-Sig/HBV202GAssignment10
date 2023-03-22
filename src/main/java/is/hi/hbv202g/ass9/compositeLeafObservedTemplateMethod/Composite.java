package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;

public abstract class Composite {
    private ArrayList<Component> children = new ArrayList<>();

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    private int lastObservedResult;
    public void add(Component number) {
        children.add(number);
    }
}
