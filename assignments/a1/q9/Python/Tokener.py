#Tokener:top#
#Tokener:import#

# <rule>:Tokener ::= <TOKEN> <ID> <RE>
class Tokener(Rule): #Tokener:class#

    className = "Tokener"
    ruleString = "<rule>:Tokener ::= <TOKEN> <ID> <RE>"
    token = None
    id = None
    re = None

    def __init__(token, id, re):
        #Tokener:init#
        self.token = token
        self.id = id
        self.re = re

#Tokener#
