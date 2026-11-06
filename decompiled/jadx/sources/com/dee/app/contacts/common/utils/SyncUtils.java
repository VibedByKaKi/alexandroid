package com.dee.app.contacts.common.utils;

import com.dee.app.contacts.common.exceptions.ClientNotSupportedException;
import com.dee.app.contacts.interfaces.models.data.enums.ContactSourceType;
import javax.inject.Inject;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SyncUtils {
    private final String appName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.dee.app.contacts.common.utils.SyncUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dee$app$contacts$common$utils$Client;

        static {
            int[] iArr = new int[Client.values().length];
            $SwitchMap$com$dee$app$contacts$common$utils$Client = iArr;
            try {
                iArr[Client.PhotosApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dee$app$contacts$common$utils$Client[Client.MusicApp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public SyncUtils(@Named("ApplicationName") String str) {
        this.appName = str;
    }

    public Client getClient() {
        return Client.get(this.appName);
    }

    public ContactSourceType getContactSourceTypeForClient() throws ClientNotSupportedException {
        int i = AnonymousClass1.$SwitchMap$com$dee$app$contacts$common$utils$Client[Client.get(this.appName).ordinal()];
        if (i == 1) {
            return ContactSourceType.AmazonPhotos;
        }
        if (i == 2) {
            return ContactSourceType.AmazonMusic;
        }
        throw new ClientNotSupportedException(this.appName);
    }

    public Boolean is2pClient() {
        return (this.appName.isEmpty() || Client.get(this.appName) == Client.AlexaApp) ? Boolean.FALSE : Boolean.TRUE;
    }
}
