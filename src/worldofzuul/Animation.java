package worldofzuul;

import java.util.*;
import java.util.function.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Animation {

    List<Function<Void,Void>> actions;

    Animation() {
        actions = new ArrayList<Function<Void,Void>>();
    }

    void addAction(Function<Void, Void> func) {
        actions.add(func);
    }

    void playAnimation() {
        for (Function<Void,Void> function : actions) {
            function.apply(null);
        }
    }

    public static void introAnimation(String path) {
        
    }

    public static void outroAnimation(String path) {
        
    }
}
