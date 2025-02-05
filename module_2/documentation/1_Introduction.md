Dynamic Connectivity Problem

    They're going to have a set of N objects. Doesn't really matter what they are.
    We're going to use the numbers, zero through N to model our objects. And then,
    we have the idea of a connection between two objects. And, we'll, postulate that
    there's going to be a command that says, connect two objects. Given two objects, 
    provide a connection between them. And then key part of the problem is find query
    or the connected query, which just asks, is there a path connecting the two objects.

Solutions:

    - Quick Find
    - Quick Union

Quick Find

    Data Structure:
        - Integer array id[] of size N
        - Interpretation: p and q are connected iff they have the same id.



