#One:top#
#One:import#

# <line>:One ::= <comment>
class One(Line): #One:class#

    className = "One"
    ruleString = "<line>:One ::= <comment>"
    comment = None

    def __init__(comment):
        #One:init#
        self.comment = comment

#One#
