//Symmmm:top//
//Symmmm:import//
import java.util.*;

// <word>:Symmmm ::= SYMBOL
public class Symmmm extends Word /*Symmmm:class*/ {

    public static final String $className = "Symmmm";
    public static final String $ruleString =
        "<word>:Symmmm ::= SYMBOL";



    public Symmmm() {
//Symmmm:init//

    }

    public static Symmmm parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<word>:Symmmm", scn$.lno);
        scn$.match(Token.Match.SYMBOL, trace$);
        return new Symmmm();
    }

//Symmmm//
}
