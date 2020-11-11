import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class demo {
    public static void main(String [] args) {
        int[] a = {2,5,3,6,1,};
        for(int i=9;i>0;i--) {
            for(int j = i; j<=i&&j>0;j--) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
        nine();
        System.out.println(Arrays.toString(a));
        demo(a);
        System.out.println(Arrays.toString(a));
        test();
        fun();
    }
    public static void nine(){
        for (int i=1;i<=9;i++){
            for (int j=1; j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    public static void demo(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]<arr[j+1]){
                    int temmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j +1]=temmp;
                }
            }
        }
    }
    public  static void test(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String date ;
        try {
            date = dateFormat.format(new SimpleDateFormat("yyyyMMdd").parse("20200121"));
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void fun() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日");
    String newDate;
    try {
        newDate = sdf.format(new SimpleDateFormat("yyyyMMdd") .parse("20121115"));
        System.out.println(newDate);
    } catch (ParseException e) {
        e.printStackTrace();
    } }
}

