package neuepacken;

public class Array {
    private int[] items;
    private int count;
    public Array(int length) {
       items = new int[length];

    }

    public void insert(int item){
        if(items.length == count){
            int[] navin = new int[count*2];
            for (int i = 0; i<count;i++)
                navin[i] = items[i];
            items = navin;
            }
        items[count++] = item;
        }

    public void removeAt(int index){
        if(index<0 || index>=count) {
            System.out.println("Dafuq's up with the index");
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;

    }

    public int indexOf(int item){
        for (int i = 0; i < count; i++) {
            if (items[i] == item){
                return i;
            }

        }
        return -1;

    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]+" ");
        }
        return;
    }
}
