abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel(String inputString);

    public Label processText(String text) {
        // processText must depend only from getKeywords(); and getLabel(text);
        String[] keywords = getKeywords();
        for (String key : keywords) {
            if (text.contains(key)) {
                return getLabel(text);
            }

        }
        return getLabel(text);
    }



}