//Q2:top//
//Q2:import//
import java.util.*;

// <q2> ::= <word>
public class Q2 extends _Start /*Q2:class*/ {

    public static final String $className = "Q2";
    public static final String $ruleString =
        "<q2> ::= <word>";

    public Word word;

    public Q2(Word word) {
//Q2:init//
        this.word = word;
    }

    public static Q2 parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<q2>", scn$.lno);
        Word word = Word.parse(scn$, trace$);
        return new Q2(word);
    }

//Q2//
}
