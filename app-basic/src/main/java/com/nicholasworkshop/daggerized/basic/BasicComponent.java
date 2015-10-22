package com.nicholasworkshop.daggerized.basic;

import com.nicholasworkshop.library.utility.UtilityModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        BasicModule.class,
        UtilityModule.class
})
public interface BasicComponent {

    void inject(BasicActivity mainActivity);
}
