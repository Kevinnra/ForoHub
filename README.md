
# 🌐 ForoHub API

¡Bienvenido a la API de **ForoHub**! 🚀 Esta es una API REST sencilla que permite gestionar los temas de un foro. Con esta herramienta podrás listar, agregar, y eliminar temas, pero para algunas operaciones necesitarás estar autenticado. 🛡️

---

## 📝 Funcionalidad

1. **Obtener todos los temas** 📚  
   - **Método:** `GET`  
   - **Ruta:** `/topicos`  
   - Devuelve una lista con todos los temas del foro. Cada tema contiene:
     - `id`: Identificador único del tema.  
     - `titulo`: El título del tema.  
     - `mensaje`: Mensaje principal del tema.  
     - `fechaCreacion`: Fecha en que se creó el tema.  
     - `autor`: Nombre del autor.  
     - `curso`: Curso relacionado al tema.

2. **Agregar un nuevo tema** ➕  
   - **Método:** `POST`  
   - **Ruta:** `/topicos`  
   - **Requiere autenticación con JSON Web Token (JWT)**.  
   - Envía un objeto JSON con los datos del nuevo tema.

3. **Eliminar un tema** ❌  
   - **Método:** `DELETE`  
   - **Ruta:** `/topicos/{id}`  
   - **Requiere autenticación con JSON Web Token (JWT)**.  
   - Elimina el tema especificado por su `id`.

4. **Actualizar un tema existente** 🔄  
   - **Método:** `PUT`  
   - **Ruta:** `/topicos/{id}`  
   - **Requiere autenticación con JSON Web Token (JWT)**.  
   - Envía un objeto JSON con los datos actualizados del tema.

---

## ⚙️ Tecnologías Utilizadas

- **Java** ☕  
- **Spring Boot** 🌱  
  - Spring Web: Para construir la API REST.  
  - Spring Data JPA: Para la gestión de la base de datos.  
  - Spring Security: Para manejar la autenticación.  
- **JWT (JSON Web Tokens)** 🔑  
  - Para asegurar las rutas protegidas.  
- **MySQL** 🐬  
  - Base de datos utilizada para almacenar los temas.  
- **Lombok** 🛠️  
  - Para simplificar el código Java eliminando los getters, setters y constructores manuales.  
- **Maven** 📦  
  - Para la gestión de dependencias.

