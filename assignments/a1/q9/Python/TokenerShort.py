#TokenerShort:top#
#TokenerShort:import#

# <rule>:TokenerShort ::= <ID> <RE>
class TokenerShort(Rule): #TokenerShort:class#

    className = "TokenerShort"
    ruleString = "<rule>:TokenerShort ::= <ID> <RE>"
    id = None
    re = None

    def __init__(id, re):
        #TokenerShort:init#
        self.id = id
        self.re = re

#TokenerShort#
