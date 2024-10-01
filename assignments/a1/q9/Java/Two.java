//Two:top//
//Two:import//
import java.util.*;

// <line>:Two ::= <rule>
public class Two extends Line /*Two:class*/ {

    public static final String $className = "Two";
    public static final String $ruleString =
        "<line>:Two ::= <rule>";

    public Rule rule;

    public Two(Rule rule) {
//Two:init//
        this.rule = rule;
    }

    public static Two parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>:Two", scn$.lno);
        Rule rule = Rule.parse(scn$, trace$);
        return new Two(rule);
    }

//Two//
}
