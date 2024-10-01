//Joins:top//
//Joins:import//
import java.util.*;

// <paras>:Joins ::= LP <paras> RP <para>
public class Joins extends Paras /*Joins:class*/ {

    public static final String $className = "Joins";
    public static final String $ruleString =
        "<paras>:Joins ::= LP <paras> RP <para>";

    public Paras paras;
    public Para para;

    public Joins(Paras paras, Para para) {
//Joins:init//
        this.paras = paras;
        this.para = para;
    }

    public static Joins parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<paras>:Joins", scn$.lno);
        scn$.match(Token.Match.LP, trace$);
        Paras paras = Paras.parse(scn$, trace$);
        scn$.match(Token.Match.RP, trace$);
        Para para = Para.parse(scn$, trace$);
        return new Joins(paras, para);
    }

//Joins//
}
