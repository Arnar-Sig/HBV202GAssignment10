package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;

public class PlusComposite implements Component {
    private ArrayList<Component> children = new ArrayList<>();

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


}
