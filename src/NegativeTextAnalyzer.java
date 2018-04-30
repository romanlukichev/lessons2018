class NegativeTextAnalyzer extends KeywordAnalyzer{

    // NegativeTextAnalyzer will be initialized by default constructor.
    // default constructor will be created by compiler.

    private String[] keywords = { ":(" ,  "=(" , ":|" };


    @Override
    protected String[] getKeywords() {  // from abstract class KeywordAnalyzer
        return keywords;
    }

    @Override
    protected Label getLabel() {  // from abstract class KeywordAnalyzer
        return Label.NEGATIVE_TEXT;
    }


    @Override
    public Label processText(String text) {
        for ( String key: keywords ) {    //?? Реализуем processText таким образом, чтобы он зависел только от getKeywords и getLabel.
            if(text.contains(key)){
                return Label.NEGATIVE_TEXT; // or return getLabel() ?
            }
        }
        return Label.OK;
    }



}