//Spaces:top//
//Spaces:import//
import java.util.*;

// <paras>:Spaces ::= 
public class Spaces extends Paras /*Spaces:class*/ {

    public static final String $className = "Spaces";
    public static final String $ruleString =
        "<paras>:Spaces ::= ";



    public Spaces() {
//Spaces:init//

    }

    public static Spaces parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<paras>:Spaces", scn$.lno);
        return new Spaces();
    }

//Spaces//
}
