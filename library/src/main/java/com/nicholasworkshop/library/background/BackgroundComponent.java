package com.nicholasworkshop.library.background;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by nickwph on 10/21/15.
 */
@Singleton
@Component(modules = BackgroundModule.class)
public interface BackgroundComponent {

    void inject(BackgroundService libraryService);

    interface ModuleProvider {
        BackgroundModule getBackgroundModule();
    }
}
