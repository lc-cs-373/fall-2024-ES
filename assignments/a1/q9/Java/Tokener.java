//Tokener:top//
//Tokener:import//
import java.util.*;

// <rule>:Tokener ::= <TOKEN> <ID> <RE>
public class Tokener extends Rule /*Tokener:class*/ {

    public static final String $className = "Tokener";
    public static final String $ruleString =
        "<rule>:Tokener ::= <TOKEN> <ID> <RE>";

    public Token token;
    public Token id;
    public Token re;

    public Tokener(Token token, Token id, Token re) {
//Tokener:init//
        this.token = token;
        this.id = id;
        this.re = re;
    }

    public static Tokener parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>:Tokener", scn$.lno);
        Token token = scn$.match(Token.Match.TOKEN, trace$);
        Token id = scn$.match(Token.Match.ID, trace$);
        Token re = scn$.match(Token.Match.RE, trace$);
        return new Tokener(token, id, re);
    }

//Tokener//
}
