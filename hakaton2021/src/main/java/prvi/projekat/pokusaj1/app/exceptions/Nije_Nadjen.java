package prvi.projekat.pokusaj1.app.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Nije_Nadjen extends RuntimeException
{
    public Nije_Nadjen (String poruka)
    {
        super(poruka);
    }
}
