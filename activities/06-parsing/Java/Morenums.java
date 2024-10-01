//Morenums:top//
//Morenums:import//
import java.util.*;

public abstract class Morenums /*Morenums:class*/ {

    public static final String $className = "Morenums";
    public static Morenums parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case RIGHTBRACKET:
            return MoreNumsNull.parse(scn$,trace$);
        case COMMA:
            return MoreNumsNode.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Morenums cannot begin with " + t$.errString()
            );
        }
    }

//Morenums//
}
