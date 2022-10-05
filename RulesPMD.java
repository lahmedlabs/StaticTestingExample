package pmdTutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.lang.*;


public class RulesPMD {

	public void doSomething() {
	    try 
	    {
	        FileInputStream fis = new FileInputStream("/tmp/bugger");
	    }
	    catch (IOException ioe)
	    {
	        //
	    }
	}
	
    void barIf(int x) {
        if (x == 1) {
            //
        }
    }
    
    void barWhile(int a, int b) {
        while (a == b) {
            //
        }
    }
    public void barTryCatch() {
        try 
        {
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public String convert(int x) {
        String foo = new Integer(x).toString();
        return foo;
    }
    public void doit() {
        ;
        System.out.println("look at the extra semicolon");;
    }
    

	public void doSomethingWhile() {
		int x = 0;
	    while (true)
	        x++;
	}
    boolean barReturn() {
        return (true);
    }
    
    private boolean bar = (isFoo() == true);
    public boolean isFoo() {
        return false;
    }
    public void barSwitch() {
        int x = 2;
        switch (x) {
            case 2:
            int j = 8;
        }
    }
    private void fooReassingParam(String bar) {
        bar = "something else";
    }
    void fooEqualsNull() {
        String x = "foo";
        if (x.equals(null)) {
            doSomething();
        }
    }
    
    private void setUpDate() {
	  SimpleDateFormat sdf = new SimpleDateFormat("pattern");
    }
    
    public void barInvalidPrefix(String m_baz) {
        int m_boz = 42;
      }
    public void barArrayCopy() {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i=0;i<10;i++) {
            b[i]=a[i];
        }
    }
    public void barException() throws Exception {
        throw new Exception();
    }
    private void barNullPoineterException() {
        throw new NullPointerException();
    }
    
    private String stringToString() {
    	String bar = new String("bar");
    	
        bar = "howdy";
        return bar.toString();
    }
    public String convertWithValueOf(int i) {
        String s;
        s = "a" + String.valueOf(i);
        return s;
    }
    
    private void fooUnused() {} // unused
    private void barUnused(String howdy) {
    // howdy is not used
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
