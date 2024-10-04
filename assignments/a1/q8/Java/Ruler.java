//Ruler:top//
//Ruler:import//
import java.util.*;

// <line>:Ruler ::= <rule>
public class Ruler extends Line /*Ruler:class*/ {

    public static final String $className = "Ruler";
    public static final String $ruleString =
        "<line>:Ruler ::= <rule>";

    public Rule rule;

    public Ruler(Rule rule) {
//Ruler:init//
        this.rule = rule;
    }

    public static Ruler parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>:Ruler", scn$.lno);
        Rule rule = Rule.parse(scn$, trace$);
        return new Ruler(rule);
    }

//Ruler//
}
