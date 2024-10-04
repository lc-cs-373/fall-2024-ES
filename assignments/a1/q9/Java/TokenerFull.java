//TokenerFull:top//
//TokenerFull:import//
import java.util.*;

// <rule>:TokenerFull ::= <TOKEN> <ID> <RE>
public class TokenerFull extends Rule /*TokenerFull:class*/ {

    public static final String $className = "TokenerFull";
    public static final String $ruleString =
        "<rule>:TokenerFull ::= <TOKEN> <ID> <RE>";

    public Token token;
    public Token id;
    public Token re;

    public TokenerFull(Token token, Token id, Token re) {
//TokenerFull:init//
        this.token = token;
        this.id = id;
        this.re = re;
    }

    public static TokenerFull parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>:TokenerFull", scn$.lno);
        Token token = scn$.match(Token.Match.TOKEN, trace$);
        Token id = scn$.match(Token.Match.ID, trace$);
        Token re = scn$.match(Token.Match.RE, trace$);
        return new TokenerFull(token, id, re);
    }

    public String toString() {
        return token.toString() + " " + id.toString() + " " + re.toString();
    }

//TokenerFull//
}
