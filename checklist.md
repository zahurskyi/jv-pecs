## Common mistakes (jv-pecs)

#### Don't begin class or method implementation with empty line.
#### Parameterize `MachineProducer` in such a way that any implementation NOT using `Machine` or its subtype could NOT be created.
For example, this code should not compile:
```java
public class StringProducer implements MachineProducer<String> { }
```
#### Do not use raw types. Always parametrize interfaces and classes if it is possible.
```java
// Bad example:

public class ExcavatorProducer implements MachineProducer {
```
```java
// Improved example:

public class ExcavatorProducer implements MachineProducer<Excavator> {
```
#### Consider creating a local variable in your implementation of `getAll(Class type)` method.
```java
List<? extends Machine> machines = someProducer.get();
return new ArrayList<>(machines);
```
#### The size of a list passed to `fill()` method should remain the same. 
Just replace the old values with the new ones.
#### Don't forget about access modifiers for your custom fields in `Excavator`, `Truck` and `Bulldozer` classes.
You should never want to expose the object fields directly. They should be accessed through special methods (getters and setters).
#### Don't remove no-args constructors in `Excavator`, `Truck` and `Bulldozer` classes.
They will be needed to run the test.
#### Don't return null or specific type List in `getAll()` when no producer has been found.
Returning null is considered to be a bad practice: a user of your method needs to write additional null checks when 
using it. In other cases NPE might appear. Returning List of a specific type, like `List<Truck>` when no producer found
is a bad practice as well, because it's not an obvious behaviour, instead it's better to return empty List. 
#### Keep if else constructions simple
Do we need else after return in if clause? 
If not let's not make our code longer unnecessary.
