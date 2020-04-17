import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTester {
    /*TEST 1
     *INPUT: {1,2,3}
     * EXPECTED OUTPUT = size:2, height:3, depth to node 3: 2
     * ACTUAL OUTPUT = size:2, height:3, depth to node 3: 2
     *
     *Test case with only positive integers to check the insert, height, and depth methods work correctly*/
    @Test
    public void bstTest1(){
        int[] arr = {1,2,3};
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(arr);
        t.print();
        assertEquals(3, t.size());
        assertEquals(3,t.height());
        assertEquals(2, t.depth(3));

        assertEquals(arr[0], t.myValue);
        assertEquals(arr[1], t.right.myValue);
        assertEquals(arr[2], t.right.right.myValue);
    }
    /*TEST 2
     *INPUT: {4,2,5,4,7,8,6}
     * EXPECTED OUTPUT = size:6, height:5, depth to node 6: 4
     * ACTUAL OUTPUT = size:7, height:5, depth to node 6: 4
     *
     *Test case with a larger array and duplicate elements to check that only one of the same numbers will get added and to see if the order of the nodes is correct*/
    @Test
    public void bstTest2(){
        int[] arr = {4,7,5,4,7,8,6};
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(arr);
        t.print();
        assertEquals(5, t.size()); //failed
        assertEquals(4,t.height());
        assertEquals(3, t.depth(6));

        assertEquals(arr[0], t.myValue);
        assertEquals(arr[1], t.right.myValue);
        assertEquals(arr[2], t.right.left.myValue);
        assertEquals(arr[5], t.right.right.myValue);
        assertEquals(arr[6], t.right.left.right.myValue);
    }
    /*TEST 3
     *INPUT: {5,5,5,5,5}
     * EXPECTED OUTPUT = size:1, height:1, depth to node 5: 0
     * ACTUAL OUTPUT = size:2, height:2, depth to node 5: 1
     *
     *Test case with the same number that checks if the resulting tree will only one node*/
    @Test
    public void bstTest3(){
        int[] arr = {5,5,5,5,5};
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(arr);
        t.print();
        assertEquals(1, t.size()); //failed
        assertEquals(1,t.height());
        assertEquals(0, t.depth(5));

        assertEquals(arr[0], t.myValue);
    }
    /*TEST 4
     *INPUT: {-4,-5,8,3,-2,0}
     * EXPECTED OUTPUT = size:6, height:5, depth to node 0: 4
     * ACTUAL OUTPUT = size:6, height:5, depth to node 6: 4
     *
     *Test case with negative elements*/
    @Test
    public void bstTest4(){
        int[] arr = {-4,-5,8,3,-2,0};
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(arr);
        t.print();
        assertEquals(6, t.size()); //failed
        assertEquals(5,t.height());
        assertEquals(4, t.depth(0));

        assertEquals(arr[0], t.myValue);
        assertEquals(arr[1], t.left.myValue);
        assertEquals(arr[2], t.right.myValue);
        assertEquals(arr[3], t.right.left.myValue);
        assertEquals(arr[4], t.right.left.left.myValue);
        assertEquals(arr[5], t.right.left.left.right.myValue);
    }
    /*TEST 5
     *INPUT: {15,12,17,0,20,14,16}
     * EXPECTED OUTPUT = size:7, height:3, depth to node 16: 2
     * ACTUAL OUTPUT = size:7, height:3, depth to node 16: 2
     *
     *Test case where the height of the subtrees is the same and check that the method returns the appropriate number*/
    @Test
    public void bstTest5() {
        int[] arr = {15,12,17,0,20,14,16};
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(arr);
        t.print();
        assertEquals(7, t.size());
        assertEquals(3, t.height());
        assertEquals(2, t.depth(16));

        assertEquals(arr[0], t.myValue);
        assertEquals(arr[1], t.left.myValue);
        assertEquals(arr[2], t.right.myValue);
        assertEquals(arr[3], t.left.left.myValue);
        assertEquals(arr[4], t.right.right.myValue);
        assertEquals(arr[5], t.left.right.myValue);
        assertEquals(arr[6], t.right.left.myValue);

    }
    /*TEST 5
     *INPUT: {15,12,17,0};
     * EXPECTED OUTPUT = {15,12,17,0,2,3,16}
     * ACTUAL OUTPUT = {15,12,17,0,2,3,16}
     *
     *Test case to check the insert method*/
    @Test
    public void bstTest6(){
        int[] arr = {15,12,17,0};
        int[] expected = {15,12,17,0,2,3,16};
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(arr);
        t.insert(2);
        t.insert(3);
        t.insert(16);

        assertEquals(expected[0], t.myValue);
        assertEquals(expected[1], t.left.myValue);
        assertEquals(expected[2], t.right.myValue);
        assertEquals(expected[3], t.left.left.myValue);
        assertEquals(expected[4], t.left.left.right.myValue);
        assertEquals(expected[5], t.left.left.right.right.myValue);
        assertEquals(expected[6], t.right.left.myValue);

    }

}