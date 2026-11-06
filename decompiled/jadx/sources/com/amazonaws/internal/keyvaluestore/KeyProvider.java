package com.amazonaws.internal.keyvaluestore;

import java.security.Key;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
interface KeyProvider {
    void deleteKey(String str);

    Key generateKey(String str) throws KeyNotGeneratedException;

    Key retrieveKey(String str) throws KeyNotFoundException;
}
