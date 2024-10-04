//Word:top//
//Word:import//
import java.util.*;

public abstract class Word /*Word:class*/ {

    public static final String $className = "Word";
    public static Word parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case SKIP:
            return Skipper.parse(scn$,trace$);
        case COMMENT:
            return Commenter.parse(scn$,trace$);
        case TOKEN:
            return Tokener.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Word cannot begin with " + t$.errString()
            );
        }
    }

//Word//
}
