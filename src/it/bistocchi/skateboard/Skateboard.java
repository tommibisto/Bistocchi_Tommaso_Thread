package it.bistocchi.skateboard;

/**
 * Rappresenta un semplice Skateboard prodotto.
 * Contiene solo informazioni concettuali (id e stato).
 */
public class Skateboard {
    private final int id;
    private String status;

    /**
     * Costruisce uno skateboard con id.
     * @param id identificatore del prodotto
     */
    public Skateboard(int id) {
        this.id = id;
        this.status = "CREATO";
    }

    /**
     * Imposta lo stato attuale dello skateboard.
     * @param status lo stato (es. "SHAPED", "ASSEMBLED", "DONE")
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Restituisce lo stato corrente.
     * @return stato corrente
     */
    public String getStatus() {
        return status;
    }

    /**
     * Restituisce l'id dello skateboard.
     * @return id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Skateboard{id=" + id + ", stato='" + status + "'}";
    }
}