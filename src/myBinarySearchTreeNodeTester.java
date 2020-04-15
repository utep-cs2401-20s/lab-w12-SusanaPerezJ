import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTester {
    /*TEST 1
     *INPUT: {1,2,3}
     * EXPECTED OUTPUT = {1,2,3}
     * ACTUAL OUTPUT = {}
     *
     * */
    @Test
    public void bstTest1(){
        int[] a = {1,2,3};
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{1,2,3});
        t.print();
        assertEquals(3, t.size());

    }
    /*TEST 2
     *INPUT: {}
     * EXPECTED OUTPUT = {}
     * ACTUAL OUTPUT = {}
     *
     * */
    @Test
    public void bstTest2(){

    }
    /*TEST 3
     *INPUT: {}
     * EXPECTED OUTPUT = {}
     * ACTUAL OUTPUT = {}
     *
     * */
    @Test
    public void bstTest3(){

    }
    /*TEST 4
     *INPUT: {}
     * EXPECTED OUTPUT = {}
     * ACTUAL OUTPUT = {}
     *
     * */
    @Test
    public void bstTest4(){

    }
    /*TEST 5
     *INPUT: {}
     * EXPECTED OUTPUT = {}
     * ACTUAL OUTPUT = {}
     *
     * */
    @Test
    public void bstTest5(){

    }
    /*TEST 6
     *INPUT: {}
     * EXPECTED OUTPUT = {}
     * ACTUAL OUTPUT = {}
     *
     * */
    @Test
    public void bstTest6(){

    }

}