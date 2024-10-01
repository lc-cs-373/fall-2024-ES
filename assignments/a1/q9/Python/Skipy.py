#Skipy:top#
#Skipy:import#

# <rule>:Skipy ::= <skip_rule>
class Skipy(Rule): #Skipy:class#

    className = "Skipy"
    ruleString = "<rule>:Skipy ::= <skip_rule>"
    skip_rule = None

    def __init__(skip_rule):
        #Skipy:init#
        self.skip_rule = skip_rule

#Skipy#
