# Markdown Cheat Sheet (Example File)

This is a **generic Markdown template** showcasing essential formatting features.

---

## 1. Headers
# H1 (Largest)
## H2
### H3
#### H4
##### H5
###### H6 (Smallest)

---

## 2. Text Formatting
- **Bold** (`**text**` or `__text__`)
- *Italic* (`*text*` or `_text_`)
- ~~Strikethrough~~ (`~~text~~`)
- `Inline Code` (`` `code` ``)
- > Blockquote (prefix with `>`)

---

## 3. Lists
### Unordered List
- Item 1
- Item 2
  - Nested Item (indent with 2 spaces)

### Ordered List
1. First item
2. Second item
   1. Nested item (indent with 3 spaces)

### Task List
- [x] Completed task
- [ ] Pending task (`[ ]`)

---

## 4. Links
- [Hyperlink](https://example.com) (`[text](url)`)

---

## 5. Code Blocks
```java
# Syntax-highlighted block (java)
class HelloWorld {
    public static main(String... args) {
        System.out.println("Hello markdown");
    }
}


Un centro de investigación necesita gestionar la información que trata respecto a sus equipos y estudios.

Los equipos tienen un código identificativo (alfanumérico), un nombre y un conjunto de integrantes, de los cuales uno es el líder.

Cada integrante tiene un ID numérico, un nombre, dos apellidos y una especialidad. Las especialidades posibles para este centro son: ingeniería, física, química y biología.

Un equipo lleva o llevó a cabo de uno a varios estudios. De un estudio se conoce su código identificativo (alfanumérico), título, fecha de inicio, fecha de fin estimada, fecha de fin real y presupuesto (en euros). Las fechas de fin (estimada y real) deben ser siempre superiores a la fecha de inicio.

Actualmente tenemos estos datos sobre el centro:
  - Hay un equipo por el momento:
    > El "F1", llamado "Equipo de Física Nuclear".
    > Tiene 2 integrantes:
      + El de ID 1, llamado "Juan Gómez Pérez", ingeniero, líder del equipo.
      + El de ID 2, llamado "Salma Luna Sanz", física.
    > Lleva/Llevó 2 proyectos:
      + El "F1P1", titulado "Análisis teórico de la estructura de núcleos exóticos ligeros", que comenzó el "5/6/2025" y se estimó que terminaría el "18/12/2025", terminando realmente el "10/12/2025", con un presupuesto de 70.000 €.
      + El "F1P2", titulado "Análisis e implementación de medidas de seguridad en centrales nucleares", que comenzó el "10/1/2026" y se estima que terminará el "10/11/2026", con un presupuesto de 100.000 €.

La aplicación debe instanciar los datos anteriores de acuerdo a la orientación a objetos. Después, se realizarán las siguientes operaciones (no hace falta un menú, se ejecutan de seguido):

Paso 1: registrar un equipo nuevo (solo el equipo, el conjunto de sus integrantes y su líder se dejan sin establecer por el momento). Esto debe estar recogido dentro de un método estático en la clase principal.

Paso 2: mostrar, de forma todos los datos del líder del equipo "F1".

Paso 3: mostrar el número total de ingenieros que hay en el centro de investigación.

Paso 4: mostrar el presupuesto total invertido en todos los proyectos del equipo y luego el promedio (media aritmética).
