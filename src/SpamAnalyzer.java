class SpamAnalyzer extends KeywordAnalyzer{

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() { // from abstract class KeywordAnalyzer
        return keywords;
    }

    @Override
    protected Label getLabel() { // from abstract class KeywordAnalyzer
        return Label.SPAM;
    }

    public Label processText(String text){ // from interface TextAnalyzer
        for ( String key: keywords ) {
            if(text.contains(key)){
                return Label.SPAM; // or return getLabel() ?
            }
        }
        return Label.OK;
    }



}