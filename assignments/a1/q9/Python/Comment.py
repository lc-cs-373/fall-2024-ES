#Comment:top#
#Comment:import#

# <line>:Comment ::= <COMMENT>
class Comment(Line): #Comment:class#

    className = "Comment"
    ruleString = "<line>:Comment ::= <COMMENT>"
    comment = None

    def __init__(comment):
        #Comment:init#
        self.comment = comment

#Comment#
