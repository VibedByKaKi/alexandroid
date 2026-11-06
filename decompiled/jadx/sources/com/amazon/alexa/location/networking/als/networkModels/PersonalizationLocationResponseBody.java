package com.amazon.alexa.location.networking.als.networkModels;

import com.amazon.alexa.location.networking.als.models.PersonalizationLocationItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class PersonalizationLocationResponseBody {
    private List<PersonalizationLocationItem> location;

    public PersonalizationLocationResponseBody(List<PersonalizationLocationItem> list) {
        new ArrayList();
        this.location = list;
    }

    public List<PersonalizationLocationItem> getPersonalizationLocationItems() {
        return this.location;
    }
}
