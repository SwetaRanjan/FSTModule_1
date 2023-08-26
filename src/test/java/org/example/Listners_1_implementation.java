package org.example;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_1_implementation implements ITestListener {

    public void onSuccess(ITestResult result){
        System.out.println("success : " + result.getName());
    }
    public void onFailure(ITestResult result){
        System.out.println("failure : " + result.getName());
    }
    public void onSkip(ITestResult result){
        System.out.println("skipping : " + result.getName());
    }
}
