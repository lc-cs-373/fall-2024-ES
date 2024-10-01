#Tokens:top#
#Tokens:import#

# <rule>:Tokens ::= <token_rule>
class Tokens(Rule): #Tokens:class#

    className = "Tokens"
    ruleString = "<rule>:Tokens ::= <token_rule>"
    token_rule = None

    def __init__(token_rule):
        #Tokens:init#
        self.token_rule = token_rule

#Tokens#
