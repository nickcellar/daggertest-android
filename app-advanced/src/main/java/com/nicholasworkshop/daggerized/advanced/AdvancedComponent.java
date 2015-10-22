package com.nicholasworkshop.daggerized.advanced;

import com.nicholasworkshop.library.utility.UtilityModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AdvancedModule.class,
        UtilityModule.class
})
public interface AdvancedComponent {

    void inject(AdvancedActivity mainActivity);
}
