
def main():
    printTableFunction1()
    printTableFunction2()
    #printWholeTable()
    #printTest()
######################
def Conjunction(p, q):
    return p and q

def Disjunction(p, q):
    return p or q

def Conditional(p, q):
    return (not p or q)

def Biconditional(p, q):
    return (not p or q) and (not q or p)

def Negation(p):
    return not p
######################
def printTableFunction1():
    printSingleHeader("Conditional [not p -> q]")
    for p in [True, False]:
        for q in [True, False]:
            print("|\t" + str(p) + "\t|\t" + str(q) + "\t|\t" + str(Conditional(not p, q)) + "\t\t\t|")
            printFrame()
                
def printTableFunction2():
    printSingleHeader("Disjunction [p or q]")
    for p in [True, False]:
        for q in [True, False]:
            print("|\t" + str(p) + "\t|\t" + str(q) + "\t|\t" + str(Disjunction(p, q)) + "\t\t\t|")
            printFrame()
######################
def printWholeTable():
    printWholeHeader()
    for p in [True, False]:
        for q in [True, False]:
            print("|\t" + str(p) + "\t|\t" + str(q) + "\t|\t" + str(Conjunction(p, q)) + "\t\t|\t" + str(Disjunction(p, q)) + "\t\t|\t" + str(Conditional(p, q)) + "\t\t|\t" + str(Biconditional(p, q)) + "\t\t|\t" + str(Negation(p)) + "\t\t|")
            printFrame()

##################
def printSingleHeader(s):
    printFrame()
    print("|\tp\t|\tq\t|\t%s" % s)
    printFrame()
    
def printDisjunctionHeader():
    printFrame()
    print("|\tp\t|\tq\t|\tDisjunction\t|")
    printFrame()
    
def printWholeHeader():
    printFrame()
    print("|\tp\t|\tq\t|\tConjunction\t|\tDisjunction\t|\tConditional\t|\tBiconditional\t|\tNegation\t|")
    printFrame()
    
def printFrame():
    print("-" * 65)

def printTest():
    printFrame()
    print("|%s" + str(Conjunction(True, False, True)) + "\t|")
main()