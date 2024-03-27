## Red Social de Diseñadores - README

### Descripción del Proyecto

Este proyecto consiste en el desarrollo de una nueva red social dirigida a diseñadores de moda y usuarios interesados en el mundo del diseño, donde podrán publicar diferentes estilos de indumentaria y recibir interacciones de otros usuarios, como likes y comentarios. La plataforma permitirá a los usuarios explorar y descubrir nuevas creaciones, así como interactuar con la comunidad de diseñadores.

### Problema

Existe una falta de una plataforma colaborativa específica para diseñadores de moda y entusiastas, donde puedan compartir y encontrar inspiración de manera fácil y efectiva.

### Solución

Este proyecto ofrece una solución al proporcionar una plataforma donde los diseñadores pueden publicitar sus ideas, atuendos y combinaciones, y recibir retroalimentación directa de la comunidad. Esto les permite mejorar sus creaciones y promocionar sus marcas de manera más efectiva.

### Audiencia

La audiencia principal de esta plataforma son los diseñadores de moda que desean compartir sus creaciones y recibir feedback, así como los usuarios interesados en la moda que desean descubrir y explorar nuevas tendencias y estilos.

### Casos de Uso

- Los usuarios pueden publicar sus creaciones en diferentes categorías, como indumentaria, maquillaje, calzado, etc.
- Los usuarios pueden filtrar las publicaciones por categorías y por diseñador, así como dar likes y comentarios a las publicaciones.
- Los usuarios pueden ver las publicaciones más populares de la semana, los diseñadores mejor rankeados y los diseños más gustados.
- Los usuarios tienen la opción de reportar publicaciones, comentarios o usuarios que no cumplan con los estándares de la comunidad.

### Requerimientos Técnicos

#### Requerimientos Obligatorios

- Registro y Login con Spring Security (Pendiente)
- Crear al menos dos roles distintos para los usuarios
- Incluir tabla HTML en alguna vista
- Carga y actualización de imagen
- Crear una Query de búsqueda personalizada
- Crear un CRUD
- Habrá al menos un formulario
- Crear al menos tres vistas distintas
- Diagrama UML de entidades

#### Requerimientos Optativos

- Motor de búsqueda
- Tabla con opciones de agregar/modificar/eliminar registros
- Utilizar atributos booleanos de alta y baja de usuarios
- Listado en tabla por filtro
- Generar al menos cinco vistas distintas que implementen th:fragments
- Generar un dashboard de administración de la app
- Aplicar principios de código limpio y buenas prácticas
- Añadir diagrama de casos de uso en UML

#### Requerimientos Específicos del Proyecto

- Los usuarios pueden ver todos los posteos aplicando diferentes filtros, mostrando por defecto los diseños con mayores interacciones esa semana.
- Los usuarios pueden dar un like por publicación y comentar más de una vez. Pueden cambiar de opinión luego de haber dado like y también pueden eliminar comentarios.
- Los usuarios pueden crear y eliminar publicaciones, pero no pueden ser modificadas una vez publicadas.
- Los usuarios pueden visualizar todas sus publicaciones, así como cada publicación individual en detalle con sus estadísticas (cantidad de likes y comentarios).
- Los usuarios pueden reportar a otros usuarios, publicaciones o comentarios, eligiendo una categoría y opcionalmente incluyendo una descripción.
- Los administradores tienen un panel de control para visualizar reportes y eliminar posteos, comentarios y cuentas.
- Los usuarios invitados pueden visualizar hasta 10 publicaciones, aplicando filtros, pero no pueden comentar ni dar me gusta.

### Endpoints CRUD

A continuación se detallan los endpoints para las operaciones básicas de creación, lectura, actualización y eliminación (CRUD):

- **Create**: `POST /api/publications` - Crea una nueva publicación.
- **Read**: 
  - `GET /api/publications/{id}` - Obtiene los detalles de una publicación específica.
  - `GET /api/publications` - Obtiene todas las publicaciones.
- **Update**: `PUT /api/publications/{id}` - Actualiza una publicación existente.
- **Delete**: `DELETE /api/publications/{id}` - Elimina una publicación existente.

### Notas Adicionales

Para ejecutar este proyecto localmente, asegúrate de tener Java 17 instalado, así como Maven y MySQL. Además, configura las credenciales de la base de datos en el archivo `application.properties` y luego ejecuta la aplicación usando Maven:

```
mvn spring-boot:run
```

¡Disfruta explorando la plataforma y descubriendo nuevas creaciones de diseñadores talentosos!