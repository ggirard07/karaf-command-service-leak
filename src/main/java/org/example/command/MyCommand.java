package org.example.command;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.example.MyService;

@Command(scope = "my", name = "cmd", description = "my test command")
@Service
public class MyCommand implements Action {

    @Reference
    MyService myService;

    @Override
    public Object execute() {
        System.out.println("MyService ref [" + myService.hashCode() + "]");
        return null;
    }
}
