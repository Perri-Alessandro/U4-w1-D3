package es_3.entities;

import java.time.Instant;
import java.util.UUID;

public class Cliente {
    private String codiceCliente;
    private String nameSurname;
    private String email;
    private String dataIscrizione;

    public Cliente( String nameSurname, String email) {
        this.codiceCliente = UUID.randomUUID().toString();
        this.nameSurname = nameSurname;
        this.email = email;
        Instant LocalDate = null;
        this.dataIscrizione = LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return
                "codiceCliente='" + codiceCliente + '\'' +
                ", nameSurname='" + nameSurname + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione='" + dataIscrizione + '\''
                ;
    }
}
