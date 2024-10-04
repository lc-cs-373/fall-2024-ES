//Comment:top//
//Comment:import//
import java.util.*;

// <line>:Comment ::= <COMMENT>
public class Comment extends Line /*Comment:class*/ {

    public static final String $className = "Comment";
    public static final String $ruleString =
        "<line>:Comment ::= <COMMENT>";

    public Token comment;

    public Comment(Token comment) {
//Comment:init//
        this.comment = comment;
    }

    public static Comment parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>:Comment", scn$.lno);
        Token comment = scn$.match(Token.Match.COMMENT, trace$);
        return new Comment(comment);
    }

    public String toString() {
        return comment.toString();
    }

//Comment//
}
