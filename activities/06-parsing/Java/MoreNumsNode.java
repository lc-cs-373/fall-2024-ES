//MoreNumsNode:top//
//MoreNumsNode:import//
import java.util.*;

// <morenums>:MoreNumsNode ::= COMMA <NUM> <morenums>
public class MoreNumsNode extends Morenums /*MoreNumsNode:class*/ {

    public static final String $className = "MoreNumsNode";
    public static final String $ruleString =
        "<morenums>:MoreNumsNode ::= COMMA <NUM> <morenums>";

    public Token num;
    public Morenums morenums;

    public MoreNumsNode(Token num, Morenums morenums) {
//MoreNumsNode:init//
        this.num = num;
        this.morenums = morenums;
    }

    public static MoreNumsNode parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<morenums>:MoreNumsNode", scn$.lno);
        scn$.match(Token.Match.COMMA, trace$);
        Token num = scn$.match(Token.Match.NUM, trace$);
        Morenums morenums = Morenums.parse(scn$, trace$);
        return new MoreNumsNode(num, morenums);
    }

//MoreNumsNode//
}
