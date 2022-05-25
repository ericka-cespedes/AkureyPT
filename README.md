# AkureyPT
Prueba Técnica de Akurey

The proposed solution for this problem implements the Abstract Factory pattern. This pattern was used because it can be used to create cross-platform user interface (UI) elements without coupling client code to specific UI classes, while keeping all elements created consistent with the selected operating system.

Pros:
Avoids a strong coupling and allows future additions.
Single Responsibility Principle
Open/Closed Principle

Cons:
Code becomes more complicated than it should; I especially realized this when I was coding. Many new interfaces and classes are introduced along with the pattern at the expense of avoiding strong coupling.
