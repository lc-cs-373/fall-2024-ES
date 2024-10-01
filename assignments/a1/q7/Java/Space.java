//Space:top//
//Space:import//
import java.util.*;

// <para>:Space ::= 
public class Space extends Para /*Space:class*/ {

    public static final String $className = "Space";
    public static final String $ruleString =
        "<para>:Space ::= ";



    public Space() {
//Space:init//

    }

    public static Space parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<para>:Space", scn$.lno);
        return new Space();
    }

//Space//
}
