abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    public Label processText(String text){ // Реализуем processText таким образом, чтобы он зависел только от getKeywords и getLabel.
        getKeywords();             // Label processText(String text) - эта сигнатура находится в интерфейсе TextAnalyzer
        getLabel();
        return Label.OK;
    }  // add here

}