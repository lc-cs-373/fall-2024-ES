//Skip_rule:top//
//Skip_rule:import//
import java.util.*;

// <skip_rule> ::= SKIP
public class Skip_rule /*Skip_rule:class*/ {

    public static final String $className = "Skip_rule";
    public static final String $ruleString =
        "<skip_rule> ::= SKIP";



    public Skip_rule() {
//Skip_rule:init//

    }

    public static Skip_rule parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<skip_rule>", scn$.lno);
        scn$.match(Token.Match.SKIP, trace$);
        return new Skip_rule();
    }

//Skip_rule//
}
