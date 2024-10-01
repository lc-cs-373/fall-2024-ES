//Word:top//
//Word:import//
import java.util.*;

public abstract class Word /*Word:class*/ {

    public static final String $className = "Word";
    public static Word parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case ID:
            return ID.parse(scn$,trace$);
        case WORDS:
            return Wordy.parse(scn$,trace$);
        case SYMBOL:
            return Symmmm.parse(scn$,trace$);
        case SKIP:
            return Skip.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Word cannot begin with " + t$.errString()
            );
        }
    }

//Word//
}
