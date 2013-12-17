Decorator Pattern:

Used for adding features to an existing object dynamically. 

In this example, the main class is Parcel.
A Parcel can be a Box or a Letter. 
Any parcel can be hazardous by having 1 more of these properties: 
Chemical, Medical or Nuclear. 

Using Decorator pattern, we can create a box or letter and dynamically
'decorate' it with any of the hazardous 'feature' (any combination). 
If we need to add a Poisonous type later on, we can just implement the 
HazardDecorator abstract class, e.g. extend it to a Poisonous concrete class.  

See the the uml.ucls for the UML diagram.
Run Main.java to see the example in action.