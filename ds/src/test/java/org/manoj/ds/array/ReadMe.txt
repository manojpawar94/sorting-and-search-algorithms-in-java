1. Array Store in the continuous memory location in memory
2. We should specify the memory at time of initialization
3. It has static memory size, 
4. Every element/item occupies same amount of space in memory 
5. When we store the objects like String in the Array, in actaul it stores the object reference instead of the actual object in array
6. If the index of the array element is known, then time to retrieve any element of the array will be same; no matter the size of the array 
7. The time complexity for retrieve the element for best case is O(1) i.e. constant time complexity. It required 3 steps to retrive the element as follow
    step 1: get address of first element
    step 2: multiple address of first element with index of element wanted to retrieve
    step 3: add result of step 2 to address of first element and retrieve element
8. The time complexity for retrieve the element for wrost case is O(n) i.e. linear time complexity, when has element value instead of index 