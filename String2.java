public class String2 {
    public static void main(String[] args) {
        //String builder
        // StringBuilder sb= new StringBuilder("Vikas");
        // System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));


        // //set char at index 0
        // sb.setCharAt(0,'b');//setCharAt(index no.,character to be set);
        // System.out.println(sb);

        // //insert keyword
        // sb.insert(2,'o');
        // System.out.println(sb);


        // //delete keyword
        // sb.delete(0,3);
        // System.out.println(sb);

        // //append keyword
        // StringBuilder sB=new StringBuilder("v");
        // sB.append("i");//for string we write str = str+ "e";
        // sB.append("k");//str =str + "l";
        // sB.append("a");//str =str + "a";
        // sB.append("s");//str = str + "s"; but in string it take much time because of memory allocation many times as we insert new letter
        // System.out.println(sB);
        // System.out.println("length of the string builder :");
        // System.out.println(sB.length());


        //***IMP*** reverse an string by string builder
        StringBuilder sb= new StringBuilder("Manchaster");
         System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){ 
            int front=i;
            int back=sb.length()-1-i;//here 10-1-0 = 9;
            
            char frontChar=sb.charAt(front);
            char backChar= sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);

    }
}
