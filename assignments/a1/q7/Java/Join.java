//Join:top//
//Join:import//
import java.util.*;

// <para>:Join ::= LP <para> RP <paras>
public class Join extends Para /*Join:class*/ {

    public static final String $className = "Join";
    public static final String $ruleString =
        "<para>:Join ::= LP <para> RP <paras>";

    public Para para;
    public Paras paras;

    public Join(Para para, Paras paras) {
//Join:init//
        this.para = para;
        this.paras = paras;
    }

    public static Join parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<para>:Join", scn$.lno);
        scn$.match(Token.Match.LP, trace$);
        Para para = Para.parse(scn$, trace$);
        scn$.match(Token.Match.RP, trace$);
        Paras paras = Paras.parse(scn$, trace$);
        return new Join(para, paras);
    }

//Join//
}
