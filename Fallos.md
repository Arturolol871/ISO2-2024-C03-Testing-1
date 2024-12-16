## Explicación del resultado de cobertura de 0

La cobertura de código es una métrica importante que nos ayuda a entender qué tan bien estamos probando nuestro código. En este caso, el resultado de cobertura de **0** se debió a una combinación de problemas en las pruebas unitarias y la configuración de la herramienta de análisis de cobertura JaCoCo.

![WhatsApp Image 2024-12-15 at 20 59 00](https://github.com/user-attachments/assets/bdac7164-26e0-4b96-b109-7aa1701c8dc4)

### 1. **Pruebas unitarias mal hechas (JUnit)**

Uno de los principales motivos por los cuales la cobertura fue de **0** es que las pruebas unitarias no fueron correctamente implementadas. Estaban todavia realizandose las pruebas para configurar jacoco correctamente y estas pruebas eran unicamente para ver si devolvia cierta cobertura, aunque las propias pruebas tampoco iban a devolver nada porque estaban mal hechas de un principio

### 2. **Configuración incorrecta de JaCoCo**

Otro motivo importante de la cobertura de **0** fue que la herramienta JaCoCo no estaba bien configurada en el proyecto como ya he dicho antes. JaCoCo es la herramienta encargada de analizar qué partes del código se ejecutan durante las pruebas. Si no está correctamente configurada, no puede registrar la cobertura adecuadamente. 

El error que decubrimos tras muchas pruebas es que ni JaCoCo era capaz de acceder a las pruebas debido a que estas no devolvian la informacion que necesitaba como que al principio el pom destruia la carpeta site al final de la verificacion teniendo que recrearla posteriormente para que asi almacenase algun dato

### Conclusión

La cobertura de **0** en este caso fue el resultado de una combinación de pruebas unitarias mal implementadas (que no cubrían adecuadamente el código) y una configuración incorrecta de JaCoCo (que impidió el análisis adecuado de la cobertura). Para solucionar este problema, reescribimos las pruebas unitarias usando las que ibamos a necesitar y reconfiguramos el pom para que no destruyera la carpeta site nada mas crearla.
