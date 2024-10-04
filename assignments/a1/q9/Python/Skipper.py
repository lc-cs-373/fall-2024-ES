#Skipper:top#
#Skipper:import#

# <rule>:Skipper ::= SKIP <ID> <RE>
class Skipper(Rule): #Skipper:class#

    className = "Skipper"
    ruleString = "<rule>:Skipper ::= SKIP <ID> <RE>"
    id = None
    re = None

    def __init__(id, re):
        #Skipper:init#
        self.id = id
        self.re = re

#Skipper#
