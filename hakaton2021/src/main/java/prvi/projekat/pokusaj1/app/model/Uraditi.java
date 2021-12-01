package prvi.projekat.pokusaj1.app.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Uraditi
{
    private Long id;
    private String naslov;
    private String opis;
    private Instant datum_kreiranja;
    private Boolean uradjen;
    private Tip_uradjenog tip;

}
