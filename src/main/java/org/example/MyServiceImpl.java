package org.example;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.ServiceScope;

@Component(scope = ServiceScope.SINGLETON, immediate = true, service = MyService.class)
public class MyServiceImpl implements MyService {
    @Activate
    void activate() {
        System.out.println("MyService activated");
    }

    @Deactivate
    void deactivate() {
        System.out.println("MyService deactivated");
    }
}
