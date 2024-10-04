//Commenter:top//
//Commenter:import//
import java.util.*;

// <word>:Commenter ::= COMMENT
public class Commenter extends Word /*Commenter:class*/ {

    public static final String $className = "Commenter";
    public static final String $ruleString =
        "<word>:Commenter ::= COMMENT";



    public Commenter() {
//Commenter:init//

    }

    public static Commenter parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<word>:Commenter", scn$.lno);
        scn$.match(Token.Match.COMMENT, trace$);
        return new Commenter();
    }

//Commenter//
}
