//NumsNode:top//
//NumsNode:import//
import java.util.*;

// <nums>:NumsNode ::= <NUM> <morenums>
public class NumsNode extends Nums /*NumsNode:class*/ {

    public static final String $className = "NumsNode";
    public static final String $ruleString =
        "<nums>:NumsNode ::= <NUM> <morenums>";

    public Token num;
    public Morenums morenums;

    public NumsNode(Token num, Morenums morenums) {
//NumsNode:init//
        this.num = num;
        this.morenums = morenums;
    }

    public static NumsNode parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<nums>:NumsNode", scn$.lno);
        Token num = scn$.match(Token.Match.NUM, trace$);
        Morenums morenums = Morenums.parse(scn$, trace$);
        return new NumsNode(num, morenums);
    }

//NumsNode//
}
