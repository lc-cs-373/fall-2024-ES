#Ruler:top#
#Ruler:import#

# <line>:Ruler ::= <rule>
class Ruler(Line): #Ruler:class#

    className = "Ruler"
    ruleString = "<line>:Ruler ::= <rule>"
    rule = None

    def __init__(rule):
        #Ruler:init#
        self.rule = rule

#Ruler#
