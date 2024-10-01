//Line:top//
//Line:import//
import java.util.*;

public abstract class Line /*Line:class*/ {

    public static final String $className = "Line";
    public static Line parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case COMMENT:
            return One.parse(scn$,trace$);
        case DIVIDER:
            return Three.parse(scn$,trace$);
        case SKIP:
        case RULE:
        case TOKEN:
            return Two.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Line cannot begin with " + t$.errString()
            );
        }
    }

//Line//
}
