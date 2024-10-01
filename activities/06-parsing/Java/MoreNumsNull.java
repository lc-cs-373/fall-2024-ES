//MoreNumsNull:top//
//MoreNumsNull:import//
import java.util.*;

// <morenums>:MoreNumsNull ::= 
public class MoreNumsNull extends Morenums /*MoreNumsNull:class*/ {

    public static final String $className = "MoreNumsNull";
    public static final String $ruleString =
        "<morenums>:MoreNumsNull ::= ";



    public MoreNumsNull() {
//MoreNumsNull:init//

    }

    public static MoreNumsNull parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<morenums>:MoreNumsNull", scn$.lno);
        return new MoreNumsNull();
    }

//MoreNumsNull//
}
