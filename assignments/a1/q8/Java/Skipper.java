//Skipper:top//
//Skipper:import//
import java.util.*;

// <rule>:Skipper ::= SKIP
public class Skipper extends Rule /*Skipper:class*/ {

    public static final String $className = "Skipper";
    public static final String $ruleString =
        "<rule>:Skipper ::= SKIP";



    public Skipper() {
//Skipper:init//

    }

    public static Skipper parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>:Skipper", scn$.lno);
        scn$.match(Token.Match.SKIP, trace$);
        return new Skipper();
    }

//Skipper//
}
