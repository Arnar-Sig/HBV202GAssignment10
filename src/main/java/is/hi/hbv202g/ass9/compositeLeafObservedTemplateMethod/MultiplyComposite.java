package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;

public class MultiplyComposite extends Composite implements Component, Observer {
    protected ArrayList<Component> children = new ArrayList<>();

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    private int lastObservedResult;
    public void add(Component number) {
        children.add(number);
    }

    public int getResult() {
        int sum = 1;

        for (Component child:children) {
            sum = sum *  child.getResult();
        }
        return sum;
    }

    public void update() {
        int tempSum = 1;
        for (Component child :children) {
            tempSum = tempSum * child.getResult();
        }
        lastObservedResult = tempSum;
        System.out.println(lastObservedResult);
    }
}
