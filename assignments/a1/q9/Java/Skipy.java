//Skipy:top//
//Skipy:import//
import java.util.*;

// <rule>:Skipy ::= <skip_rule>
public class Skipy extends Rule /*Skipy:class*/ {

    public static final String $className = "Skipy";
    public static final String $ruleString =
        "<rule>:Skipy ::= <skip_rule>";

    public Skip_rule skip_rule;

    public Skipy(Skip_rule skip_rule) {
//Skipy:init//
        this.skip_rule = skip_rule;
    }

    public static Skipy parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>:Skipy", scn$.lno);
        Skip_rule skip_rule = Skip_rule.parse(scn$, trace$);
        return new Skipy(skip_rule);
    }

//Skipy//
}
