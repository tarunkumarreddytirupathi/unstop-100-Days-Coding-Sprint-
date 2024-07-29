import java.util.*;

class Main {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);

		//size
		int size=scanner.nextInt();

		
//eliminate newline left-over 
		scanner.nextLine();
		//array string
		String arr[]=new String[size];

        

        

		//store input
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextLine();
		}

//position input (number)integer
        int count=scanner.nextInt();

            for (int i = 0; i < arr.length; i++) {
				boolean unique=true;
				for (int j = 0; j < arr.length; j++) {
					
					if (i!=j ) {
						// System.out.println(arr[i]+" "+arr[j]);
						boolean isEqual = arr[i].equals(arr[j]); 
						if (isEqual) {
							// System.out.println("out");
							unique=false;
							break;
						}
					}
				}
			if (unique) {
				if(count==1){
                    System.out.println(arr[i]);
                }
                --count;
			}
			}
	scanner.close();
    }
}