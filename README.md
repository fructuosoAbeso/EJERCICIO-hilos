El objetivo del ejercicio era implementar un temporizador de cuenta atrás en una aplicación Android utilizando distintas alternativas para trabajar con hilos: Thread, AsyncTask y Coroutines. Además, se pedía que, al terminar la cuenta, se mostrara un mensaje y un botón para reiniciar o volver al principio.

2. Proceso de Implementación

Creación del proyecto y layout
Nuevo proyecto llamado EjemploHilos.
Se añadió un TextView con el id tvCrono para mostrar el temporizador.
Se añadió un Button oculto (btnIrAlPrincipio) que aparecería cuando el contador finalizara.

Implementación básica con Thread
Implementación con AsyncTask
Implementación con Coroutines

3. Errores encontrados y soluciones

Bloqueo de la interfaz con Thread en el hilo principal

Error: La aplicación dejaba de responder mientras Thread.sleep se ejecutaba.

Solución: Ejecutar la cuenta atrás en un Thread secundario y actualizar la UI con runOnUiThread.

Problemas de dependencias y compilación

Errores: Cannot access 'FullyDrawnReporterOwner' y Cannot access 'LifecycleOwner'.

Solución: Se corrigieron las dependencias en build.gradle añadiendo correctamente las librerías de AndroidX (core-ktx, appcompat, activity-ktx, etc.) y sincronizando el proyecto.

Botón para reiniciar no aparecía

Error: Inicialmente no había un mecanismo para mostrar un botón al terminar la cuenta.

Solución: Se añadió un Button con visibility="gone" y se programó para que se mostrara al terminar la cuenta atrás.

4. Resultado Final

Se implementaron las tres alternativas para trabajar con hilos: Thread, AsyncTask y Coroutines.

Cada una muestra un contador descendente de 10 segundos en un TextView.

Al finalizar la cuenta, se muestra el mensaje "Contador terminado" y aparece un botón que permite reiniciar el contador.

La aplicación mantiene la interfaz fluida, especialmente en la implementación con coroutines, que es la más recomendada actualmente.
