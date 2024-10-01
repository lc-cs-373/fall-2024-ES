#Balanced:top#
#Balanced:import#

# <balanced> ::= <para> AT
class Balanced(_Start): #Balanced:class#

    className = "Balanced"
    ruleString = "<balanced> ::= <para> AT"
    para = None

    def __init__(para):
        #Balanced:init#
        self.para = para

#Balanced#
