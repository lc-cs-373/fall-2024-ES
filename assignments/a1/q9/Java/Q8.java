//Q8:top//
//Q8:import//
import java.util.*;

// <q8> ::= <line>
public class Q8 extends _Start /*Q8:class*/ {

    public static final String $className = "Q8";
    public static final String $ruleString =
        "<q8> ::= <line>";

    public Line line;

    public Q8(Line line) {
//Q8:init//
        this.line = line;
    }

    public static Q8 parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<q8>", scn$.lno);
        Line line = Line.parse(scn$, trace$);
        return new Q8(line);
    }

//Q8//
}
