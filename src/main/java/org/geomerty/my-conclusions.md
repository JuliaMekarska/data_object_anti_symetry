My Conclusions

After comparing the procedural and OOP approaches, I noticed the following:

Ease of extension

In the procedural version, adding new features (like perimeter calculation or a new shape) required changing multiple functions and sometimes touching existing code.

In the OOP version, I could extend the system more easily by adding new classes or overriding methods without modifying existing code.

Encapsulation

In OOP, data and behavior are bundled together inside classes. This made the code easier to reason about and reduced the risk of breaking unrelated parts.

In the procedural version, data and operations were separated, which often led to duplicated logic.

Polymorphism

Thanks to polymorphism, the OOP code could handle different shapes in a unified way (e.g., calculating area or perimeter through the same method call).

In the procedural code, I had to explicitly check the type of the shape and then run the correct function.

Scalability and maintenance

OOP code is more scalable and maintainable for larger applications, because new functionality can be integrated with less effort.

Procedural code may be fine for very small tasks, but as the system grows, it becomes harder to maintain and more error-prone.