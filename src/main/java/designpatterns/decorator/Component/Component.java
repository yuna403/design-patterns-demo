package designpatterns.decorator.Component;

import java.util.Date;

abstract class Component {
    public abstract double calcPrize(String user, Date begin, Date end);
}
