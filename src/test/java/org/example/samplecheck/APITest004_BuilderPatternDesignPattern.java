package org.example.samplecheck;

public class APITesting003_NoDesignPattern {
    public APITesting003_NoDesignPattern step1(){
        System.out.println("Step 1 is statrted");
        System.out.println("Step 1 is done");
        return this;
    }
    public APITesting003_NoDesignPattern step2() {
        System.out.println("Step 2 is statrted");
        System.out.println("Step 2 is done");
        return this;
    }
    public APITesting003_NoDesignPattern step3() {
        System.out.println("Step 3 is statrted");
        System.out.println("Step 3 is done");
        return this;
    }
    public static void main(String[] args){
        APITesting003_NoDesignPattern bp = new APITesting003_NoDesignPattern();
        bp.step1().step2().step3("Shweta");


    }
}
