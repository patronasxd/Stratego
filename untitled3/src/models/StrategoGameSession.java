package models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class StrategoGameSession {

    private LocalDate startTime;
    private int movesCounter;


    public StrategoGameSession() {
        this.startTime = LocalDate.now();
        this.movesCounter = 0;
    }
}
