
# ISO2-2024-C03-Testing-P1


## *Grupo C03-Problema1 - Ingeniería del Software 2*  
Bienvenido al repositorio del grupo de laboratorio C03-Problema1  

## *1. Implementación*
Realizado por:
| Nombre                       | Correo                       |
|------------------------------|------------------------------|
| Alejandro Fernández Muñoz    | alejandro.fdez3@alu.uclm.es   |
| Lucía García Sánchez	         | lucia.garcia72@alu.uclm.es  |


## *2. Gestión de Pruebas*
Realizado por:

| Nombre                       | Correo                       |
|------------------------------|------------------------------|
| Elías González Valdepeñas    | elias.gonzalez@alu.uclm.es   |
| Jesús Calleja Soto	         | jesus.callejas@alu.uclm.es  |

![image](https://github.com/user-attachments/assets/4f0719c8-e801-443a-acc2-a22a98980dbc)


## *3. Testing con JUnit*
Realizado por:
| Nombre                              | Correo                                                       |
| ----------------------------------- | ------------------------------------------------------------ |
| Arturo Avilés Morillas              | [arturo.aviles@alu.uclm.es](mailto:arturo.aviles@alu.uclm.es) |
| María Belén Gallego-Casilda Sánchez | [mbelen.gallego@alu.uclm.es](mailto:mbelen.gallego@alu.uclm.es)| 

![WhatsApp Image 2024-12-15 at 20 59 00](https://github.com/user-attachments/assets/bdac7164-26e0-4b96-b109-7aa1701c8dc4)
## Explicación del resultado de cobertura de 0

La cobertura de código es una métrica importante que nos ayuda a entender qué tan bien estamos probando nuestro código. En este caso, el resultado de cobertura de **0** se debió a una combinación de problemas en las pruebas unitarias y la configuración de la herramienta de análisis de cobertura JaCoCo.



### 1. **Pruebas unitarias mal hechas (JUnit)**

Uno de los principales motivos por los cuales la cobertura fue de **0** es que las pruebas unitarias no fueron correctamente implementadas. Estaban todavia realizandose las pruebas para configurar jacoco correctamente y estas pruebas eran unicamente para ver si devolvia cierta cobertura, aunque las propias pruebas tampoco iban a devolver nada porque estaban mal hechas de un principio

### 2. **Configuración incorrecta de JaCoCo**

Otro motivo importante de la cobertura de **0** fue que la herramienta JaCoCo no estaba bien configurada en el proyecto como ya he dicho antes. JaCoCo es la herramienta encargada de analizar qué partes del código se ejecutan durante las pruebas. Si no está correctamente configurada, no puede registrar la cobertura adecuadamente. 

El error que decubrimos tras muchas pruebas es que ni JaCoCo era capaz de acceder a las pruebas debido a que estas no devolvian la informacion que necesitaba como que al principio el pom destruia la carpeta site al final de la verificacion teniendo que recrearla posteriormente para que asi almacenase algun dato

### Conclusión

La cobertura de **0** en este caso fue el resultado de una combinación de pruebas unitarias mal implementadas (que no cubrían adecuadamente el código) y una configuración incorrecta de JaCoCo (que impidió el análisis adecuado de la cobertura). Para solucionar este problema, reescribimos las pruebas unitarias usando las que ibamos a necesitar y reconfiguramos el pom para que no destruyera la carpeta site nada mas crearla.



