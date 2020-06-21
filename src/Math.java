public class Math {

    static int countOccurences(String str, String strFind){
        int count = 0, fromIndex = 0;

        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){

            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;

        }

        return count;

    }



}
