package guiswing.fridayapr26.comprehensive;

import java.util.ArrayList;

public class Story {
    private ArrayList<String> sentences;
    public Story() {
        sentences = new ArrayList<String>();
    }
    public Story(ArrayList<String> sentences) {
        setSentences(sentences);
    }
    public void addSentence(String sentence) {
        sentences.add(sentence);
    }
    public ArrayList<String> getSentences() {
    	//is this a correct get method?
    	ArrayList<String> copy = new ArrayList<String>();
    	copy = (ArrayList<String>) sentences.clone();
        return copy;
    }
    public void setSentences(ArrayList<String> sentences) {
        this.sentences = sentences;
    }
    @Override
    public String toString() {
        String result = "";
        for (String sentence : sentences) {
            result = result + sentence + "\n";
        }
        return result.trim();
    }
    public void clearSentences() {
        sentences.clear();
    }
}

