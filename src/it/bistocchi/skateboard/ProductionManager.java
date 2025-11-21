package it.bistocchi.skateboard;


/**

 * Processo padre che coordina la produzione: lancia in parallelo

 * almeno due thread per ogni skate e poi attende il completamento.

 */

public class ProductionManager {


    /**

     * Esegue la produzione di un singolo skateboard:

     * lancia ShapingThread e AssemblyThread in parallelo e aspetta con join().

     *

     * @param id id dello skateboard

     * @throws InterruptedException se il thread corrente viene interrotto

     */

    public Skateboard produceOne(int id) throws InterruptedException {

        Skateboard board = new Skateboard(id);


        Thread shaping = new ShapingThread(board);

        Thread assembly = new AssemblyThread(board);


        // Avvio in parallelo

        shaping.start();

        assembly.start();


        // il padre aspetta che i figli completino (join richiesto)

        shaping.join();

        assembly.join();


        // dopo join, lo stato riflette l'ultima fase completata

        board.setStatus("FATTO");

        System.out.println("ProductionManager: skateboard " + id + " produzione completata -> " + board);

        return board;

    }


    /**

     * Produce più skateboard in sequenza (esempio).

     *

     * @param count numero di skateboard da produrre

     */

    public void produceBatch(int count) {

        for (int i = 1; i <= count; i++) {

            try {

                produceOne(i);

            } catch (InterruptedException e) {

                System.out.println("ProductionManager: produzione interrotta");

                Thread.currentThread().interrupt();

            }

        }

    }

}