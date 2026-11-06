package com.amazon.clouddrive.cdasdk.dagger.component;

import com.amazon.clouddrive.cdasdk.cdp.CDPUtil;
import com.amazon.clouddrive.cdasdk.dagger.module.ApplicationModule;
import com.amazon.clouddrive.cdasdk.util.Logger;
import com.amazon.clouddrive.cdasdk.util.SystemUtil;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {ApplicationModule.class})
@Singleton
/* loaded from: classes20.dex */
public interface ApplicationComponent {
    CDPUtil getCDPUtil();

    Logger getLogger();

    SystemUtil getSystemUtil();
}
