//TokenerFull:top//
//TokenerFull:import//
import java.util.*;

// <rule>:TokenerFull ::= TOKEN
public class TokenerFull extends Rule /*TokenerFull:class*/ {

    public static final String $className = "TokenerFull";
    public static final String $ruleString =
        "<rule>:TokenerFull ::= TOKEN";



    public TokenerFull() {
//TokenerFull:init//

    }

    public static TokenerFull parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>:TokenerFull", scn$.lno);
        scn$.match(Token.Match.TOKEN, trace$);
        return new TokenerFull();
    }

//TokenerFull//
}
