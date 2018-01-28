import java.math.BigInteger;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        String[] roles = { "Городничий" , "Аммос Федорович" , "Артемий Филиппович" , "Лука Лукич" , "Роман" , "Лука"  };
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.'" ,
                "Аммос Федорович: Как ревизор?" ,
                "Артемий Филиппович: Как ревизор?" ,
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем." ,
                "Аммос Федорович: Вот те на!" ,
                "Лука: Мы угостим ревизора чаем!",
                "Артемий Филиппович: Вот не было заботы, так подай!" ,
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        printWholeBook( roles , textLines );
    }

    public static void printWholeBook( String[] roles , String[] textLines ){
        for (String role: roles ) {
            //System.out.println("==============================================");
            System.out.println( role + ":" );

            for ( int i=0; i<textLines.length; i++){
                if( role.equals( textLines[i].split(":")[0]) )
                    System.out.println(
                                      i+1 + ") "
                                    + textLines[i].split(":")[1]
                    );
                // each Sring will be split into two-dimensional array by ":" character .
            }
//                we could have used for each loop here
//                for ( String textLine: textLines){
//                if( role.equals( textLine.split(":")[0]) )
//                    System.out.println( textLine.split(":")[1] );
//                //Because each String will be split into two-dimensional array by ":" character .
//            }

        }

    }


}
