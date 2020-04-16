import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTester {
    /*TEST 1
     *INPUT: {1,2,3}
     * EXPECTED OUTPUT = size:2, height:3, depth to node 3: 2
     * ACTUAL OUTPUT = size:2, height:3, depth to node 3: 2
     *
     * */
    @Test
    public void bstTest1(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{1,2,3});
        t.print();
        assertEquals(3, t.size());
        assertEquals(3,t.height());
        assertEquals(2, t.depth(3));
    }
    /*TEST 2
     *INPUT: {4,2,5,4,7,8,6}
     * EXPECTED OUTPUT = size:6, height:5, depth to node 6: 4
     * ACTUAL OUTPUT = size:7, height:5, depth to node 6: 4
     *
     * */
    @Test
    public void bstTest2(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{4,2,5,4,7,8,6});
        t.print();
        assertEquals(6, t.size()); //failed
        assertEquals(5,t.height());
        assertEquals(4, t.depth(6));
    }
    /*TEST 3
     *INPUT: {5,5,5,5,5}
     * EXPECTED OUTPUT = size:1, height:1, depth to node 5: 0
     * ACTUAL OUTPUT = size:2, height:2, depth to node 5: 1
     *
     * */
    @Test
    public void bstTest3(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{5,5,5,5,5});
        t.print();
        assertEquals(1, t.size()); //failed
        assertEquals(1,t.height());
        assertEquals(0, t.depth(5));
    }
    /*TEST 4
     *INPUT: {-4,-5,8,3,-2,0}
     * EXPECTED OUTPUT = size:6, height:5, depth to node 0: 4
     * ACTUAL OUTPUT = size:6, height:5, depth to node 6: 4
     *
     * */
    @Test
    public void bstTest4(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{-4,-5,8,3,-2,0});
        t.print();
        assertEquals(6, t.size()); //failed
        assertEquals(5,t.height());
        assertEquals(4, t.depth(0));
    }
    /*TEST 5
     *INPUT: {1,2,3}
     * EXPECTED OUTPUT = size:6, height:5, depth to node 6: 4
     * ACTUAL OUTPUT = size:6, height:5, depth to node 6: 4
     *
     * */
    @Test
    public void bstTest5(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{1,2,3});
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(new int[]{1,2,3});
        t.print();
        assertEquals(expected.myValue, t.myValue);
        assertEquals(expected.left.myValue, t.left.myValue);
        assertEquals(expected.right.myValue, t.right.myValue);
    }
    /*TEST 6
     *INPUT: {}
     * EXPECTED OUTPUT = size:6, height:5, depth to node 6: 4
     * ACTUAL OUTPUT = size:6, height:5, depth to node 6: 4
     *
     * */
    @Test
    public void bstTest6(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{-4,5,6,-2,1,8});
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(new int[]{-4,5,6,-2,1,8});
        t.print();
        assertEquals(expected.myValue, t.myValue);
        assertEquals(expected.left.myValue, t.left.myValue);
        assertEquals(expected.right.myValue, t.right.myValue);
    }

}