#NumsNode:top#
#NumsNode:import#

# <nums>:NumsNode ::= <NUM> <morenums>
class NumsNode(Nums): #NumsNode:class#

    className = "NumsNode"
    ruleString = "<nums>:NumsNode ::= <NUM> <morenums>"
    num = None
    morenums = None

    def __init__(num, morenums):
        #NumsNode:init#
        self.num = num
        self.morenums = morenums

#NumsNode#
