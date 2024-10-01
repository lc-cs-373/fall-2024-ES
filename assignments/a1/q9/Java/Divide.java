//Divide:top//
//Divide:import//
import java.util.*;

// <divide> ::= DIVIDER
public class Divide /*Divide:class*/ {

    public static final String $className = "Divide";
    public static final String $ruleString =
        "<divide> ::= DIVIDER";



    public Divide() {
//Divide:init//

    }

    public static Divide parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<divide>", scn$.lno);
        scn$.match(Token.Match.DIVIDER, trace$);
        return new Divide();
    }

//Divide//
}
