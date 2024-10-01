//ID:top//
//ID:import//
import java.util.*;

// <word>:ID ::= ID
public class ID extends Word /*ID:class*/ {

    public static final String $className = "ID";
    public static final String $ruleString =
        "<word>:ID ::= ID";



    public ID() {
//ID:init//

    }

    public static ID parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<word>:ID", scn$.lno);
        scn$.match(Token.Match.ID, trace$);
        return new ID();
    }

//ID//
}
