# Function to check universal quantification (∀)
def main():
    Test01()
    
def for_all(data, condition):
    """
    Check if the condition holds for all elements in the dataset.
    :param data: List of integers
    :param condition: A function that takes an integer and returns a boolean
    :return: True if the condition holds for all elements, otherwise False
    """
    
    """
    # Your code here
    for i in data:
        if not condition(i):
            return False
        break
    return True
    """
    return all(condition(i) for i in data)

# Function to check existential quantification (∃)
def exists(data, condition):
    """
    Check if the condition holds for at least one element in the dataset.
    :param data: List of integers
    :param condition: A function that takes an integer and returns a boolean
    :return: True if the condition holds for at least one element, otherwise False
    """
    
    """
    # Your code here
    for i in data:
        if condition(i):
            return True
    return False
    """
    return any(condition(i) for i in data)


# Check if a number is divisible by 5
def is_divisible_by_5(x):
    return x % 5 == 0

# Example conditions
def is_even(x):
    return x % 2 == 0

def is_positive(x):
    return x > 0

def Test01():
    # Test datasets
    dataset1 = [2, 4, 6, 8, 10]  # All even numbers
    dataset2 = [1, 3, 5, 7, 8]   # Mostly odd numbers, but one even
    dataset3 = [-1, -2, -3, -4]  # All negative numbers
    dataset4 = [10, 20, 30, 41]  # Mostly even numbers, but one odd
    
    # Test cases
    print("Universal Quantification Tests:")
    print(for_all(dataset1, is_even))  # Expected: True
    print(for_all(dataset2, is_even))  # Expected: False
    print(for_all(dataset3, is_positive))  # Expected: False
    
    print("\nExistential Quantification Tests:")
    print(exists(dataset2, is_even))  # Expected: True
    print(exists(dataset3, is_positive))  # Expected: False
    print(exists(dataset4, is_even))  # Expected: True

main()