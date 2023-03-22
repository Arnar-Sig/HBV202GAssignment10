package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;

public class PlusComposite implements Component, Observer {
    private ArrayList<Component> children = new ArrayList<>();

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    private int lastObservedResult;

    public void add(Component number) {
        children.add(number);
    }
    @Override
    public int getResult() {
        int sum = 0;
        for (Component child:children) {
            sum = sum +  child.getResult();
        }
        return sum;
    }


    @Override
    public void update() {
        int tempSum = 0;
        for (Component child :children) {
            tempSum = tempSum + child.getResult();
        }
        lastObservedResult = tempSum;
        System.out.println(lastObservedResult);
    }
}
