import java.util.*;
import java.io.*;

/**
 * A testing and timing class for the IntegerList class
 * @author Evan Vu
 *
 */
public class ExperimentController {
    public static void main(String[] args) {
        ExperimentController tester = new ExperimentController();
        tester.dataOut();
    }
    
    /**
     * Testing and timing the performance of transferring from a queue to a stack
     * @return The runtime for the transfer
     * @param the number of items wanted and a random seed
     */
    public long queueToStack(int numberOfItems, int seed){
        Random rand = new Random(seed);
        MyStack<Integer> expStack = new MyStack<Integer>();
        MyQueue<Integer> expQueue = new MyQueue<Integer>();
        int i=0;
        long startTime = System.nanoTime();
        while(i<numberOfItems) {
            expStack.push(rand.nextInt(100-0)+0);
            i++;
        }
        for (Integer item:expStack){
            expQueue.add(item);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Testing and timing the performance of transferring from a stack to a queue
     * @return The runtime for transfer
     * @param the number of items wanted and a random seed
     */
    public long stackToQueue(int numberOfItems, int seed){
        Random rand = new Random(seed);
        MyStack<Integer> expStack = new MyStack<Integer>();
        MyQueue<Integer> expQueue = new MyQueue<Integer>();
        int i=0;
        long startTime = System.nanoTime();
        while(i<numberOfItems) {
            expQueue.add(rand.nextInt(100-0)+0);
            i++;
        }
        for (Integer item:expStack){
            expStack.push(item);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    
    /**
     * Testing and timing the performance of adding for stack
     * @return The runtime for adding
     * @param the number of items wanted and a random seed
     */
    public long timeAddStack(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        MyStack<Integer> timeRun = new MyStack<Integer>();
        int i=0;
        long startTime = System.nanoTime();
        while(i<numberOfItems) {
            timeRun.push(rand.nextInt(100-0)+0);
            i++;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Testing and timing the performance of adding for queue
     * @return The runtime for adding
     * @param the number of items wanted and a random seed
     */
    public long timeAddQueue(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        if (seed==0) return 0;
        MyQueue<Integer> timeRun = new MyQueue<Integer>();
        int i=0;
        long startTime = System.nanoTime();
        while(i<numberOfItems) {
            timeRun.add(rand.nextInt(100-0)+0);
            i++;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Testing and timing the performance of removing for queue
     * @return The runtime for adding
     * @param the number of items wanted and a random seed
     * 
     */
    public long timeRemoveQueue(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        if (seed==0) return 0;
        MyQueue<Integer> timeRun = new MyQueue<Integer>();
        int i=0;
        while(i<numberOfItems) {
            timeRun.add(rand.nextInt(100-0)+0);
            i++;
        }
        long startTime = System.nanoTime();
        while(i<numberOfItems) {
            timeRun.remove();
            i++;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Testing and timing the performance of removing for stack
     * @return The runtime for adding
     * @param the number of items wanted and a random seed
     */
    public long timeRemoveStack(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        if (seed==0) return 0;
        MyStack<Integer> timeRun = new MyStack<Integer>();
        int i=0;        
        while(i<numberOfItems) {
            timeRun.push(rand.nextInt(100-0)+0);
            i++;
        }
        long startTime = System.nanoTime();
        while(i<numberOfItems) {
            timeRun.pop();
            i++;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Testing and timing the performance of removing for stack
     * @return The runtime for adding
     * @param the number of items wanted and a random seed
     */
    public long timeSearchStack(int numberOfItems, int seed) {
        Random rand = new Random(seed);
        if (seed==0) return 0;
        MyStack<Integer> timeRun = new MyStack<Integer>();
        int i=0;
        while(i<numberOfItems) {
            timeRun.push(rand.nextInt(100-0)+0);
            i++;
        }
        long startTime = System.nanoTime();
        timeRun.search(rand.nextInt(100-0)+0);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    /**
     * Writing results on to a text file for data analysis
     * @return an output file for data analysis
     */
    public void dataOut(){
        long addStack, addQueue, removeStack, removeQueue, searchStack;
        PrintWriter writer = null;
        PrintWriter writer1 = null;
        try{
            writer = new PrintWriter(new File("output.txt"));
            writer1 = new PrintWriter(new File("output2.txt"));
            for(int i=0; i<=100; i+=5){
                addStack = timeAddStack(i, (int) System.nanoTime());
                addQueue = timeAddQueue(i, (int) System.nanoTime());
                removeStack = timeRemoveStack(i, (int) System.nanoTime());
                removeQueue = timeRemoveQueue(i, (int) System.nanoTime());
                searchStack = timeSearchStack(i, (int) System.nanoTime());
                writer.println(addStack + " " + addQueue + " " + removeStack + " " + removeQueue + " " + searchStack);
                writer1.println(queueToStack(i, (int) System.nanoTime()) + " " + stackToQueue(i, (int) System.nanoTime()));
            }
            writer.close();
            writer1.close();
        }
        catch(Exception e){
            System.out.println("Exception ocurred: " + e);
        }
          
    }
}