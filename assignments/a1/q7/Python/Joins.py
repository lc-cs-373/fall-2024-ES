#Joins:top#
#Joins:import#

# <paras>:Joins ::= LP <paras> RP <para>
class Joins(Paras): #Joins:class#

    className = "Joins"
    ruleString = "<paras>:Joins ::= LP <paras> RP <para>"
    paras = None
    para = None

    def __init__(paras, para):
        #Joins:init#
        self.paras = paras
        self.para = para

#Joins#
