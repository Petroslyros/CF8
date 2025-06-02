package gr.aueb.cf.ch16;

public class GenericSpeakingSchool {

    private final ISpeakable speakable;

    //Dependency Injection -- IoC (inversion of Control)
    public GenericSpeakingSchool(ISpeakable speakable){
        this.speakable = speakable;
    }

    public void learnToSpeak(){
        speakable.speak();
    }
}
