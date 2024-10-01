//Expressive:top//
//Expressive:import//
import java.util.*;

// <token_rule>:Expressive ::= RULE
public class Expressive extends Token_rule /*Expressive:class*/ {

    public static final String $className = "Expressive";
    public static final String $ruleString =
        "<token_rule>:Expressive ::= RULE";



    public Expressive() {
//Expressive:init//

    }

    public static Expressive parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<token_rule>:Expressive", scn$.lno);
        scn$.match(Token.Match.RULE, trace$);
        return new Expressive();
    }

//Expressive//
}
