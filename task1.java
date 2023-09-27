 class MyClass {
  public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
        result ^= num;
    }
    return result;
}

    public static void main(String[] args) {
    int[] numbers = {2, 2, 1, 1, 3};
    MyClass myobj =  new MyClass();
int single = myobj.singleNumber(numbers);
System.out.println("The single number is: " + single); 
    }
}