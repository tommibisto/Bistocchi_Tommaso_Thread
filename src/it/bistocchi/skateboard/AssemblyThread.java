

package it.bistocchi.skateboard;


/**

 * Thread che simula la fase di assemblaggio (montaggio trucks/wheels).

 */

public class AssemblyThread extends Thread {

    private final Skateboard board;


    /**

     * Costruisce il thread di assemblaggio per uno skateboard.

     * @param board skateboard di riferimento

     */

    public AssemblyThread(Skateboard board) {

        super("AssemblyThread-" + board.getId());

        this.board = board;

    }


    @Override

    public void run() {

        try {

            System.out.println(getName() + ": inizio assemblaggio tavola " + board.getId());

            Thread.sleep(500); // simulazione tempo di assemblaggio

            board.setStatus("ASSEMBLED");

            System.out.println(getName() + ": finisco assemblaggio tavola " + board.getId());

        } catch (InterruptedException e) {

            System.out.println(getName() + ": interrotto durante l'assemblaggio");

            Thread.currentThread().interrupt();

        }

    }

}