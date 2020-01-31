package io;
//  Demonstrates standard I/O redirection.

import net.mindview.util.OSExecute;

public class OSExecuteDemo {
    public static void main(String[] args) {
        //OSExecute.command("cd src");
       // OSExecute.command("cd io");
        OSExecute.command("javap io.OSExecuteDemo");
    }
}
