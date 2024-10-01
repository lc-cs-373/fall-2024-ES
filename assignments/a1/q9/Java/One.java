//One:top//
//One:import//
import java.util.*;

// <line>:One ::= <comment>
public class One extends Line /*One:class*/ {

    public static final String $className = "One";
    public static final String $ruleString =
        "<line>:One ::= <comment>";

    public Comment comment;

    public One(Comment comment) {
//One:init//
        this.comment = comment;
    }

    public static One parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>:One", scn$.lno);
        Comment comment = Comment.parse(scn$, trace$);
        return new One(comment);
    }

//One//
}
