#Two:top#
#Two:import#

# <line>:Two ::= <rule>
class Two(Line): #Two:class#

    className = "Two"
    ruleString = "<line>:Two ::= <rule>"
    rule = None

    def __init__(rule):
        #Two:init#
        self.rule = rule

#Two#
