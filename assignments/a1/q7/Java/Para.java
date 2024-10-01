//Para:top//
//Para:import//
import java.util.*;

public abstract class Para /*Para:class*/ {

    public static final String $className = "Para";
    public static Para parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case RP:
        case AT:
            return Space.parse(scn$,trace$);
        case LP:
            return Join.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Para cannot begin with " + t$.errString()
            );
        }
    }

//Para//
}
