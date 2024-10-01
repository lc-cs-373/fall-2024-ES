//Balanced:top//
//Balanced:import//
import java.util.*;

// <balanced> ::= <para> AT
public class Balanced extends _Start /*Balanced:class*/ {

    public static final String $className = "Balanced";
    public static final String $ruleString =
        "<balanced> ::= <para> AT";

    public Para para;

    public Balanced(Para para) {
//Balanced:init//
        this.para = para;
    }

    public static Balanced parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<balanced>", scn$.lno);
        Para para = Para.parse(scn$, trace$);
        scn$.match(Token.Match.AT, trace$);
        return new Balanced(para);
    }

//Balanced//
}
