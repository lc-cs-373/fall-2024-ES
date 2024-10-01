//Paras:top//
//Paras:import//
import java.util.*;

public abstract class Paras /*Paras:class*/ {

    public static final String $className = "Paras";
    public static Paras parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case RP:
        case AT:
            return Spaces.parse(scn$,trace$);
        case LP:
            return Joins.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Paras cannot begin with " + t$.errString()
            );
        }
    }

//Paras//
}
