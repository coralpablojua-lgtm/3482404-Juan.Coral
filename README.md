# Taller de Java: Arrays, Ciclos, Condicionales, Scanner y JOptionPane

## 📋 Instrucciones de entrega

1. Realiza un **Fork** de este repositorio.
2. Renombra tu repositorio con el formato:

   ```
   numerodeficha-nombreaprendiz
   ```

   > Ejemplo: `2589451-juanperez`

3. En el repositorio encontrarás el **esqueleto** con los 6 ejercicios propuestos. Debes completar el código de cada uno dentro de los archivos correspondientes, **sin borrar la estructura base**.
4. Cada ejercicio aplica: `arrays`, `ciclos`, `condicionales`, y entrada/salida de datos con `Scanner` o `JOptionPane`.
5. **Puntaje:** cada ejercicio vale **1 punto** (total: 6 puntos).
6. Para aprobar el taller debes tener mínimo **4 de 6 ejercicios** funcionando correctamente.
7. Un ejercicio se considera *funcionando correctamente* si, dados los ejemplos de entrada del enunciado, produce exactamente la salida esperada.
8. Cuando termines, haz **commit** y **push** a tu repositorio, y comparte el enlace para la revisión.

---

## ✅ Checklist de ejercicios

- [ ] Ejercicio 1 — Pares e impares
- [ ] Ejercicio 2 — Promedio y estado del curso
- [ ] Ejercicio 3 — Mayor y menor del array
- [ ] Ejercicio 4 — Clasificación de temperaturas
- [ ] Ejercicio 5 — Búsqueda de un número en el array
- [ ] Ejercicio 6 — Conteo de votos por candidato

---

## Ejercicio 1 — Pares e impares (1 punto)

**Enunciado**

Pide al usuario cuántos números va a ingresar (`n`). Luego pide esos `n` números y guárdalos en un array. Recorre el array con un ciclo y usa un condicional para clasificar cada número como **par** o **impar**. Al final, imprime cuántos números pares y cuántos impares se ingresaron.

<details>
<summary><strong>Ver ejemplos de entrada y salida</strong></summary>

**Ejemplo 1**

Entrada: `n = 5` → números: `4, 7, 10, 3, 8`

```
Pares: 3
Impares: 2
```

**Ejemplo 2**

Entrada: `n = 3` → números: `1, 1, 1`

```
Pares: 0
Impares: 3
```

**Ejemplo 3**

Entrada: `n = 4` → números: `2, 4, 6, 8`

```
Pares: 4
Impares: 0
```

</details>

---

## Ejercicio 2 — Promedio y estado del curso (1 punto)

**Enunciado**

Pide al usuario cuántos estudiantes hay (`n`). Luego pide las notas de cada estudiante (de 0.0 a 5.0) y guárdalas en un array de tipo `double`. Calcula el promedio del curso usando un ciclo. Con un condicional, indica si el promedio del curso es **"Aprobado"** (promedio ≥ 3.0) o **"Reprobado"** (promedio < 3.0).

<details>
<summary><strong>Ver ejemplos de entrada y salida</strong></summary>

**Ejemplo 1**

Entrada: `n = 4` → notas: `4.5, 3.0, 2.0, 3.5`

```
Promedio del curso: 3.25
Estado: Aprobado
```

**Ejemplo 2**

Entrada: `n = 3` → notas: `2.0, 1.5, 2.5`

```
Promedio del curso: 2.0
Estado: Reprobado
```

**Ejemplo 3**

Entrada: `n = 2` → notas: `5.0, 5.0`

```
Promedio del curso: 5.0
Estado: Aprobado
```

</details>

---

## Ejercicio 3 — Mayor y menor del array (1 punto)

**Enunciado**

Pide al usuario cuántos números va a ingresar (`n`) y luego los `n` números, guardándolos en un array de enteros. Recorre el array con un ciclo, y usando condicionales, encuentra el **valor mayor** y el **valor menor** del conjunto. Imprime ambos valores.

<details>
<summary><strong>Ver ejemplos de entrada y salida</strong></summary>

**Ejemplo 1**

Entrada: `n = 5` → números: `12, 45, 3, 67, 21`

```
Mayor: 67
Menor: 3
```

**Ejemplo 2**

Entrada: `n = 3` → números: `-5, -20, -1`

```
Mayor: -1
Menor: -20
```

