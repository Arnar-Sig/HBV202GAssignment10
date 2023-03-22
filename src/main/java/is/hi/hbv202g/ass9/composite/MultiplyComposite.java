package is.hi.hbv202g.ass9.composite;

import is.hi.hbv202g.ass9.composite.Component;
import is.hi.hbv202g.ass9.composite.NumberLeaf;

import java.util.ArrayList;

public class MultiplyComposite implements Component {
    private ArrayList<Component> children = new ArrayList<>();
    public void add(Component number) {
        children.add(number);
    }
    @Override
    public int getResult() {
        int sum = 1;

        for (Component child:children) {
            sum = sum *  child.getResult();
        }
        return sum;
    }

    public void update() {
    }
}
