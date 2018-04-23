class NegativeTextAnalyzer extends KeywordAnalyzer  implements TextAnalyzer  {

    // NegativeTextAnalyzer will be initialized by default constructor.
    // default constructor will be created by compiler.

    private String[] keywords = { "–:(" ,  "=(" , ":|" };


    @Override
    protected String[] getKeywords() {  // from abstract class KeywordAnalyzer
        return keywords;
    }

    @Override
    protected Label getLabel() {  // from abstract class KeywordAnalyzer
        return Label.NEGATIVE_TEXT;
    }

    public Label processText(String text){ // from interface TextAnalyzer

        for ( String key: keywords ) {
            if(text.contains(key)){
                return Label.NEGATIVE_TEXT; // or return getLabel() ?
            }
        }
        return Label.OK;
    }

}
