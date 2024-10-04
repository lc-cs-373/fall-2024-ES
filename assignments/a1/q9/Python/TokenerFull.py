#TokenerFull:top#
#TokenerFull:import#

# <rule>:TokenerFull ::= <TOKEN> <ID> <RE>
class TokenerFull(Rule): #TokenerFull:class#

    className = "TokenerFull"
    ruleString = "<rule>:TokenerFull ::= <TOKEN> <ID> <RE>"
    token = None
    id = None
    re = None

    def __init__(token, id, re):
        #TokenerFull:init#
        self.token = token
        self.id = id
        self.re = re

#TokenerFull#
