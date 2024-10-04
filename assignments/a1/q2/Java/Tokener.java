//Tokener:top//
//Tokener:import//
import java.util.*;

// <word>:Tokener ::= TOKEN
public class Tokener extends Word /*Tokener:class*/ {

    public static final String $className = "Tokener";
    public static final String $ruleString =
        "<word>:Tokener ::= TOKEN";



    public Tokener() {
//Tokener:init//

    }

    public static Tokener parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<word>:Tokener", scn$.lno);
        scn$.match(Token.Match.TOKEN, trace$);
        return new Tokener();
    }

//Tokener//
}
