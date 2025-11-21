
package it.bistocchi.skateboard;


/**

 * Thread che simula la fase di sagomatura (shaping) della tavola.

 */

public class ShapingThread extends Thread {

    private final Skateboard board;


    /**

     * Costruisce il thread di shaping per uno skateboard.

     * @param board skateboard di riferimento

     */

    public ShapingThread(Skateboard board) {

        super("ShapingThread-" + board.getId());

        this.board = board;

    }


    @Override

    public void run() {

        try {

            System.out.println(getName() + ": inizio sagomatura tavola " + board.getId());

            Thread.sleep(700); // simulazione tempo di sagomatura

            board.setStatus("SHAPED");

            System.out.println(getName() + ": finisco sagomatura tavola " + board.getId());

        } catch (InterruptedException e) {

            System.out.println(getName() + ": interrotto durante la sagomatura");

            Thread.currentThread().interrupt();

        }

    }

}