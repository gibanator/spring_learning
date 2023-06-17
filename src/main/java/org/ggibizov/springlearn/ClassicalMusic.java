package org.ggibizov.springlearn;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}
    public void onInit(){
        System.out.println("Initializing...");
    }
    public void onDestroy(){
        System.out.println("Destruction...");
    }
    @Override
    public String getSong() {
        return "Concerto in E minor";
    }
}
