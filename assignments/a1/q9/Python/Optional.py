#Optional:top#
#Optional:import#

# <token_rule>:Optional ::= TOKEN <RULE>
class Optional(Token_rule): #Optional:class#

    className = "Optional"
    ruleString = "<token_rule>:Optional ::= TOKEN <RULE>"
    rule = None

    def __init__(rule):
        #Optional:init#
        self.rule = rule

#Optional#
