package com.amazon.tarazed.appinfo.sessioninfo;

import com.amazon.tarazed.type.ProfileType;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ&\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/amazon/tarazed/appinfo/sessioninfo/SessionInfoSender;", "", "sendSessionInfo", "", "voiceViewState", "", "remoteType", "", "activeProfileType", "Lcom/amazon/tarazed/type/ProfileType;", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SessionInfoSender {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String IGNORED_DEFAULT_REMOTE_TYPE = "";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amazon/tarazed/appinfo/sessioninfo/SessionInfoSender$Companion;", "", "()V", "IGNORED_DEFAULT_REMOTE_TYPE", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String IGNORED_DEFAULT_REMOTE_TYPE = "";

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void sendSessionInfo$default(SessionInfoSender sessionInfoSender, boolean z, String str, ProfileType profileType, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: sendSessionInfo");
                return;
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                profileType = ProfileType.UNKNOWN;
            }
            sessionInfoSender.sendSessionInfo(z, str, profileType);
        }
    }

    void sendSessionInfo(boolean voiceViewState, @NotNull String remoteType, @NotNull ProfileType activeProfileType);
}
