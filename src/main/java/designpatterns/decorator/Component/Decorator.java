package designpatterns.decorator.Component;

import java.util.Date;

abstract class Decorator extends Component {
    protected Component c;

    public Decorator(Component c) {
        this.c = c;
    }

    public double calcPrize(String user, Date begin, Date end) {
        return c.calcPrize(user, begin, end);
    }
}
