//Token_rule:top//
//Token_rule:import//
import java.util.*;

public abstract class Token_rule /*Token_rule:class*/ {

    public static final String $className = "Token_rule";
    public static Token_rule parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case TOKEN:
            return Optional.parse(scn$,trace$);
        case RULE:
            return Expressive.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Token_rule cannot begin with " + t$.errString()
            );
        }
    }

//Token_rule//
}
