//Skip:top//
//Skip:import//
import java.util.*;

// <word>:Skip ::= SKIP
public class Skip extends Word /*Skip:class*/ {

    public static final String $className = "Skip";
    public static final String $ruleString =
        "<word>:Skip ::= SKIP";



    public Skip() {
//Skip:init//

    }

    public static Skip parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<word>:Skip", scn$.lno);
        scn$.match(Token.Match.SKIP, trace$);
        return new Skip();
    }

//Skip//
}