**Ejemplo 3**

Entrada: `n = 1` → números: `9`

```
Mayor: 9
Menor: 9
```

</details>

---

## Ejercicio 4 — Clasificación de temperaturas (1 punto)

**Enunciado**

Pide al usuario cuántas temperaturas va a registrar (`n`) y luego los `n` valores (en grados Celsius), guardándolos en un array. Recorre el array con un ciclo y, para cada temperatura, usa un condicional (`if/else` o `switch`) para clasificarla según este criterio:

| Rango | Clasificación |
|---|---|
| Menor a 10 | Frío |
| Entre 10 y 25 (inclusive) | Templado |
| Mayor a 25 | Calor |

Imprime la temperatura junto con su clasificación, una por línea.

<details>
<summary><strong>Ver ejemplos de entrada y salida</strong></summary>

**Ejemplo 1**

Entrada: `n = 3` → temperaturas: `5, 18, 30`

```
5 -> Frío
18 -> Templado
30 -> Calor
```

**Ejemplo 2**

Entrada: `n = 2` → temperaturas: `10, 25`

```
10 -> Templado
25 -> Templado
```

**Ejemplo 3**

Entrada: `n = 4` → temperaturas: `-3, 40, 12, 9`

```
-3 -> Frío
40 -> Calor
12 -> Templado
9 -> Frío
```

</details>

---

## Ejercicio 5 — Búsqueda de un número en el array (1 punto)

**Enunciado**

Pide al usuario cuántos números va a ingresar (`n`) y luego los `n` números, guardándolos en un array. Después, pide un número a buscar. Recorre el array con un ciclo y, usando un condicional, determina si el número **existe** en el array y en qué **posición** (índice) se encuentra. Si aparece varias veces, imprime todas las posiciones. Si no existe, indica que no fue encontrado.

<details>
<summary><strong>Ver ejemplos de entrada y salida</strong></summary>

**Ejemplo 1**

Entrada: `n = 5` → números: `3, 8, 15, 8, 2` → buscar: `8`

```
Encontrado en la posición: 1
Encontrado en la posición: 3
```

**Ejemplo 2**

Entrada: `n = 4` → números: `10, 20, 30, 40` → buscar: `25`

```
El número 25 no fue encontrado en el array
```

**Ejemplo 3**

Entrada: `n = 3` → números: `7, 7, 7` → buscar: `7`

```
Encontrado en la posición: 0
Encontrado en la posición: 1
Encontrado en la posición: 2
```

</details>

---

## Ejercicio 6 — Conteo de votos por candidato (1 punto)

**Enunciado**

Se van a registrar los votos de una votación entre 3 candidatos: **A**, **B** y **C**. Pide al usuario cuántos votos se van a registrar (`n`). Luego, por cada voto, pide una letra (`A`, `B` o `C`) y guárdala en un array de tipo `char` o `String`. Recorre el array con un ciclo y, usando condicionales (`if/else` o `switch`), cuenta cuántos votos obtuvo cada candidato. Al final, imprime el conteo de cada candidato y cuál fue el **ganador** (si hay empate, indícalo).

<details>
<summary><strong>Ver ejemplos de entrada y salida</strong></summary>

**Ejemplo 1**

Entrada: `n = 6` → votos: `A, B, A, C, A, B`

```
Candidato A: 3
Candidato B: 2
Candidato C: 1
Ganador: A
```

**Ejemplo 2**

Entrada: `n = 4` → votos: `B, B, A, A`

```
Candidato A: 2
Candidato B: 2
Candidato C: 0
Resultado: Empate
```

**Ejemplo 3**

Entrada: `n = 3` → votos: `C, C, C`

```
Candidato A: 0
Candidato B: 0
Candidato C: 3
Ganador: C
```

</details>

---

## 📊 Criterios de evaluación

| Criterio | Descripción |
|---|---|
| Fork y nombre del repositorio | Sigue el formato `numerodeficha-nombreaprendiz` |
| Uso correcto de arrays | Los datos se almacenan y recorren en arrays |
| Uso correcto de ciclos | `for`, `while` o `do-while` según el caso |
| Uso correcto de condicionales | `if/else` o `switch` según el caso |
| Entrada/salida clara | Uso adecuado de `Scanner` o `JOptionPane` |
| Ejercicios aprobados | Mínimo 4 de 6 ejercicios con salida correcta según los ejemplos |

