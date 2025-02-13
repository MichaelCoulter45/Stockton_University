"""   
    Please use both list and set to define functions to implement the following set operations using Python: (1)(2) are required and (3-6) is optional 
    (1) set_union(A, B)
    (2) list_union(A, B)

    (3) set_intersection(A, B)
    (4) set_difference (A, B)
    (5) set_isSubSet (A, B) (to test if set A is a subset of set B)
    (6) isProperSubset (to test if set A is a proper subset of set B)
"""
def main():
    Test01()
    
def set_union(A, B):
    return A.union(B)

def list_union(A, B):
    result = []
    for x in A:
        result = result + list(str(x))
    for x in B:
        result = result + list(str(x))
    return result

def union(A, B):
    result = []
    for x in A:
        if x not in B:
            result = result + list(str(x))
    for x in B:
        result = result + list(str(x))
    return result

def set_intersection(A, B):
    return A.intersection(B)

def set_difference(A, B):
    return A.difference(B)

def set_isSubSet(A, B):
    return A.issubset(B)

def isProperSubset(A, B):
    return A.issubset(B) and A != B


def Test01():
    
    A = {1, 2, 8}
    B = {1, 2, 3, 4, 5}
    print("Set Union: " + str(set_union(A,B)))
    
    A = [1, 2, 8]
    B = [1, 2, 3, 4, 5]
    print("List Union: " + str(list_union(A, B)))
    
    A = [1, 2, 8]
    B = [1, 2, 3, 4, 5]
    print("Union: " + str(union(A, B)))
    
    A = {1, 2, 8}
    B = {1, 2, 3, 4, 5}
    print("Set Intersection: " + str(set_intersection(A, B)))
    
    A = {1, 2, 8}
    B = {1, 2, 3, 4, 5}
    print("Set Difference: " + str(set_difference(A, B)))
    
    A = {1, 2, 8}
    B = {1, 2, 3, 4, 5}
    print("Set isSubset: " + str(set_isSubSet(A, B)))
    
    A = {1, 2, 8}
    B = {1, 2, 3, 4, 5}
    print("Set isProperSubset: " + str(isProperSubset(A, B)))
    
    
main()