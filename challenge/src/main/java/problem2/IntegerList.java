package problem2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntegerList
{
    int[] list; //values in the list
    private int listSize;
    private int capacity;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        listSize=size;
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
            capacity++;
        }

    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //create an array of double the size whenever the prev array is full
    public void increaseSize(){
        int doubledSize=2*listSize;
        int[] doubleList= Arrays.copyOf(list, doubledSize);
        list=doubleList;
    }

    //add an element to the array
    public void addElement(int newVal){
        if (capacity==listSize){
            increaseSize();
            for (int i=listSize; i<list.length; i++){
                if (list[i]==0){ //we consider the list doesn't contain 0 as a value but just as a placeholder
                    list[i]=newVal;
                    capacity++;
                    return;
                }
            }
        }
        else {
            for (int i=0; i<listSize; i++){
                if (list[i]==0){ //we consider the list doesn't contain 0 as a value but just as a placeholder
                    list[i]=newVal;
                    capacity++;
                    return;
                }
            }
        }
    }

    //remove an element from the array by shifting elements after to fill up the space
    public void removeFirst(int newVal){
        int indxOfremovedElem=-1;
        for (int i=0; i<list.length; i++){
            if (list[i]==newVal){
                indxOfremovedElem=i;
                break;
            }
        }
        if (indxOfremovedElem==-1){
            return; //because the element wasn't found in the list
        }
        for (int j=indxOfremovedElem; j<list.length-1; j++){
            list[j]=list[j+1];
        }
        list[capacity-1]=0;
        capacity--;
    }

    //remove all the occurences of a value
    public void removeAll(int newVal){
        for (int i=0; i<list.length; i++){
            removeFirst(newVal);
        }
    }



}
