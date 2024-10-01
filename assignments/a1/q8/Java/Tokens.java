//Tokens:top//
//Tokens:import//
import java.util.*;

// <rule>:Tokens ::= <token_rule>
public class Tokens extends Rule /*Tokens:class*/ {

    public static final String $className = "Tokens";
    public static final String $ruleString =
        "<rule>:Tokens ::= <token_rule>";

    public Token_rule token_rule;

    public Tokens(Token_rule token_rule) {
//Tokens:init//
        this.token_rule = token_rule;
    }

    public static Tokens parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>:Tokens", scn$.lno);
        Token_rule token_rule = Token_rule.parse(scn$, trace$);
        return new Tokens(token_rule);
    }

//Tokens//
}
