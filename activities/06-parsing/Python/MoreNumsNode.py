#MoreNumsNode:top#
#MoreNumsNode:import#

# <morenums>:MoreNumsNode ::= COMMA <NUM> <morenums>
class MoreNumsNode(Morenums): #MoreNumsNode:class#

    className = "MoreNumsNode"
    ruleString = "<morenums>:MoreNumsNode ::= COMMA <NUM> <morenums>"
    num = None
    morenums = None

    def __init__(num, morenums):
        #MoreNumsNode:init#
        self.num = num
        self.morenums = morenums

#MoreNumsNode#
