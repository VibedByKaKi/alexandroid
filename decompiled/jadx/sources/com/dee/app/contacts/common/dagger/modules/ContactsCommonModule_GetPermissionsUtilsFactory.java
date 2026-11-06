package com.dee.app.contacts.common.dagger.modules;

import android.content.Context;
import com.dee.app.contacts.common.utils.ActivityLifecycleUtil;
import com.dee.app.contacts.common.utils.PermissionsUtils;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ContactsCommonModule_GetPermissionsUtilsFactory implements Factory<PermissionsUtils> {
    private final Provider<ActivityLifecycleUtil> activityLifecycleUtilProvider;
    private final Provider<Context> contextProvider;
    private final ContactsCommonModule module;

    public ContactsCommonModule_GetPermissionsUtilsFactory(ContactsCommonModule contactsCommonModule, Provider<ActivityLifecycleUtil> provider, Provider<Context> provider2) {
        this.module = contactsCommonModule;
        this.activityLifecycleUtilProvider = provider;
        this.contextProvider = provider2;
    }

    public static ContactsCommonModule_GetPermissionsUtilsFactory create(ContactsCommonModule contactsCommonModule, Provider<ActivityLifecycleUtil> provider, Provider<Context> provider2) {
        return new ContactsCommonModule_GetPermissionsUtilsFactory(contactsCommonModule, provider, provider2);
    }

    public static PermissionsUtils getPermissionsUtils(ContactsCommonModule contactsCommonModule, ActivityLifecycleUtil activityLifecycleUtil, Context context) {
        return (PermissionsUtils) Preconditions.checkNotNullFromProvides(contactsCommonModule.getPermissionsUtils(activityLifecycleUtil, context));
    }

    @Override // javax.inject.Provider
    public PermissionsUtils get() {
        return getPermissionsUtils(this.module, this.activityLifecycleUtilProvider.get(), this.contextProvider.get());
    }
}
