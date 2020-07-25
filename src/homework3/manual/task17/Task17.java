package homework3.manual.task17;

/*Создать двумерный квадратный массив, и заполнить его «бабочкой»,
т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
 */

public class Task17 {
    public static void main(String[] args) {
        String [][] arr = new String[11][11];
        for (int i = 0; i <= arr.length/2; i++) {               //Fill the top of the array
            for (int j = 0; j<arr[i].length; j++){
                if(j>=i & j<arr[i].length-i) {
                    arr[i][j] = "1";
                }else {
                    arr[i][j] = "0";
                }
            }
        }
        for (int i = arr.length-1; i >= arr.length/2; i--) {    //Fill the bottom of the array
            for (int j = 0; j<arr[i].length; j++){
                if(j<=i & j>=arr[i].length-i-1) {
                    arr[i][j] = "1";
                }else {
                    arr[i][j] = "0";
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {                  //Print the array
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
