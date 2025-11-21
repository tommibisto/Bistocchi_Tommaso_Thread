# Bistocchi_Tommaso_Thread

Questo progetto è una simulazione molto semplice della produzione di uno skateboard usando i thread in Java.  
L’obiettivo è mostrare come due fasi del processo produttivo possano essere eseguite in parallelo usando `start()`, `sleep()` e `join()`.

## 1. Contenuto del progetto
- Main.java: avvia la produzione.
- ProductionManager.java: gestisce i thread (processo padre).
- ShapingThread.java: thread che simula la sagomatura.
- AssemblyThread.java: thread che simula l’assemblaggio.
- Skateboard.java: rappresenta lo skateboard prodotto.
- UML_Skateboard.pdf: diagramma UML richiesto.
- javadoc.zip: documentazione generata con IntelliJ.


## 2. come funziona
La classe ProductionManager crea uno skateboard e poi avvia due thread:
- uno per la fase di sagomatura,
- uno per la fase di assemblaggio.

I due thread vengono avviati insieme (in parallelo).  
Entrambi fanno una pausa usando `Thread.sleep()` per simulare il tempo di lavorazione.  
Alla fine ProductionManager usa `join()` per aspettare che i due thread abbiano finito.

Quando entrambi sono completati, lo skateboard viene considerato "FATTO".

## 3. Tecnologie usate
- Java
- IntelliJ IDEA per la javadoc
- Visual Paradigm Online per l’UML
- GitHub per il repository

## 4. Come compilare ed eseguire
Clonare il progetto: git clone https://github.com/<tuo-username>/Bistocchi_Tommaso_Thread.git

Compilare: javac -d out src/main/java/it/bistocchi/skateboard/*.java

Eseguire: java -cp out it.bistocchi.skateboard.Main

## 5. Javadoc
Per generare la Javadoc in IntelliJ:
- Tools → Generate JavaDoc…
- Selezionare la cartella `src/main/java`
- Scegliere una cartella di output (ad esempio `javadoc/`)
- Generare la documentazione
- Creare uno zip della cartella (javadoc.zip)

## 6. UML
Il diagramma UML contiene almeno tre classi:
- ProductionManager (processo padre)
- ShapingThread
- AssemblyThread  
È stato esportato in PDF ed è presente nel repository.

