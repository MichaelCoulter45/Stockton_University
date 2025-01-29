
def Conjunction(p, q):
    return p and q

def Disjunction(p, q):
    return p or q

def Conditional(p, q):
    return not p or q

def Biconditional(p, q):
    return (not p or q) and (not q or p)


def main():
    print("Conjunction")
    print(Conjunction(True, True))
    print(Conjunction(True, False))
    print(Conjunction(False, True))
    print(Conjunction(False, False))
    print("______________________________________")

    print("Disjunction")
    print(Disjunction(True, True))
    print(Disjunction(True, False))
    print(Disjunction(False, True))
    print(Disjunction(False, False))
    print("_______________________________________")

    print("Conditional")
    print(Conditional(True, True))
    print(Conditional(True, False))
    print(Conditional(False, True))
    print(Conditional(False, False))
    print("________________________________________")

    print("Biconditional")
    print(Biconditional(True, True))
    print(Biconditional(True, False))
    print(Biconditional(False, True))
    print(Biconditional(False, False))
    print("_________________________________________")
    
main()