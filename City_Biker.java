public class City_Biker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size of array
        int size = sc.nextInt();

        // create an array
        int storeArray[] = new int[size];
        storeArray[0] = sc.nextInt();

        // store sum
        int sum = storeArray[0];
        // store result
        int result = 0;

        // store user input
        for (int i = 1; i < size; i++) {
            storeArray[i] = sc.nextInt();
            sum += storeArray[i];

            if ((sum) > result) {
                result = sum;
            }

            // System.out.println(i+" sum = "+sum +" result = "+result);
        }

        System.out.println(result);

        sc.close();
    }
}
