//Wordy:top//
//Wordy:import//
import java.util.*;

// <word>:Wordy ::= WORDS
public class Wordy extends Word /*Wordy:class*/ {

    public static final String $className = "Wordy";
    public static final String $ruleString =
        "<word>:Wordy ::= WORDS";



    public Wordy() {
//Wordy:init//

    }

    public static Wordy parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<word>:Wordy", scn$.lno);
        scn$.match(Token.Match.WORDS, trace$);
        return new Wordy();
    }

//Wordy//
}
