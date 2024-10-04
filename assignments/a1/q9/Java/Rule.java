//Rule:top//
//Rule:import//
import java.util.*;

public abstract class Rule /*Rule:class*/ {

    public static final String $className = "Rule";
    public static Rule parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case SKIP:
            return Skipper.parse(scn$,trace$);
        case TOKEN:
            return TokenerFull.parse(scn$,trace$);
        case ID:
            return TokenerShort.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Rule cannot begin with " + t$.errString()
            );
        }
    }

//Rule//
}
