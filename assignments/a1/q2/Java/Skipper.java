//Skipper:top//
//Skipper:import//
import java.util.*;

// <word>:Skipper ::= SKIP
public class Skipper extends Word /*Skipper:class*/ {

    public static final String $className = "Skipper";
    public static final String $ruleString =
        "<word>:Skipper ::= SKIP";



    public Skipper() {
//Skipper:init//

    }

    public static Skipper parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<word>:Skipper", scn$.lno);
        scn$.match(Token.Match.SKIP, trace$);
        return new Skipper();
    }

//Skipper//
}
