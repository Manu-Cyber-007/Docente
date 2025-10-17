Abstracción y Polimorfismo en el Proyecto Lab7

El proyecto Lab7 demuestra de forma práctica dos pilares esenciales de la Programación Orientada a Objetos: la abstracción y el polimorfismo. Ambos conceptos se complementan para lograr un código más claro, ordenado y extensible.

🔹 Abstracción

La abstracción consiste en ocultar los detalles innecesarios y mostrar solo lo esencial de un objeto. En el código, esto se refleja en la clase abstracta Persona, que define los atributos y comportamientos comunes (nombre, edad, método presentar() y modificar()), pero no especifica cómo se implementan.
Esto obliga a las clases hijas (Estudiante y Docente) a definir sus propias versiones de estos métodos, adaptadas a su contexto.
Por ejemplo, un estudiante se presenta mostrando su carrera y grado, mientras que un docente muestra su materia y sueldo.

Gracias a esto, el programa se vuelve más simple y extensible. Si en el futuro se desea agregar un nuevo tipo de persona, como un Administrativo, solo es necesario crear una nueva clase que herede de Persona y redefina los métodos, sin modificar el resto del código.
La abstracción, entonces, permite centrarse en qué hace una persona, no en cómo lo hace, lo que reduce la complejidad y mejora la organización.

🔹 Polimorfismo

El polimorfismo permite que distintos objetos respondan de manera diferente al mismo mensaje.
En este proyecto, se ve cuando se guarda un grupo de personas en un mismo arreglo:

Persona[] personas = new Persona[cantidad];


Aunque el arreglo es del tipo Persona, puede contener tanto estudiantes como docentes.
Luego, al recorrerlo con:

for (Persona p : personas) {
    p.presentar();
}


cada objeto ejecuta su propia versión del método presentar().
El Main no necesita saber qué tipo de persona es, porque el método se comporta de forma diferente según el objeto.
Esto hace que el código sea más flexible, fácil de mantener y libre de condicionales innecesarios.

Además, el método modificar() aprovecha la misma idea: el programa llama siempre al mismo método, pero la acción varía según si se trata de un estudiante o un docente.
De esta manera, el polimorfismo reduce la dependencia entre clases y permite que el sistema se adapte fácilmente a cambios o ampliaciones.

🔹 Cómo trabajan juntos

La abstracción establece una estructura general que define las reglas del sistema (qué deben poder hacer todas las personas), mientras que el polimorfismo permite que cada tipo concreto de persona cumpla esas reglas de forma diferente.
Ambos principios hacen que el programa sea modular, reutilizable y escalable, siguiendo el principio de diseño “abierto a la extensión y cerrado a la modificación”.

🔹Conclusión

En resumen, el proyecto Lab7 demuestra cómo la abstracción y el polimorfismo pueden aplicarse para crear un sistema ordenado, claro y extensible.
La abstracción oculta los detalles internos, define una estructura común y facilita la extensión del código.
El polimorfismo permite la variación del comportamiento sin modificar el código que utiliza los objetos, haciendo que el programa sea más flexible y fácil de mantener.

Gracias a ambos principios, el código logra un equilibrio entre simplicidad, organización y capacidad de crecimiento.
Esto refleja la verdadera ventaja de la programación orientada a objetos: poder construir sistemas complejos sin perder claridad, donde cada parte del programa cumple una función definida, pero puede evolucionar sin romper la estructura general.
