Decorater Pattern :
  --Here we try to implement the decorater pattern by using the example of a coffee shop
  --The idea is to have different coffee and different condiments but since every person prefere their cofffee in a different way we find a solution to it using this pattern
  --The condiments are put in a sepearte class called Condiments and individual condiment extend it
  --Similarly the beverage class is abstract and individual beverages extend from it(eg. Esperesso,Dark Roast etc..) is made abstarct
  --This way we can choose diffrent condiments and clculate the cost without cofusion

Adapter Pattern:
--Here we try to implement the adapter pattern by using the example of making a turkey behave like a duck
--The idea is to use turkeys where ducks are expected without modifying the existing duck-using code
--We have a Duck interface and a Turkey interface, with ducks quacking and flying while turkeys gobble and fly short distances
--To adapt a turkey to a duck, we create a TurkeyAdapter that implements the Duck interface but wraps a Turkey object
--This adapter allows the turkey to act like a duck, enabling it to be used wherever a duck is expected without changing the client code
