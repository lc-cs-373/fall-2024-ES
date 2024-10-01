//Three:top//
//Three:import//
import java.util.*;

// <line>:Three ::= <divide>
public class Three extends Line /*Three:class*/ {

    public static final String $className = "Three";
    public static final String $ruleString =
        "<line>:Three ::= <divide>";

    public Divide divide;

    public Three(Divide divide) {
//Three:init//
        this.divide = divide;
    }

    public static Three parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>:Three", scn$.lno);
        Divide divide = Divide.parse(scn$, trace$);
        return new Three(divide);
    }

//Three//
}
