#Three:top#
#Three:import#

# <line>:Three ::= <divide>
class Three(Line): #Three:class#

    className = "Three"
    ruleString = "<line>:Three ::= <divide>"
    divide = None

    def __init__(divide):
        #Three:init#
        self.divide = divide

#Three#
