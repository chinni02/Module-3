public class javapBytecode {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println(add(5, 3));
    }
}



// **compile**
// javac BytecodeExample.java

// **Inspect**
// javap -c BytecodeExample

//  ========Decompile a Class File=======

// Compile the BytecodeExample.java from previous exercise

// Use JD-GUI or CFR to decompile the BytecodeExample.class file

// Compare the decompiled source with originals