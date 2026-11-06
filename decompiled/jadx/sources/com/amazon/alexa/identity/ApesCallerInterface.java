package com.amazon.alexa.identity;

import com.amazon.alexa.identity.api.UserProfile;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface ApesCallerInterface {
    String getAlexaTCAcceptanceStatus(String str);

    List<UserProfile> getAllPofiles();

    String getAvatarUri(String str);

    String getPersonId(String str);

    String getProfileJSONStringByPersonId(String str);
}
