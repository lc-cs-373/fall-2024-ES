//TokenerShort:top//
//TokenerShort:import//
import java.util.*;

// <rule>:TokenerShort ::= <ID> <RE>
public class TokenerShort extends Rule /*TokenerShort:class*/ {

    public static final String $className = "TokenerShort";
    public static final String $ruleString =
        "<rule>:TokenerShort ::= <ID> <RE>";

    public Token id;
    public Token re;

    public TokenerShort(Token id, Token re) {
//TokenerShort:init//
        this.id = id;
        this.re = re;
    }

    public static TokenerShort parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>:TokenerShort", scn$.lno);
        Token id = scn$.match(Token.Match.ID, trace$);
        Token re = scn$.match(Token.Match.RE, trace$);
        return new TokenerShort(id, re);
    }

    public String toString() {
        return id.toString() + " " + re.toString();
    }

//TokenerShort//
}
