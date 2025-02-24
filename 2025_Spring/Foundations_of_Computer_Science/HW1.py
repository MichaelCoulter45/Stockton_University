"""Exercise:
Write a Python program that prints the truth table for the expression   not p and(q or r).
The table should contain a row for each possible combination of values for variables p, q and r. 
and columns for the final result as well as each relevant Boolean subexpression. (Hint: You may refer to the lab assignment. )
"""

def table():
    print("\tP\tQ\tR\t\tnot P\t\tQ or R\t\tnot P and (Q or R)")
    print("\t" + "-" * 80)
    # Variables
    for p in [True, False]:
        for q in [True, False]:
            for r in [True, False]:
                print("\t" + str(p) + "\t" + str(q) + "\t" + str(r) + "\t\t" + str(not p) + "\t\t" + str(q or r) + "\t\t" + str((not p) and (q or r)))
    print("\t" + "-" * 80)
    
    
    
    
    
####
def main():
    table()
main()