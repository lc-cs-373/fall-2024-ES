//Skipper:top//
//Skipper:import//
import java.util.*;

// <rule>:Skipper ::= SKIP <ID> <RE>
public class Skipper extends Rule /*Skipper:class*/ {

    public static final String $className = "Skipper";
    public static final String $ruleString =
        "<rule>:Skipper ::= SKIP <ID> <RE>";

    public Token id;
    public Token re;

    public Skipper(Token id, Token re) {
//Skipper:init//
        this.id = id;
        this.re = re;
    }

    public static Skipper parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>:Skipper", scn$.lno);
        scn$.match(Token.Match.SKIP, trace$);
        Token id = scn$.match(Token.Match.ID, trace$);
        Token re = scn$.match(Token.Match.RE, trace$);
        return new Skipper(id, re);
    }

    public String toString() {
        return "skip " + id.toString() + " " + re.toString();
    }

//Skipper//
}
