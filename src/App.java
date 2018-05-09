public class App {
    public static void main(String[] args) {

        String[] spamArray = {"Go" , "Welcome" , "Hello", "Open"};
        SpamAnalyzer mySpamAnalyzer = new SpamAnalyzer(spamArray);

        NegativeTextAnalyzer myNegativeWordsAnalyzer = new NegativeTextAnalyzer();
        // default constructor

        TooLongTextAnalyzer myLongTextAnazyzer = new TooLongTextAnalyzer(30);

        TextAnalyzer[] myAnalyzers = { mySpamAnalyzer ,
                                       myNegativeWordsAnalyzer ,
                                       myLongTextAnazyzer };

        Label result = checkLabels( myAnalyzers ,
                                   "Aert Hello hdghd dbdsdhbsh fg. Djkl dguyie." );
        System.out.println(result.toString());



    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label myLabel = Label.OK;
        for( TextAnalyzer currentAnalyzer: analyzers){
            myLabel = currentAnalyzer.processText(text);
            if( myLabel != Label.OK){
                return myLabel;
            }
        }
        return myLabel;
    }
}