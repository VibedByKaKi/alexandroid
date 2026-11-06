package com.amazon.deecomms.sharing;

import com.amazon.deecomms.oobe.util.ThemingUpdateUtil;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ShareSheetActivity_MembersInjector implements MembersInjector<ShareSheetActivity> {
    private final Provider<ThemingUpdateUtil> themingUpdateUtilProvider;

    public ShareSheetActivity_MembersInjector(Provider<ThemingUpdateUtil> provider) {
        this.themingUpdateUtilProvider = provider;
    }

    public static MembersInjector<ShareSheetActivity> create(Provider<ThemingUpdateUtil> provider) {
        return new ShareSheetActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.sharing.ShareSheetActivity.themingUpdateUtil")
    public static void injectThemingUpdateUtil(ShareSheetActivity shareSheetActivity, ThemingUpdateUtil themingUpdateUtil) {
        shareSheetActivity.themingUpdateUtil = themingUpdateUtil;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ShareSheetActivity shareSheetActivity) {
        injectThemingUpdateUtil(shareSheetActivity, this.themingUpdateUtilProvider.get());
    }
}
