#Join:top#
#Join:import#

# <para>:Join ::= LP <para> RP <paras>
class Join(Para): #Join:class#

    className = "Join"
    ruleString = "<para>:Join ::= LP <para> RP <paras>"
    para = None
    paras = None

    def __init__(para, paras):
        #Join:init#
        self.para = para
        self.paras = paras

#Join#
