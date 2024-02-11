package org.dataStruct.array;

public class Array {
    private String[] array;
    private int size;

    public int getSize() {
        return size;
    }

    public Array(){
        this.size = 0;
        this.array = new String[5];
    }
    public Array(int initialSizeVectorInMemory){
        this.size = 0;
        this.array = new String[initialSizeVectorInMemory];
    }


    public void append(String value){
        this.expandArray();
        this.array[this.size] = value;
        this.size++;

    }
    public void append(String value, int position){
        this.expandArray();
        for(int i=this.size; i>position-1; i--){
            String oldValue = this.array[i];
            this.array[i+1] = this.array[i];
        }
        this.array[position] = value;
        this.size++;

    }

    public void expandArray(){
        if(!(this.size < this.array.length)){
            String[] newArray = new String[this.size * 2];
            for(int i = 0; i<this.size; i++) newArray[i] = this.array[i];
            this.array = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder elements = new StringBuilder();
        elements.append("[");
        for(String element : this.array){
            if(element != null){
                elements.append(element);
                elements.append(",");
            }
        }
        elements.append("]");
        return elements.toString();
    }
}
