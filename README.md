# Documentación de las Clases de Prueba – Taller JUnit 5

## 1. CalculadoraTest  
**Objetivo:** Verificar que la suma de dos números enteros funciona correctamente.  
**Método probado:** `sumar(int a, int b)` de la clase `Calculadora`.  

**Pruebas realizadas:**  
- `testSumaPositivos()`: verifica que `3 + 4 = 7` usando `assertEquals`.  

---

## 2. MayorEdadTest  
**Objetivo:** Determinar si una persona es mayor de edad (≥ 18 años).  
**Método probado:** `esMayorDeEdad(int edad)` de la clase `Persona`.  

**Pruebas realizadas:**  
- `testMayorEdad()`: con 25 años debe ser verdadero (`assertTrue`).  
- `testMenorEdad()`: con 17 años debe ser falso (`assertFalse`).

---

## 3. ConcatenarCadenasTest  
**Objetivo:** Verificar que la concatenación de cadenas sea correcta.  
**Método probado:** `concatenar(String a, String b)` de la clase `Concatenador`.  

**Pruebas realizadas:**  
- `testConcatenacionCorrecta()`: `"JUnit" + "5"` debe ser `"JUnit5"` (`assertEquals`).  
- `testConcatenacionIncorrecta()`: `"hola" + "mundo"` no debe ser `"hola mundo "` (`assertNotEquals`).  

---

## 4. UsuarioAdminTest  
**Objetivo:** Garantizar que el sistema bloquee el nombre de usuario `"admin"`.  
**Método probado:** `obtenerUsuario(String nombre)` de la clase `Usuario`.  

**Pruebas realizadas:**  
- `testAdminDevuelveNull()`: `"admin"` debe devolver `null` (`assertNull`).  
- `testOtroUsuarioNoEsNull()`: cualquier otro usuario, como `"john"`, no debe ser `null` (`assertNotNull`).  

---

## 5. DescuentoTiendaTest  
**Objetivo:** Calcular el precio final con descuento del 10% si la compra es ≥ 100000.  
**Método probado:** `aplicarDescuento(BigDecimal precio)` de la clase `Tienda`.  

**Pruebas realizadas:**  
- `testConDescuento()`: `200000 → 180000.0` (`assertEquals`).  
- `testSinDescuento()`: `90000 → 90000` (`assertEquals`).  

---

## 6. PalindromoTest  
**Objetivo:** Verificar si una palabra o frase es un palíndromo.  
**Método probado:** `esPalindromo(String palabra)` de la clase `Palindromo`.  

**Pruebas realizadas:**  
- `testPalindromoValido()`: `"Anita lava la tina"` debe ser verdadero (`assertTrue`).  
- `testNoPalindromo()`: `"Filokallianthropía"` debe ser falso (`assertFalse`).  
- `testNull()`: si la entrada es `null`, debe devolver `false`(`assertFalse`).

---

## 7. GestorTareasTest  
**Objetivo:** Comprobar que el gestor de tareas devuelve `null` si no hay tareas y no `null` si se agregan.  
**Método probado:** `obtenerTareas()` de la clase `GestorTareas`.  

**Pruebas realizadas:**  
- `testSinTareasDevuelveNull()`: al no agregar nada, debe devolver `null` (`assertNull`).  
- `testConTareasNoEsNull()`: al agregar `"Hacer taller"`, debe devolver una lista (`assertNotNull`).  

---

## 8. ValidadorContrasenaTest  
**Objetivo:** Validar la fortaleza de una contraseña.  
**Método probado:** `esFuerte(String password)` de la clase `ValidadorPassword`.  

**Criterios de fortaleza:** Mínimo 8 caracteres y al menos un número.  

**Pruebas realizadas:**  
- `testPasswordFuerte()`: `"password123"` es válida (`assertTrue`).  
- `testPasswordCorta()`: `"pass1"` es débil por corta (`assertFalse`).  
- `testPasswordSinNumeros()`: `"passwordlong"` es débil por no tener números (`assertFalse`).  

---

## 9. FactorialTest  
**Objetivo:** Validar el cálculo del factorial.  
**Método probado:** `calcular(int n)` de la clase `Factorial`.  

**Pruebas realizadas:**  
- `testFactorial5()`: `5! = 120` (`assertEquals`).  
- `testFactorial0()`: `0! = 1` (`assertEquals`).  
- `testFactorialIncorrecto()`: `5!` no debe ser `121` (`assertNotEquals`).  

---

## 10. BuscadorCorreoTest  
**Objetivo:** Buscar un usuario en una lista a partir de su correo electrónico.  
**Método probado:** `buscarPorCorreo(List<UsuarioCorreo> usuarios, String correo)` de la clase `BuscadorUsuario`.  

**Pruebas realizadas:**  
- `testUsuarioEncontrado()`: con correo `"juan@mail.com"` debe devolver un usuario con nombre `"Juan"` (`assertNotNull`, `assertEquals`).  
- `testUsuarioNoEncontrado()`: con correo inexistente debe devolver `null` (`assertNull`).  
