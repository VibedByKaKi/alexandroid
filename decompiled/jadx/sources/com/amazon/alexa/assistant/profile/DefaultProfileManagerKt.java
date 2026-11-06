package com.amazon.alexa.assistant.profile;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\r"}, d2 = {"apesFailureReason", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "", "refusedForWantOfCookies", "", "Lkotlin/Result;", "(Ljava/lang/Object;)Z", "snapshotRow", "Lcom/amazon/alexa/assistant/profile/ProfileQueryResult;", "personId", "snapshot", "Lcom/amazon/alexa/assistant/profile/AccountSnapshot;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultProfileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultProfileManager.kt\ncom/amazon/alexa/assistant/profile/DefaultProfileManagerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,606:1\n1#2:607\n295#3,2:608\n*S KotlinDebug\n*F\n+ 1 DefaultProfileManager.kt\ncom/amazon/alexa/assistant/profile/DefaultProfileManagerKt\n*L\n605#1:608,2\n*E\n"})
/* loaded from: classes15.dex */
public final class DefaultProfileManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String apesFailureReason(Throwable th) {
        if (th instanceof ApesErrorCodeException) {
            return ((ApesErrorCodeException) th).getErrorCode();
        }
        if (th != null) {
            return th.getClass().getSimpleName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refusedForWantOfCookies(Object obj) {
        return Result.m25297exceptionOrNullimpl(obj) instanceof MissingAuthCookiesException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileQueryResult snapshotRow(String str, AccountSnapshot accountSnapshot) {
        List<ProfileQueryResult> profiles;
        Object obj = null;
        if (accountSnapshot == null || (profiles = accountSnapshot.getProfiles()) == null) {
            return null;
        }
        Iterator<T> it2 = profiles.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.areEqual(((ProfileQueryResult) next).getPersonId(), str)) {
                obj = next;
                break;
            }
        }
        return (ProfileQueryResult) obj;
    }
}
