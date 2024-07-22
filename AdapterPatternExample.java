public class AdapterPatternExample {


    public interface Duck {
        void quack();
        void fly();
    }

    
    public class MallardDuck implements Duck {
        public void quack() {
            System.out.println("Quack");
        }

        public void fly() {
            System.out.println("I'm flying");
        }
    }

    
    public interface Turkey {
        void gobble();
        void fly();
    }

    
    public class WildTurkey implements Turkey {
        public void gobble() {
            System.out.println("Gobble gobble");
        }

        public void fly() {
            System.out.println("I'm flying a short distance");
        }
    }

    
    public class TurkeyAdapter implements Duck {
        Turkey turkey;

        public TurkeyAdapter(Turkey turkey) {
            this.turkey = turkey;
        }

        public void quack() {
            turkey.gobble();
        }

        public void fly() {
            
                turkey.fly();
            
        }
    }

    
    public static void main(String[] args) {
        AdapterPatternExample example = new AdapterPatternExample();
        
        Duck mallardDuck = example.new MallardDuck();
        Turkey wildTurkey = example.new WildTurkey();
        Duck turkeyAdapter = example.new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
