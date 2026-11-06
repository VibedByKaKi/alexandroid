package com.dee.app.sync.dagger;

import com.dee.app.contacts.common.dagger.ContactsCoreComponent;
import com.dee.app.contacts.common.dagger.modules.ContactsCommonModule;
import com.dee.app.contacts.interfaces.scopes.ContactsCustomScope;
import com.dee.app.sync.core.ContactsSyncManager;
import dagger.Component;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(dependencies = {ContactsCoreComponent.class}, modules = {ContactsCommonModule.class})
@ContactsCustomScope
/* loaded from: classes6.dex */
public interface ContactsSyncComponent {
    ContactsSyncManager getContactsSyncManager();
}
