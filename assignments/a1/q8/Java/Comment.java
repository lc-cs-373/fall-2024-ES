//Comment:top//
//Comment:import//
import java.util.*;

// <comment> ::= COMMENT
public class Comment /*Comment:class*/ {

    public static final String $className = "Comment";
    public static final String $ruleString =
        "<comment> ::= COMMENT";



    public Comment() {
//Comment:init//

    }

    public static Comment parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<comment>", scn$.lno);
        scn$.match(Token.Match.COMMENT, trace$);
        return new Comment();
    }

//Comment//
}
