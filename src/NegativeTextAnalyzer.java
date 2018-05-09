class NegativeTextAnalyzer extends KeywordAnalyzer {

    // NegativeTextAnalyzer will be initialized by default constructor.
    // default constructor will be created by compiler.

    private String[] keywords = {":(", "=(", ":|"};


    @Override
    protected String[] getKeywords() {  // from abstract class KeywordAnalyzer
        return keywords;
    }

    @Override
    protected Label getLabel(String inputString) {  // from abstract class KeywordAnalyzer
        for (String key : keywords) {
            if (inputString.contains(key)) {
                return Label.NEGATIVE_TEXT;
            }
        }
        return Label.OK;
    }
}




