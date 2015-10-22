package com.nicholasworkshop.library.sdk;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by nickwph on 10/21/15.
 */
@Singleton
@Component(modules = SdkModule.class)
public interface SdkComponent {

    void inject(Sdk sdk);
}
