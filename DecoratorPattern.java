public class DecoratorPattern {

    public abstract class Beverage {
        String description = "Unknown Beverage";

        public String getDescription() {
            return description;
        }

        public abstract double cost();
    }

    public abstract class CondimentDecorator extends Beverage {
        public abstract String getDescription();
    }

    public class Soy extends CondimentDecorator {
        Beverage beverage;

        public Soy(Beverage beverage) {
            this.beverage = beverage;
        }

        public String getDescription() {
            return beverage.getDescription() + ", Soy";
        }

        public double cost() {
            return .15 + beverage.cost();
        }
    }

    public class Mocha extends CondimentDecorator {
        Beverage beverage;

        public Mocha(Beverage beverage) {
            this.beverage = beverage;
        }

        public String getDescription() {
            return beverage.getDescription() + ", Mocha";
        }

        public double cost() {
            return .20 + beverage.cost();
        }
    }

    public class Whip extends CondimentDecorator {
        Beverage beverage;

        public Whip(Beverage beverage) {
            this.beverage = beverage;
        }

        public String getDescription() {
            return beverage.getDescription() + ", Whip";
        }

        public double cost() {
            return .10 + beverage.cost();
        }
    }

    public class DarkRoast extends Beverage {
        public DarkRoast() {
            description = "Dark Roast Coffee";
        }

        public double cost() {
            return .99;
        }
    }

    public class HouseBlend extends Beverage {
        public HouseBlend() {
            description = "House Blend Coffee";
        }

        public double cost() {
            return .89;
        }
    }

    public class Espresso extends Beverage {
        public Espresso() {
            description = "Espresso";
        }

        public double cost() {
            return 1.99;
        }
    }

    public static void main(String[] args) {
        DecoratorPattern pattern = new DecoratorPattern();

        Beverage beverage = pattern.new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = pattern.new DarkRoast();
        beverage2 = pattern.new Mocha(beverage2);
        beverage2 = pattern.new Mocha(beverage2);
        beverage2 = pattern.new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = pattern.new HouseBlend();
        beverage3 = pattern.new Soy(beverage3);
        beverage3 = pattern.new Mocha(beverage3);
        beverage3 = pattern.new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
    }
}
