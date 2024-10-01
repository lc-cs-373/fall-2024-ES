//Optional:top//
//Optional:import//
import java.util.*;

// <token_rule>:Optional ::= TOKEN <RULE>
public class Optional extends Token_rule /*Optional:class*/ {

    public static final String $className = "Optional";
    public static final String $ruleString =
        "<token_rule>:Optional ::= TOKEN <RULE>";

    public Token rule;

    public Optional(Token rule) {
//Optional:init//
        this.rule = rule;
    }

    public static Optional parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<token_rule>:Optional", scn$.lno);
        scn$.match(Token.Match.TOKEN, trace$);
        Token rule = scn$.match(Token.Match.RULE, trace$);
        return new Optional(rule);
    }

//Optional//
}
