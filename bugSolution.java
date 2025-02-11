public class MyClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 10;
        
        //Check if the index is within the bounds of the array
        if(index >= 0 && index < arr.length){
            System.out.println(arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}