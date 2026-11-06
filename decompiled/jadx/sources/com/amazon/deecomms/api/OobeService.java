package com.amazon.deecomms.api;

import android.app.Activity;
import com.amazon.deecomms.api.navigation.CommsView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface OobeService {
    void cleanUpOobe();

    boolean getCommsOobeJustFinished();

    boolean getSkippedCommsOobe();

    boolean hasSelectedProfile();

    boolean isCommsOoobeCompleted();

    void routeUserToOobe(Activity activity, CommsView commsView);

    void sendOOBECompletionEvent();

    void setCommsOobeInProgress(boolean z);

    void setCommsOobeJustFinished(boolean z);

    void setSkippedCommsOobe(boolean z);

    boolean shouldShowCommsOOBEForUser();
}
